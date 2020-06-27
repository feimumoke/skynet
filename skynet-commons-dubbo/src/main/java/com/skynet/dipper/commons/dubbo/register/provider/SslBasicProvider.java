package com.skynet.dipper.commons.dubbo.register.provider;




import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.SslConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;



public class SslBasicProvider {
    private static String rpcpath = "E:\\SELFCODE\\grpccerts\\";

    public static DubboBootstrap getbootstrap() throws Exception {

        // wait for embedded zookeeper start completely.
        Thread.sleep(1000);

        SslConfig sslConfig = new SslConfig();

        sslConfig.setServerKeyCertChainPath(rpcpath + "server1.pem");
        sslConfig.setServerPrivateKeyPath(rpcpath + "server1.key");

        sslConfig.setServerTrustCertCollectionPath(rpcpath + "ca.pem");

        ProtocolConfig protocolConfig = new ProtocolConfig("grpc");
        protocolConfig.setSslEnabled(true);

        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
        bootstrap.application(new ApplicationConfig("ssl-provider"))
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .protocol(protocolConfig)
                .ssl(sslConfig);

        return bootstrap;
    }
}
