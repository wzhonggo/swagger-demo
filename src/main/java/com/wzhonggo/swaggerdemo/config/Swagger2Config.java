package com.wzhonggo.swaggerdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wzhonggo on 7/12/2017.
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .useDefaultResponseMessages(false)
                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.wzhonggo.web.controller"))//要扫描的API(Controller)基础包
                .apis(RequestHandlerSelectors.basePackage("com.wzhonggo.swaggerdemo.controller"))//要扫描的API(Controller)基础包
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("document api")
                .description("swagger style")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }
}
