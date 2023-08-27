package com.zhuang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zhuang")
@EnableAspectJAutoProxy
public class SpringConfig {
}
