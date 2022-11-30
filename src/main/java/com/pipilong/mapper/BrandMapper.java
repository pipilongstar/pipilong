package com.pipilong.mapper;

import com.pipilong.pojo.Brand;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author pipilong
 * @createTime 2022/10/19
 * @description
 */
@Mapper
public interface BrandMapper {

    /**
     * 查询所有
     * @return
     */
    List<Brand> selectAll(RowBounds rowBounds,@Param("brand") Brand brand);

    /**
     * 添加品牌
     * @param brand
     */
    void add(Brand brand);

    /**
     * 根据id删除品牌
     * @param id
     */
    @Delete("delete from tb_brand where id = #{id}")
    void delete(String id);

    /**
     * 根据id查找品牌
     * @param id
     * @return
     */
    Brand selectById(String id);

    /**
     * 更新品牌
     * @param brand
     */
    @Update("update tb_brand set brand_name=#{brandName},company_name=#{companyName}," +
            "ordered=#{ordered},description=#{description},status=#{status} where id=#{id}")
    void update(Brand brand);

    /**
     * 根据多个id删除品牌
     * @param ids
     */
    void deleteByIds(@Param("ids") Integer[] ids);

    /**
     * 查找总条数
     * @return
     */
    int selectAllCount();


    /**
     * 搜索后的总数据条数
     * @param brand
     * @return
     */
    int searchSelectCount(@Param("brand") Brand brand);
}





















