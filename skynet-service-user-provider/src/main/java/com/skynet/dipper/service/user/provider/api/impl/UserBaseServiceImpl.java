package com.skynet.dipper.service.user.provider.api.impl;

import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.dubbo.service.provider.BaseProviderService;
import com.skynet.dipper.commons.grpc.base.DubboBaseServiceGrpc;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "${services.versions.user.v1}", interfaceClass = DubboBaseServiceGrpc.IBaseService.class, interfaceName = RpcConstant.USER,group = RpcConstant.USER)
@Transactional
public class UserBaseServiceImpl extends BaseProviderService {
}
