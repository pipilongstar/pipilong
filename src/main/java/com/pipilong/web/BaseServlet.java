package com.pipilong.web;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.ResourceBundle;
public class BaseServlet {
//    private static ResourceBundle lStrings = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");


//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String uri = req.getRequestURI();
//
//        int i = uri.lastIndexOf('/');
//        String api = uri.substring(i + 1);
//
//        Class<? extends BaseServlet> cls = this.getClass();
//        Method method = null;
//        try {
//            method = cls.getMethod(api, HttpServletRequest.class, HttpServletResponse.class);
//            method.invoke(this,req,resp);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

}
