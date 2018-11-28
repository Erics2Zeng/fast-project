package com.company.project.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.company.project.web"))
                    .paths(PathSelectors.any())
                    .build();
//                    .enableUrlTemplating(true);
        }
       
    private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	            .title("DevOps Toolchain Collection Service API")
	            .description("DevOps Toolchain Collection Service API with Swagger")
	            .version("2.0")
	            .build();
	}
}
