package com.pipilong.converter;

import com.alibaba.fastjson.JSON;
import org.springframework.core.convert.converter.Converter;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author pipilong
 * @createTime 2022/11/19
 * @description
 */
public class StringToIntegerArray implements Converter<String,Integer[]> {
    @Override
    public Integer[] convert(String s) {
        String data=new String(s.getBytes(StandardCharsets.UTF_8));
        return JSON.parseObject(data,Integer[].class);
    }
}
