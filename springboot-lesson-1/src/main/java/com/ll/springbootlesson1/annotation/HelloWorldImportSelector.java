package com.ll.springbootlesson1.annotation;

import com.ll.springbootlesson1.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 实现
 */

public class HelloWorldImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("step 2!");
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
