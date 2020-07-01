package com.skynet.dipper.commons.dubbo.register.consumer;


import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.SslConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

public class SslBasicConsumer {
    private static String rpcpath = "E:\\SELFCODE\\grpccerts\\";

    public static DubboBootstrap getbootstrap() throws Exception {
        SslConfig sslConfig = new SslConfig();

        sslConfig.setClientKeyCertChainPath(rpcpath + "client.pem");
        sslConfig.setClientPrivateKeyPath(rpcpath + "client.key");

        sslConfig.setClientTrustCertCollectionPath(rpcpath + "ca.pem");
        ApplicationConfig applicationConfig = new ApplicationConfig("first-dubbo-consumer");
        applicationConfig.setQosPort(33356);
        DubboBootstrap bootstrap = DubboBootstrap.getInstance()
                .application(applicationConfig)
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .ssl(sslConfig);
        return bootstrap;
    }
}
