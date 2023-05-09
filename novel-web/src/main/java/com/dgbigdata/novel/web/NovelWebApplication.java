package com.dgbigdata.novel.web;


import com.dgbigdata.common.core.util.ApplicationUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.Instant;


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
}
