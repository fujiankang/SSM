package com.jack.king.fu.annotations.a15;

import com.jack.king.fu.vo.Student;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.attribute.standard.Media;
import java.io.IOException;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping(value = "/rspmd.do")
    @ResponseBody
    public Object doAjax() throws IOException {
        logger.info("Ajax请求到达========返回自定义类型");
        Student student=new Student();
        student.setName("付健康");
        student.setAge(31);
        return student;
    }
}