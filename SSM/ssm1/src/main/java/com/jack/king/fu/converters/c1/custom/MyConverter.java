package com.jack.king.fu.converters.c1.custom;

import org.springframework.core.convert.converter.Converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Converter接口中的两个泛型表示：
 * 第一个参数：表示源的类型。
 * 第二个参数：表示目标的类型
 */
public class MyConverter implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
