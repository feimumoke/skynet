package com.skynet.dipper.commons.dubbo.service.provider;

import com.github.pagehelper.PageHelper;
import com.google.protobuf.Any;
import com.skynet.dipper.commons.domain.Friend;
import com.skynet.dipper.commons.domain.FriendMessage;
import com.skynet.dipper.commons.domain.FriendType;
import com.skynet.dipper.commons.domain.GroupUser;
import com.skynet.dipper.commons.domain.TGroup;
import com.skynet.dipper.commons.domain.TUser;
import com.skynet.dipper.commons.grpc.base.Empty;
import com.skynet.dipper.commons.grpc.base.Entry;
import com.skynet.dipper.commons.grpc.base.KeyId;
import com.skynet.dipper.commons.grpc.base.PageInfo;
import com.skynet.dipper.commons.grpc.base.RpcResult;
import com.skynet.dipper.commons.grpc.friend.FriendMessagePro;
import com.skynet.dipper.commons.grpc.friend.FriendPro;
import com.skynet.dipper.commons.grpc.friend.FriendTypePro;
import com.skynet.dipper.commons.grpc.group.GroupPro;
import com.skynet.dipper.commons.grpc.group.GroupUserPro;
import com.skynet.dipper.commons.grpc.user.UserPro;
import com.skynet.dipper.commons.mapper.FriendMapper;
import com.skynet.dipper.commons.mapper.FriendMessageMapper;
import com.skynet.dipper.commons.mapper.FriendTypeMapper;
import com.skynet.dipper.commons.mapper.GroupUserMapper;
import com.skynet.dipper.commons.mapper.TGroupMapper;
import com.skynet.dipper.commons.mapper.TUserMapper;
import com.skynet.dipper.commons.utils.JSONParserUtils;
import com.skynet.dipper.commons.utils.ProtobufUtils;



import java.util.List;


import io.grpc.stub.StreamObserver;
import tk.mybatis.mapper.MyMapper;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;


