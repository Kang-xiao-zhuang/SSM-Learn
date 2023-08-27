package com.zhuang.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.zhuang")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
