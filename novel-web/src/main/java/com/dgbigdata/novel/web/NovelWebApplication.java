package com.dgbigdata.novel.web;


import com.dgbigdata.common.core.util.ApplicationUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.Instant;
import java.util.Map;


@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.dgbigdata"})
@EnableScheduling
@MapperScan("com.dgbigdata.**.mapper")
@EnableConfigurationProperties
@Slf4j
public class NovelWebApplication {
    public static void main(String[] args) {

        Instant start = Instant.now();
        SpringApplication.run(NovelWebApplication.class, args);
        ApplicationUtil.printStartSuccess("novel-web", start);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            Map<String, CacheManager> beans = context.getBeansOfType(CacheManager.class);
            log.info("加载了以下缓存管理器");
            beans.forEach((k, v) -> {
                log.info("{}:{}", k, v.getClass().getName());
                log.info("缓存,{}", v.getCacheNames());
            });
        };

    }
}
