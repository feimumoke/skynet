package com.skynet.dipper.commons.dubbo.service.provider;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.domain.Friend;
import com.skynet.dipper.commons.domain.FriendMessage;
import com.skynet.dipper.commons.domain.FriendType;
import com.skynet.dipper.commons.domain.GroupUser;
import com.skynet.dipper.commons.domain.TGroup;
import com.skynet.dipper.commons.domain.TUser;
import com.skynet.dipper.commons.grpc.base.DataList;
import com.skynet.dipper.commons.grpc.base.DubboBaseServiceGrpc;
import com.skynet.dipper.commons.grpc.base.Empty;
import com.skynet.dipper.commons.grpc.base.Entry;
import com.skynet.dipper.commons.grpc.base.KeyId;
import com.skynet.dipper.commons.grpc.base.MessageType;
import com.skynet.dipper.commons.grpc.base.PageInfo;
import com.skynet.dipper.commons.grpc.base.RpcResult;
import com.skynet.dipper.commons.grpc.friend.FriendMessagePro;
import com.skynet.dipper.commons.grpc.friend.FriendPro;
import com.skynet.dipper.commons.grpc.friend.FriendTypePro;
import com.skynet.dipper.commons.grpc.group.GroupMessagePro;
import com.skynet.dipper.commons.grpc.group.GroupPro;
import com.skynet.dipper.commons.grpc.group.GroupUserPro;
import com.skynet.dipper.commons.grpc.user.UserPro;
import com.skynet.dipper.commons.mapper.FriendMapper;
import com.skynet.dipper.commons.mapper.FriendMessageMapper;
import com.skynet.dipper.commons.mapper.FriendTypeMapper;
import com.skynet.dipper.commons.mapper.GroupMessageMapper;
import com.skynet.dipper.commons.mapper.GroupUserMapper;
import com.skynet.dipper.commons.mapper.TGroupMapper;
import com.skynet.dipper.commons.mapper.TUserMapper;
import com.skynet.dipper.commons.utils.JSONParserUtils;
import com.skynet.dipper.commons.utils.ProtobufUtils;

import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import io.grpc.stub.StreamObserver;
import tk.mybatis.mapper.MyMapper;
import tk.mybatis.mapper.common.BaseMapper;

public abstract class AbsBaseService extends DubboBaseServiceGrpc.BaseServiceImplBase {

    @Autowired
    protected TUserMapper userMapper;

    @Autowired
    protected FriendMapper friendMapper;

    @Autowired
    protected FriendMessageMapper friendMessageMapper;

    @Autowired
    protected FriendTypeMapper friendTypeMapper;

    @Autowired
    protected TGroupMapper groupMapper;

    @Autowired
    protected GroupUserMapper groupUserMapper;

    @Autowired
    protected GroupMessageMapper groupMessageMapper;

    public MyMapper getMapper(MessageType type) {
        switch (type) {
            case USER:
                return userMapper;
            case GROUP:
                return groupMapper;
            case FRIEND:
                return friendMapper;
            case GROUP_USER:
                return groupUserMapper;
            case FRIEND_TYPE:
                return friendTypeMapper;
            case FRIEND_MESSAGE:
                return friendMessageMapper;
            case GROUP_MESSAGE:
                return groupMessageMapper;
            case UNRECOGNIZED:
                return null;
        }
        return null;
    }


    protected RpcResult.Builder okRpcResult() {
        return RpcResult.newBuilder().setRpcCode(RpcConstant.RESULT_OK).setMessage(RpcConstant.RESULT_SUCCESS_STR);
    }

    protected RpcResult.Builder errRpcResult() {
        return RpcResult.newBuilder().setRpcCode(RpcConstant.RESULT_OK).setMessage(RpcConstant.RESULT_SUCCESS_STR);
    }

    protected RpcResult.Builder nullRpcResult() {
        return RpcResult.newBuilder().setRpcCode(RpcConstant.RESULT_NULL).setMessage(RpcConstant.RESULT_FAIL_NULL);
    }

    @Override
    public void deleteById(KeyId request, StreamObserver<RpcResult> responseObserver) {
        BaseMapper mapper = getMapper(request.getType());
        int id = request.getKeyId();
        try {
            mapper.deleteByPrimaryKey(id);
            RpcResult.Builder builder = okRpcResult();
            responseObserver.onNext(builder.build());
        } catch (Exception e) {
            e.printStackTrace();
            RpcResult.Builder builder = errRpcResult();
            responseObserver.onNext(builder.build());
        } finally {
            responseObserver.onCompleted();
        }
    }

