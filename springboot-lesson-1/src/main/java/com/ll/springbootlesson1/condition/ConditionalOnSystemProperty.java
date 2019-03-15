package com.ll.springbootlesson1.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 条件判断Java系统属性
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Conditional(OnSystemCondition.class)
public @interface ConditionalOnSystemProperty{
    /**
     * java系统属性名称
     * @retuen
     */
    String name();

    /**
     * Java系统属性值
     * @return
     */
    String value();
}
