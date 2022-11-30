package com.pipilong.converter;

import com.alibaba.fastjson.JSON;
import com.pipilong.pojo.Brand;
import org.springframework.core.convert.converter.Converter;

import java.nio.charset.StandardCharsets;

/**
 * @author pipilong
 * @createTime 2022/11/19
 * @description
 */
public class StringToBrand implements Converter<String, Brand> {
    @Override
    public Brand convert(String s) {
        String data=new String(s.getBytes(StandardCharsets.UTF_8));
        return JSON.parseObject(data,Brand.class);
    }
}
