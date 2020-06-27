package com.skynet.dipper.commons.dubbo.service.consumer;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.grpc.base.DubboBaseServiceGrpc;
import com.skynet.dipper.commons.grpc.base.Empty;
import com.skynet.dipper.commons.grpc.base.Entry;
import com.skynet.dipper.commons.grpc.base.KeyId;
import com.skynet.dipper.commons.grpc.base.MessageType;
import com.skynet.dipper.commons.grpc.base.PageInfo;
import com.skynet.dipper.commons.grpc.base.RpcResult;

import java.util.ArrayList;
import java.util.List;


public class BaseConsumerService<T extends Message> extends AbsBaseService<T> {
    public BaseConsumerService(MessageType realtype, DubboBaseServiceGrpc.IBaseService baseService) {
        type = realtype;
        baseStub = baseService;
    }

    @Override
    public T save(Message message) {
        Entry.Builder builder = Entry.newBuilder().setType(type).setEntry(Any.pack(message));
        RpcResult result = baseStub.save(builder.build());
        Any data = result.getData();
        if (result.getRpcCode() == RpcConstant.RESULT_OK) {
            return unPack(data);
        } else {
            return null;
        }
    }

    @Override
    public T getById(Integer id) {
        KeyId keyId = KeyId.newBuilder().setType(type).setKeyId(id).build();
        RpcResult result = baseStub.selectById(keyId);
        Any data = result.getData();
        if (result.getRpcCode() == RpcConstant.RESULT_OK) {
            return unPack(data);
        } else {
            return null;
        }
    }

    @Override
    public T update(Message message) {
        return save(message);
    }

    @Override
    public List selectAll() {
        RpcResult result = baseStub.selectAll(Empty.newBuilder().setType(type).build());
        if (result.getRpcCode() == RpcConstant.RESULT_OK) {
            return unPackList(result.getData());
        } else {
            return new ArrayList();
        }
    }


    @Override
    public T selectOne(Message message) {
        Entry.Builder builder = Entry.newBuilder().setType(type).setEntry(Any.pack(message));
        RpcResult result = baseStub.selectByProperty(builder.build());
        Any data = result.getData();
        if (result.getRpcCode() == RpcConstant.RESULT_OK) {
            return unPack(data);
        } else {
            return null;
        }
    }

    @Override
    public List<T> selectList(Message message) {
        Entry.Builder builder = Entry.newBuilder().setType(type).setEntry(Any.pack(message));
        RpcResult result = baseStub.selectListByProperty(builder.build());
        if (result.getRpcCode() == RpcConstant.RESULT_OK) {
            return unPackList(result.getData());
        } else {
            return new ArrayList();
        }
    }

    @Override
    public List selectAndPaging(Integer pageNum, Integer pageSize) {
        PageInfo.Builder builder = PageInfo.newBuilder().setType(type).setPageNum(pageNum).setPageSize(pageSize);
        RpcResult rpcResult = baseStub.selectPageList(builder.build());
        if (rpcResult.getRpcCode() == RpcConstant.RESULT_OK) {
            return unPackList(rpcResult.getData());
        } else {
            return new ArrayList();
        }
    }


}

