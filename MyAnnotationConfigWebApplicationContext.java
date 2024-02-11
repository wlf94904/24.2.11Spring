package com.itheima.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hhm
 * @version 1.0
 */
public class MyAnnotationConfigWebApplicationContext extends AnnotationConfigApplicationContext {
    public MyAnnotationConfigWebApplicationContext(){
        super.register(SpringMVCConfig.class);
    }
}
