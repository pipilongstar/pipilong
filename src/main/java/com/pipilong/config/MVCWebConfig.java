package com.pipilong.config;

import com.pipilong.converter.StringToBrand;
import com.pipilong.converter.StringToIntegerArray;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author pipilong
 * @createTime 2022/11/17
 * @description
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.pipilong.controller"})
public class MVCWebConfig implements WebMvcConfigurer {

    @Bean(name="viewResolver")
    public ViewResolver initViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/page/");
        return viewResolver;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToBrand());
        registry.addConverter(new StringToIntegerArray());
    }


}














