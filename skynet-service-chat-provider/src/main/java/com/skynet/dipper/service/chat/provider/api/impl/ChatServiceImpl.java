package com.skynet.dipper.service.chat.provider.api.impl;


import com.skynet.dipper.commons.constant.RedisConst;
import com.skynet.dipper.commons.domain.Friend;
import com.skynet.dipper.commons.domain.FriendType;
import com.skynet.dipper.commons.domain.GroupUser;
import com.skynet.dipper.commons.domain.TGroup;
import com.skynet.dipper.commons.domain.TUser;
import com.skynet.dipper.commons.grpc.chat.DubboChatServiceGrpc;
import com.skynet.dipper.commons.grpc.chat.MVData;
import com.skynet.dipper.commons.grpc.chat.MVFriend;
import com.skynet.dipper.commons.grpc.chat.MVGroup;
import com.skynet.dipper.commons.grpc.chat.MVInit;
import com.skynet.dipper.commons.grpc.chat.MVUser;
import com.skynet.dipper.commons.grpc.chat.UserId;
import com.skynet.dipper.commons.grpc.redis.DubboRedisServiceGrpc;
import com.skynet.dipper.commons.grpc.redis.IsOK;
import com.skynet.dipper.commons.grpc.redis.RKey;
import com.skynet.dipper.commons.grpc.redis.RPair;
import com.skynet.dipper.commons.mapper.FriendMapper;
import com.skynet.dipper.commons.mapper.FriendTypeMapper;
import com.skynet.dipper.commons.mapper.GroupUserMapper;
import com.skynet.dipper.commons.mapper.TGroupMapper;
import com.skynet.dipper.commons.mapper.TUserMapper;

import org.apache.dubbo.common.utils.CollectionUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import io.grpc.stub.StreamObserver;
import tk.mybatis.mapper.entity.Example;

@Service(version = "${services.versions.chat.v1}", interfaceClass = DubboChatServiceGrpc.IChatService.class)
public class ChatServiceImpl extends DubboChatServiceGrpc.ChatServiceImplBase {

    @Value("${image.server}")
    private String imageServer;

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private FriendMapper friendMapper;

    @Autowired
    private TGroupMapper groupMapper;

    @Autowired
    private GroupUserMapper groupUserMapper;

    @Autowired
    private FriendTypeMapper friendTypeMapper;

    @Reference(version = "${services.versions.redis.v1}", protocol = "grpc")
    private DubboRedisServiceGrpc.IRedisService redisService;

    @Override
    public void init(UserId request, StreamObserver<MVInit> responseObserver) {
        int userId = request.getId();
        System.out.println("userId:"+userId);
        TUser tUser = userMapper.selectByPrimaryKey(userId);
        System.out.println("tuser:"+tUser);
        MVInit.Builder initBuilder = MVInit.newBuilder();
        MVData.Builder dataBuilder = MVData.newBuilder();
        MVUser.Builder userBuilder = MVUser.newBuilder();
        userBuilder.setId(tUser.getId());
        userBuilder.setAvatar(tUser.getAvatar() == null ? imageServer+"undefiend" : imageServer+tUser.getAvatar());
        userBuilder.setSign(tUser.getSign());
        userBuilder.setUsername(tUser.getUserName());
        userBuilder.setStatus("online");
        dataBuilder.setMine(userBuilder.build());
        String redisKey = userId + RedisConst.USER_STATUS;
        redisService.set(RPair.newBuilder().setKey(redisKey).setValue(RedisConst.STATUS_ONLINE).build());
        Example example = new Example(FriendType.class);
        example.createCriteria().andEqualTo("userId",userId);
        List<FriendType> friendTypes = friendTypeMapper.selectByExample(example);
        System.out.println(friendTypes);
        if(CollectionUtils.isEmpty(friendTypes)){
            FriendType friendType = new FriendType();
            friendType.setUserId(userId);
            friendType.setIsDefault(1);
            friendType.setTypeName("好友");
            int insert = friendTypeMapper.insert(friendType);
            MVFriend.Builder friendBuilder = MVFriend.newBuilder();
            friendBuilder.setGroupname("好友");
            friendBuilder.setOnline(0);
            System.out.println("insert:"+insert);
            friendBuilder.setId(insert);
            dataBuilder.addFriend(friendBuilder.build());
        }else {
            friendTypes.forEach(ft->{
                MVFriend.Builder friendBuilder = MVFriend.newBuilder();
                friendBuilder.setGroupname(ft.getTypeName());
                friendBuilder.setId(ft.getId());
                Example friendExample = new Example(Friend.class);
                friendExample.createCriteria().andEqualTo("userId",userId).andEqualTo("typeId",ft.getId());
                List<Friend> friends = friendMapper.selectByExample(friendExample);
                AtomicInteger onlineNum = new AtomicInteger();
                friends.forEach(f->{
                    MVUser.Builder builder = MVUser.newBuilder();
                    TUser user = userMapper.selectByPrimaryKey(f.getFriendId());
                    builder.setUsername(user.getUserName());
                    builder.setAvatar(imageServer+user.getAvatar());
                    builder.setSign(user.getSign());
                    builder.setId(f.getFriendId());
                    String key = f.getFriendId() + RedisConst.USER_STATUS;
                    IsOK exist = redisService.exist(RKey.newBuilder().setKey(key).build());
                    if(exist.getOk()){
                        onlineNum.getAndIncrement();
                        builder.setStatus(redisService.get(RKey.newBuilder().setKey(key).build()).getValue());
                    }else {
                        builder.setStatus("offline");
                    }
                    friendBuilder.setOnline(onlineNum.intValue());
                    friendBuilder.addList(builder.build());
                });
                dataBuilder.addFriend(friendBuilder.build());
            });
        }
        Example groupUserExample = new Example(GroupUser.class);
        groupUserExample.createCriteria().andEqualTo("userId",userId);
        List<GroupUser> groupUsers = groupUserMapper.selectByExample(groupUserExample);
        if(CollectionUtils.isNotEmpty(groupUsers)){
            groupUsers.forEach(gu->{
                TGroup tGroup = groupMapper.selectByPrimaryKey(gu.getGroupId());
                MVGroup.Builder groupBuilder = MVGroup.newBuilder();
                groupBuilder.setGroupname(tGroup.getGroupName());
                groupBuilder.setId(tGroup.getId());
                groupBuilder.setAvatar(tGroup.getAvatar());
                dataBuilder.addGroup(groupBuilder.build());
            });
        }
        initBuilder.setData(dataBuilder.build());
        initBuilder.setId(userId);
        responseObserver.onNext(initBuilder.build());
        responseObserver.onCompleted();
    }
}
