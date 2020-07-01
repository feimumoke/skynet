package com.skynet.dipper.api.gateway.config;

import com.skynet.dipper.api.gateway.model.MyUserDetails;
import com.skynet.dipper.commons.grpc.user.DubboUserServiceGrpc;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Reference(version = "${services.versions.user.v1}", protocol = "grpc")
    private DubboUserServiceGrpc.IUserService iUserService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }


    //密码模式才需要配置,认证管理器
    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .and()
                .logout();
    }


    @Bean
    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return s -> {
            System.out.println(s);
            if ("admin".equals(s) || "user".equals(s)) {
                return new MyUserDetails(s, passwordEncoder().encode(s), s);
            }
            return null;
        };
    }
}
