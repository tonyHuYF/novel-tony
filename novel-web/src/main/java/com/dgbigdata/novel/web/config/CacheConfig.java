package com.dgbigdata.novel.web.config;

import com.dgbigdata.novel.web.constant.CacheConsts;
import com.dgbigdata.novel.web.enums.CacheEnum;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 缓存配置类
 */
@Configuration
public class CacheConfig {

    /**
     * Caffeine 缓存管理器
     */
    @Bean
    @Primary
    public CacheManager caffeineCacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();

        List<CaffeineCache> caches = new ArrayList<>(CacheEnum.values().length);
        for (CacheEnum value : CacheEnum.values()) {
            if (value.isLocal()) {
                Caffeine<Object, Object> caffeine = Caffeine.newBuilder()
                        .recordStats().maximumSize(value.getMaxSize());
                if (value.getTtl() > 0) {
                    caffeine.expireAfterWrite(Duration.ofSeconds(value.getTtl()));
                }
                caches.add(new CaffeineCache(value.getName(), caffeine.build()));
            }
        }
        cacheManager.setCaches(caches);
        return cacheManager;
    }


    /**
     * Redis 缓存管理器
     */
    @Bean
    public CacheManager redisCacheManager(RedisConnectionFactory connectionFactory) {
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        Jackson2JsonRedisSerializer<Object> jacksonSeial = new Jackson2JsonRedisSerializer<>(Object.class);
        //解决查询缓存转换异常的问题
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jacksonSeial.setObjectMapper(om);

        RedisCacheWriter redisCacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(connectionFactory);

        RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig()
                .prefixCacheNameWith(CacheConsts.REDIS_CACHE_PREFIX)
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(stringRedisSerializer))
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jacksonSeial))
                .disableCachingNullValues();

        Map<String, RedisCacheConfiguration> cacheMap = new LinkedHashMap<>(CacheEnum.values().length);
        for (CacheEnum value : CacheEnum.values()) {
            if (value.isRemote()) {
                if (value.getTtl() > 0) {
                    cacheMap.put(value.getName(),
                            defaultCacheConfig
                                    .entryTtl(Duration.ofSeconds(value.getTtl())));
                } else {
                    cacheMap.put(value.getName(),
                            defaultCacheConfig);
                }
            }
        }

        RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter,
                defaultCacheConfig, cacheMap);
        redisCacheManager.setTransactionAware(true);
        redisCacheManager.initializeCaches();

        return redisCacheManager;
    }

}