    protected void loadInfo(RpcResult.Builder builder, Object object, MessageType type) {
        try {
            switch (type) {
                case USER:
                    UserPro user = ProtobufUtils.objectToPf(object, UserPro.newBuilder());
                    builder.setData(Any.pack(user));
                    break;
                case GROUP:
                    GroupPro group = ProtobufUtils.objectToPf(object, GroupPro.newBuilder());
                    builder.setData(Any.pack(group));
                    break;
                case FRIEND:
                    FriendPro friend = ProtobufUtils.objectToPf(object, FriendPro.newBuilder());
                    builder.setData(Any.pack(friend));
                    break;
                case GROUP_USER:
                    GroupUserPro groupUser = ProtobufUtils.objectToPf(object, GroupUserPro.newBuilder());
                    builder.setData(Any.pack(groupUser));
                    break;
                case FRIEND_TYPE:
                    FriendTypePro friendType = ProtobufUtils.objectToPf(object, FriendTypePro.newBuilder());
                    builder.setData(Any.pack(friendType));
                    break;
                case FRIEND_MESSAGE:
                    FriendMessagePro friendMessage = ProtobufUtils.objectToPf(object, FriendMessagePro.newBuilder());
                    builder.setData(Any.pack(friendMessage));
                    break;
                case GROUP_MESSAGE:
                    GroupMessagePro groupMessagePro = ProtobufUtils.objectToPf(object, GroupMessagePro.newBuilder());
                    builder.setData(Any.pack(groupMessagePro));
                    break;
                case UNRECOGNIZED:
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void loadInfoList(RpcResult.Builder builder, Iterable object, MessageType type) {
        DataList.Builder dataList = DataList.newBuilder();
        try {
            switch (type) {
                case USER:
                    object.forEach(o -> {
                        try {
                            dataList.addData(Any.pack(ProtobufUtils.objectToPf(o, UserPro.newBuilder())));
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case GROUP:
                    object.forEach(o -> {
                        try {
                            dataList.addData(Any.pack(ProtobufUtils.objectToPf(o, GroupPro.newBuilder())));
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case FRIEND:
                    object.forEach(o -> {
                        try {
                            dataList.addData(Any.pack(ProtobufUtils.objectToPf(o, FriendPro.newBuilder())));
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case GROUP_USER:
                    object.forEach(o -> {
                        try {
                            dataList.addData(Any.pack(ProtobufUtils.objectToPf(o, GroupUserPro.newBuilder())));
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case FRIEND_TYPE:
                    object.forEach(o -> {
                        try {
                            dataList.addData(Any.pack(ProtobufUtils.objectToPf(o, FriendTypePro.newBuilder())));
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case FRIEND_MESSAGE:
                    object.forEach(o -> {
                        try {
                            dataList.addData(Any.pack(ProtobufUtils.objectToPf(o, FriendMessagePro.newBuilder())));
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case UNRECOGNIZED:
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(dataList);
            builder.setData(Any.pack(dataList.build()));
        }
    }

    protected Object unPack(Any data, MessageType type) {

        try {
            switch (type) {
                case USER:
                    UserPro userPro = data.unpack(UserPro.class);
                    return JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(userPro), TUser.class);
                case GROUP:
                    GroupPro groupPro = data.unpack(GroupPro.class);
                    return JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(groupPro), TGroup.class);
                case FRIEND:
                    FriendPro friendPro = data.unpack(FriendPro.class);
                    return JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendPro), Friend.class);
                case GROUP_USER:
                    GroupUserPro groupUser = data.unpack(GroupUserPro.class);
                    return JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(groupUser), GroupUser.class);
                case FRIEND_TYPE:
                    FriendTypePro friendType = data.unpack(FriendTypePro.class);
                    return JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendType), FriendType.class);
                case FRIEND_MESSAGE:
                    FriendMessagePro friendMessage = data.unpack(FriendMessagePro.class);
                    System.out.println(friendMessage.getIsBack());
                    System.out.println(friendMessage.getIsDel());
                    System.out.println(friendMessage.getIsRead());
                    FriendMessage friendMessage1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendMessage), FriendMessage.class);
                    friendMessage1.setIsBack(friendMessage.getIsBack());
                    friendMessage1.setIsDel(friendMessage.getIsDel());
                    friendMessage1.setIsRead(friendMessage.getIsRead());
                    return friendMessage1;
                case UNRECOGNIZED:
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void loadData(StreamObserver<RpcResult> responseObserver, boolean b, Object result2, MessageType type) {
        if (b) {
            RpcResult.Builder builder = okRpcResult();
            loadInfo(builder, result2, type);
            responseObserver.onNext(builder.build());
        } else {
            responseObserver.onNext(nullRpcResult().build());
        }
    }

    protected void loadOneData(StreamObserver<RpcResult> responseObserver, List list, MessageType type) {
        if (!CollectionUtils.isEmpty(list)) {
            RpcResult.Builder builder = okRpcResult();
            loadInfo(builder, list.get(0), type);
            responseObserver.onNext(builder.build());
        } else {
            responseObserver.onNext(nullRpcResult().build());
        }
    }

    protected void allPack(Message request, StreamObserver<RpcResult> responseObserver, Iterable<?> all) {
        if (all instanceof List && ((List<?>) all).isEmpty()) {
            responseObserver.onNext(nullRpcResult().build());
        } else {
            RpcResult.Builder builder = okRpcResult();
            if (request instanceof Empty) {
                loadInfoList(builder, all, ((Empty) request).getType());
                responseObserver.onNext(builder.build());
            } else if (request instanceof PageInfo) {
                loadInfoList(builder, all, ((PageInfo) request).getType());
                responseObserver.onNext(builder.build());
            }
            if (request instanceof Entry) {
                loadInfoList(builder, all, ((Entry) request).getType());
                responseObserver.onNext(builder.build());
            }
        }
    }

    protected void allPagePack(Message request, StreamObserver<RpcResult> responseObserver, com.github.pagehelper.PageInfo page) {
        if (page.getList().isEmpty()) {
            responseObserver.onNext(nullRpcResult().build());
        } else {
            RpcResult.Builder builder = okRpcResult();
            loadInfoList(builder, page.getList(), ((PageInfo) request).getType());
            responseObserver.onNext(builder.build());
        }
    }


}
