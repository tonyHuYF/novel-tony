package com.dgbigdata.novel.web.config;

import com.dgbigdata.common.core.util.url.RequestWebsite;
import com.github.xiaoymin.knife4j.core.extend.OpenApiExtendSetting;
import com.github.xiaoymin.knife4j.spring.extension.OpenApiExtensionResolver;
import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
@ConditionalOnProperty(name = "enable", prefix = "knife4j", havingValue = "true")
public class Knife4jConfig {

    /**
     * 创建API文档
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        String groupName = "小说网接口";

        OpenApiExtendSetting setting = new OpenApiExtendSetting();
        setting.setHomeCustomLocation("classpath:api/doc.md");
        setting.setFooterCustomContent("http://www.dgbigdata.com | [数汇团队](javascript:;)");
        OpenApiExtensionResolver resolver = new OpenApiExtensionResolver(setting, null);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder().title(groupName).build())
                .groupName(groupName)
                // 忽略接口参数里自定义注解
                .ignoredParameterTypes(RequestWebsite.class)
                .extensions(resolver.buildSettingExtensions())
                .select()
                // 这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
    }

}