public class BaseProviderService extends AbsBaseService {
    @Override
    public void deleteByPropertyList(Entry request, StreamObserver<RpcResult> responseObserver) {
        MyMapper mapper = getMapper(request.getType());
        Any data = request.getEntry();
        try {
            switch (request.getType()) {
                case USER:
                    UserPro userPro = data.unpack(UserPro.class);
                    TUser user = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(userPro), TUser.class);
                    ((TUserMapper) mapper).delete(user);
                    break;
                case GROUP:
                    GroupPro groupPro = data.unpack(GroupPro.class);
                    TGroup group = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(groupPro), TGroup.class);
                    ((TGroupMapper)mapper).delete(group);
                    break;
                case FRIEND:
                    FriendPro friendPro = data.unpack(FriendPro.class);
                    Friend friend = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendPro), Friend.class);
                    ((FriendMapper)mapper).delete(friend);
                    break;
                case GROUP_USER:
                    GroupUserPro groupUser = data.unpack(GroupUserPro.class);
                    GroupUser groupUser1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(groupUser), GroupUser.class);
                    ((GroupUserMapper)mapper).delete(groupUser1);
                    break;
                case FRIEND_TYPE:
                    FriendTypePro friendType = data.unpack(FriendTypePro.class);
                    FriendType friendType1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendType), FriendType.class);
                    ((FriendTypeMapper)mapper).delete(friendType1);
                    break;
                case FRIEND_MESSAGE:
                    FriendMessagePro friendMessage = data.unpack(FriendMessagePro.class);
                    FriendMessage friendMessage1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendMessage), FriendMessage.class);
                    ((FriendMessageMapper)mapper).delete(friendMessage1);
                    break;
                case UNRECOGNIZED:
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public void selectByProperty(Entry request, StreamObserver<RpcResult> responseObserver) {
        MyMapper mapper = getMapper(request.getType());
        Any data = request.getEntry();
        System.out.println(data.getTypeUrl());
        try {
            switch (request.getType()) {
                case USER:
                    UserPro userPro = data.unpack(UserPro.class);
                    TUser user = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(userPro), TUser.class);
                    System.out.println(user);
                    List result = mapper.select(user);
                    loadOneData(responseObserver, result, request.getType());
                    break;
                case GROUP:
                    GroupPro groupPro = data.unpack(GroupPro.class);
                    TGroup group = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(groupPro), TGroup.class);
                    List groups = mapper.select(group);
                    loadOneData(responseObserver, groups, request.getType());
                    break;
                case FRIEND:
                    FriendPro friendPro = data.unpack(FriendPro.class);
                    Friend friend = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendPro), Friend.class);
                    List friends = mapper.select(friend);
                    loadOneData(responseObserver, friends, request.getType());
                    break;
                case GROUP_USER:
                    GroupUserPro groupUser = data.unpack(GroupUserPro.class);
                    GroupUser groupUser1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(groupUser), GroupUser.class);
                    List groupUsers = mapper.select(groupUser1);
                    loadOneData(responseObserver, groupUsers, request.getType());
                    break;
                case FRIEND_TYPE:
                    FriendTypePro friendType = data.unpack(FriendTypePro.class);
                    FriendType friendType1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendType), FriendType.class);
                    List friendTypes = mapper.select(friendType1);
                    loadOneData(responseObserver, friendTypes, request.getType());
                    break;
                case FRIEND_MESSAGE:
                    FriendMessagePro friendMessage = data.unpack(FriendMessagePro.class);
                    FriendMessage friendMessage1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendMessage), FriendMessage.class);
                    List friendMessages = mapper.select(friendMessage1);
                    loadOneData(responseObserver, friendMessages, request.getType());
                    break;
                case UNRECOGNIZED:
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }


    @Override
    public void selectListByProperty(Entry request, StreamObserver<RpcResult> responseObserver) {
        Mapper mapper = getMapper(request.getType());
        System.out.println("selectListByProperty");
        Any data = request.getEntry();
        try {
            switch (request.getType()) {
                case USER:
                    UserPro userPro = data.unpack(UserPro.class);
                    TUser user = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(userPro), TUser.class);
                    List all = mapper.select(user);
                    allPack(request, responseObserver, all);
                    break;
                case GROUP:
                    GroupPro groupPro = data.unpack(GroupPro.class);
                    TGroup group = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(groupPro), TGroup.class);
                    List groups = mapper.select(group);
                    allPack(request, responseObserver, groups);
                    break;
                case FRIEND:
                    FriendPro friendPro = data.unpack(FriendPro.class);
                    Friend friend = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendPro), Friend.class);
                    List friends = mapper.select(friend);
                    allPack(request, responseObserver, friends);
                    break;
                case GROUP_USER:
                    GroupUserPro groupUser = data.unpack(GroupUserPro.class);
                    GroupUser groupUser1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(groupUser), GroupUser.class);
                    List groupUsers = mapper.select(groupUser1);
                    allPack(request, responseObserver, groupUsers);
                    break;
                case FRIEND_TYPE:
                    FriendTypePro friendType = data.unpack(FriendTypePro.class);
                    FriendType friendType1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendType), FriendType.class);
                    List friendTypes = mapper.select(friendType1);
                    allPack(request, responseObserver, friendTypes);
                    break;
                case FRIEND_MESSAGE:
                    FriendMessagePro friendMessage = data.unpack(FriendMessagePro.class);
                    FriendMessage friendMessage1 = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(friendMessage), FriendMessage.class);
                    List friendMessages = mapper.select(friendMessage1);
                    allPack(request, responseObserver, friendMessages);
                    break;
                case UNRECOGNIZED:
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }


    @Override
    public void save(Entry request, StreamObserver<RpcResult> responseObserver) {
        BaseMapper mapper = getMapper(request.getType());
        Any entry = request.getEntry();
        try {
            int insert = mapper.insert(unPack(entry, request.getType()));
            if (insert > 0) {
                responseObserver.onNext(okRpcResult().build());
            } else {
                responseObserver.onNext(nullRpcResult().build());
            }
        } catch (Exception e) {
            e.printStackTrace();
            RpcResult.Builder builder = errRpcResult();
            responseObserver.onNext(builder.build());
        } finally {
            responseObserver.onCompleted();
        }
    }


    @Override
    public void update(Entry request, StreamObserver<RpcResult> responseObserver) {
        save(request, responseObserver);
    }

    @Override
    public void selectById(KeyId request, StreamObserver<RpcResult> responseObserver) {
        System.out.println("selectById");
        BaseMapper mapper = getMapper(request.getType());
        Object o = mapper.selectByPrimaryKey(request.getKeyId());
        try {
            loadData(responseObserver, o != null, o, request.getType());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public void selectAll(Empty request, StreamObserver<RpcResult> responseObserver) {
        MyMapper mapper = getMapper(request.getType());
        List<?> all = mapper.selectAll();
        allPack(request, responseObserver, all);
        responseObserver.onCompleted();
    }


    @Override
    public void selectPageList(PageInfo request, StreamObserver<RpcResult> responseObserver) {
        MyMapper mapper = getMapper(request.getType());
        PageHelper.offsetPage(request.getPageNum(), request.getPageSize());
        com.github.pagehelper.PageInfo pageInfo = new com.github.pagehelper.PageInfo<>(mapper.selectAll());
        allPagePack(request, responseObserver, pageInfo);
        responseObserver.onCompleted();
    }
}
