package com.ll.springbootlesson1.annotation;

import java.lang.annotation.*;

/**
 * 二级 @link SecondLevelRepository
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLeveRepository
public @interface SecondLevelRepository {

    String value() default "";
}
