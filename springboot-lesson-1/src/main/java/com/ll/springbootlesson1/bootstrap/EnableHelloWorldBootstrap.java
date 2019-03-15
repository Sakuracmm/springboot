package com.ll.springbootlesson1.bootstrap;

import com.ll.springbootlesson1.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 引导类
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //helloworld bean是否存在
        String helloWorld = context.getBean("helloWorld",String.class);

        System.out.println("helloWorld Bean : " + helloWorld);

        //关闭上下文
        context.close();
    }



}
