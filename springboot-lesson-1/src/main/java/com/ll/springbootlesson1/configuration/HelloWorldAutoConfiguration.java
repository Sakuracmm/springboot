package com.ll.springbootlesson1.configuration;

import com.ll.springbootlesson1.annotation.EnableHelloWorld;
import com.ll.springbootlesson1.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * helloWorld自动装配
 */
@Configuration      //Spring模式注解
@EnableHelloWorld   //Spring @Enable模块装配
@ConditionalOnSystemProperty(name="user.name",value="Administrator")  //Spring模块装配
public class HelloWorldAutoConfiguration {


}
