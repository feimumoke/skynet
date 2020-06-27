package com.skynet.dipper.api.gateway.config;

import com.skynet.dipper.commons.constant.TokenConst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class TokenConfig {

    //配置如何把普通token转换为jwt token
    @Bean
    public JwtAccessTokenConverter tokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        //使用对称加密token,resource会用此秘钥校验
        converter.setSigningKey(TokenConst.SIGN_KEY);
        return converter;
    }

    //配置token存储方法
    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(tokenConverter());
    }
}
