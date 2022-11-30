package com.pipilong.controller;

import com.alibaba.fastjson.JSON;
import com.pipilong.pojo.Brand;
import com.pipilong.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * @author pipilong
 * @createTime 2022/11/17
 * @description
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @Autowired
    private Brand brand;

    @GetMapping("/selectById/{id}")
    public Brand selectById(@PathVariable("id") String id){

        brand = brandService.selectById(id);

        return brand;
    }

    @GetMapping("/selectAll/{brand}/{currentPage}/{pageSize}")
    public List<Brand> selectAll(
                          @PathVariable("brand") Brand brand,
                          @PathVariable("currentPage") Integer currentPage,
                          @PathVariable("pageSize") Integer pageSize) {
        this.brand=brand;
        List<Brand> brands = brandService.selectAll(currentPage,pageSize,brand);

        return brands;
    }

    @PostMapping("/add")
    public String add(@RequestBody Brand brand) throws IOException {

        try{
            brandService.add(brand);
            return "success";
        }catch (Exception e){
            return "error";
        }

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id) throws IOException {
        brandService.delete(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody Brand brand) throws IOException {

        try{
            brandService.update(brand);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }

    @DeleteMapping("/deleteByIds/{ids}")
    public String deleteByIds(@PathVariable("ids") Integer[] ids) {

        try {
            brandService.deleteByIds(ids);
            return "success";
        }catch (Exception e){
            return "error";
        }

    }

    @GetMapping("/loadTotal")
    public Integer loadTotal() {

        return brandService.selectAllCount();
    }

    @GetMapping("/searchLoadTotal/{brand}")
    public Integer searchLoadTotal(@PathVariable("brand") Brand brand) {
//        System.out.println(brand);
        return brandService.searchSelectCount(brand);
    }



}

































