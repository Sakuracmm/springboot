package com.ll.springbootlesson1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld配置
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() { // 方法名即 Bean 名称
        System.out.println("step 3!");
        return "Hello,World 2018";
    }

}
