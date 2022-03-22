package com.example.hospitalcleaner;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class HospitalCleanerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalCleanerApplication.class, args);
       // System.out.println("Hello World");
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.hospitalcleaner"))
                .build();
    }

    @Bean
    public org.modelmapper.ModelMapper getModelMapper() {
        org.modelmapper.ModelMapper modelMapper=new ModelMapper();
        return modelMapper;
    }

}
