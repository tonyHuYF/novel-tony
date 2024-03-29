package com.dgbigdata.novel.web.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private String port;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.database}")
    private int database;


    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        String address = new StringBuilder("redis://").append(host).append(":").append(port).toString();
        config.useSingleServer().setAddress(address);
        if (null != password && !"".equals(password.trim())) {
            config.useSingleServer().setPassword(password).setDatabase(database);
        }
        return Redisson.create(config);
    }

}
