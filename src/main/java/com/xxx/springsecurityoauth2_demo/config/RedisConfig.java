/*
package com.xxx.springsecurityoauth2_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

//Redis配置
@Configuration
public class RedisConfig {

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;
    @Bean
    public TokenStore redisTokenStore(){
        //会自动把token放入到redis之中
        return new RedisTokenStore(redisConnectionFactory);
    }
}
*/
