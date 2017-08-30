package com.jack.king.fu.converters.c4.custom;

import org.springframework.beans.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 转换多种格式的日期
 */
public class MyConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = getDateFormat(s);
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    //使用正则表达式
    private SimpleDateFormat getDateFormat(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", s)) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", s)) {
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        } else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", s)) {
            sdf = new SimpleDateFormat("yyyyMMdd");
        }else {
            throw new TypeMismatchException(s,Date.class);
        }
        return sdf;
    }
}
