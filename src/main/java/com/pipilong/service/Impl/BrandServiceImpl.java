package com.pipilong.service.Impl;

import com.pipilong.mapper.BrandMapper;
import com.pipilong.pojo.Brand;
import com.pipilong.service.BrandService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;

/**
 * @author pipilong
 * @createTime 2022/10/19
 * @description
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper mapper;

    @Override
    public List<Brand> selectAll(Integer currentPage,Integer pageSize,Brand brand){

        int index=(currentPage-1)*pageSize;

        List<Brand> brands = mapper.selectAll(new RowBounds(index,pageSize),brand);

        return brands;
    }

    @Override
    public void add(Brand brand) {
        mapper.add(brand);

    }

    @Override
    public void delete(String id) {
        mapper.delete(id);
    }

    @Override
    public Brand selectById(String id) {

        return mapper.selectById(id);
    }

    @Override
    public void update(Brand brand) {

        mapper.update(brand);

    }

    @Override
    public void deleteByIds(Integer[] ids) {

        mapper.deleteByIds(ids);
    }

    @Override
    public int selectAllCount() {

        return mapper.selectAllCount();
    }

    @Override
    public int searchSelectCount(Brand brand) {

        return mapper.searchSelectCount(brand);
    }


}
















