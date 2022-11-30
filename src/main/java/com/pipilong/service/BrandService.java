package com.pipilong.service;

import com.pipilong.pojo.Brand;

import java.util.List;

/**
 * @author pipilong
 * @createTime 2022/10/19
 * @description
 */
public interface BrandService {

    List<Brand> selectAll(Integer currentPage,Integer pageSize,Brand brand);

    void add(Brand brand);

    void delete(String id);

    Brand selectById(String id);

    void update(Brand brand);

    void deleteByIds(Integer[] ids);

    int selectAllCount();

    int searchSelectCount(Brand brand);
}
