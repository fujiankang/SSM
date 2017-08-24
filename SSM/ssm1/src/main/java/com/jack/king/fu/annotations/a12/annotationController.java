package com.jack.king.fu.annotations.a12;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/ajax.do")
    public void doAjax(String name, int age, HttpServletResponse rsp) throws IOException {
        logger.info("Ajax请求到达========");
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name",name);
        map.put("age",age);
        String myJson= JSON.toJSONString(map,true);
        //将数据返回浏览器
        PrintWriter writer = rsp.getWriter();
        writer.print(myJson);
        writer.close();
    }
}
