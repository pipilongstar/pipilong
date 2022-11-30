package com.pipilong.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author pipilong
 * @createTime 2022/11/17
 * @description
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {Config.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {MVCWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/pi/*"};
    }
}
