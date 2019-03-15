package com.ll.springbootlesson1.bootstrap;

import com.ll.springbootlesson1.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 系统属性条件引导类
 */
public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name="user.name",value="Administrator")
    public String helloWorld(){
        return "hello World !!!!";
    }



    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        try{
            //通过名称获取helloWorld
            String helloWorld = context.getBean("helloWorld", String.class);
            System.out.println("hello World Bean: " + helloWorld.toString());
        }catch (Exception e){
            System.out.println(" No this bean found !");
        }
        context.close();
    }
}
