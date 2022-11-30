package com.pipilong.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author pipilong
 * @createTime 2022/11/17
 * @description
 */
@RestController
@RequestMapping("/page")
public class PageController {

    @GetMapping("/brandPage")
    public ModelAndView getBrand(){
        return new ModelAndView("brand.html");
    }

    @GetMapping("/a")
    public ModelAndView get(){
        return new ModelAndView("a.jsp");
    }
}






















