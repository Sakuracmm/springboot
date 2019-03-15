package com.ll.springbootlesson1.bootstrap;

import com.ll.springbootlesson1.repository.MyFirstRepository;
import com.ll.springbootlesson1.repository.MySecondRepository;
import com.ll.springbootlesson1.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 引导类
 */
@SpringBootApplication(scanBasePackages = "com.ll.springbootlesson1.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        //CalculateService Bean是都存在
        CalculateService calculateService = context.getBean( CalculateService.class);


        System.out.println("myFirstLevelRepository.sum(1...10): " + calculateService.sum(1,2,3,4,5,6,7,8,9,10));


        //关闭上下文
        context.close();
    }

}
