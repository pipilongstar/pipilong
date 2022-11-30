package com.pipilong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author pipilong
 * @createTime 2022/10/31
 * @description
 */
@Configuration
@ComponentScan(basePackages = {"com.pipilong.pojo","com.pipilong.service","com.pipilong.mapper"})
@ImportResource({"classpath:mybatis-spring.xml"})
public class Config {

}





















