package com.skynet.dipper.service.chat.provider.api.impl;

import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.dubbo.service.provider.BaseProviderService;
import com.skynet.dipper.commons.grpc.base.DubboBaseServiceGrpc;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "${services.versions.chat.v1}", interfaceClass = DubboBaseServiceGrpc.IBaseService.class, interfaceName = RpcConstant.FRIEND_MESSAGE, group = RpcConstant.FRIEND_MESSAGE)
@Transactional
public class FriendMessageServiceImpl extends BaseProviderService {
}
