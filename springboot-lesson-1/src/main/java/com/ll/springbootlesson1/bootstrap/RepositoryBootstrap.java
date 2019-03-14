package com.ll.springbootlesson1.bootstrap;

import com.ll.springbootlesson1.annotation.SecondLevelRepository;
import com.ll.springbootlesson1.repository.MyFirstRepository;
import com.ll.springbootlesson1.repository.MySecondRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ll.springbootlesson1.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //myFirstLevelRepository Bean是都存在
        MyFirstRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstRepository.class);
        MySecondRepository mySecondLevelRepository = context.getBean("mySecondLevelRepository", MySecondRepository.class);


        System.out.println("myFirstLevelRepository Bean: " + myFirstLevelRepository.toString());
        System.out.println("mySecondLevelRepository Bean: " + mySecondLevelRepository.toString());


        //关闭上下文
        context.close();
    }


}
