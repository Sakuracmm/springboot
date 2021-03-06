package com.ll.springbootlesson1.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link org.springframework.boot.autoconfigure.EnableAutoConfiguration} 引导类
 */


@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        System.out.println("step 0!");

        //helloworld bean是否存在
        String helloWorld = context.getBean("helloWorld",String.class);

        System.out.println("step 4!");

        System.out.println("helloWorld Bean : " + helloWorld);

        //关闭上下文
        context.close();

    }


}
