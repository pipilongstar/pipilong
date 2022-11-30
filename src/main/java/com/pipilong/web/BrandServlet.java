package com.pipilong.web;


import com.alibaba.fastjson.JSON;
import com.pipilong.config.Config;
import com.pipilong.pojo.Brand;
import com.pipilong.service.BrandService;
import com.pipilong.service.Impl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
//@WebServlet("/BrandServlet/*")
public class BrandServlet extends BaseServlet {
    private BrandService brandService;
    private Brand brand;


    public void init() throws ServletException {

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//        this.brandService = ctx.getBean(BrandService.class);
    }

    public void selectById(HttpServletRequest request, HttpServletResponse response) throws IOException {




        String id = request.getReader().readLine();

        brand = brandService.selectById(id);

        String resp = JSON.toJSONString(brand);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(resp);
    }

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String data = request.getReader().readLine();

        String[] nums = JSON.parseObject(data, String[].class);
        String b=nums[0];
        brand = JSON.parseObject(b, Brand.class);
        Integer currentPage=Integer.parseInt(nums[1])-1;
        Integer pageSize=Integer.parseInt(nums[2]);

        List<Brand> brands = brandService.selectAll(currentPage,pageSize,brand);
        String resp = JSON.toJSONString(brands);


        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(resp);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String req = request.getReader().readLine();
        String data=new String(req.getBytes(StandardCharsets.UTF_8));

        try{
            brand = JSON.parseObject(data, Brand.class);
            brandService.add(brand);
            response.getWriter().write("success");
        }catch (Exception e){
            response.getWriter().write("error");
        }
    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getReader().readLine();

        brandService.delete(id);
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String req = request.getReader().readLine();
        String data=new String(req.getBytes(StandardCharsets.UTF_8));

        try{
            brand = JSON.parseObject(data, Brand.class);
            brandService.update(brand);
            response.getWriter().write("success");
        }catch (Exception e){
            response.getWriter().write("error");
        }
    }


    public void deleteByIds(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String req = request.getReader().readLine();
        String data=new String(req.getBytes(StandardCharsets.UTF_8));

        try {
            Integer[] ids = JSON.parseObject(data, Integer[].class);
            brandService.deleteByIds(ids);
            response.getWriter().write("success");
        }catch (Exception e){
            response.getWriter().write("error");
        }

    }

    public void loadTotal(HttpServletRequest request,HttpServletResponse response) throws IOException {

        int count = brandService.selectAllCount();
//        System.out.println(count);
        response.getWriter().write(Integer.toString(count));
    }

    public void searchLoadTotal(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String req = request.getReader().readLine();
        String data=new String(req.getBytes(StandardCharsets.UTF_8));

        brand = JSON.parseObject(data, Brand.class);

        int count = brandService.searchSelectCount(brand);

        response.getWriter().write(Integer.toString(count));
    }
}






















