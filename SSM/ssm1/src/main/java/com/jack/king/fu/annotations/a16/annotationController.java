package com.jack.king.fu.annotations.a16;

import com.jack.king.fu.vo.Student;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping(value = "/rspmap.do")
    @ResponseBody
    public Object doAjax() throws IOException {
        logger.info("Ajax请求到达========返回Map类型");
        Map<String,Student> stu=new HashMap<String, Student>();
        Student student1=new Student();
        student1.setName("付健康");
        student1.setAge(31);
        stu.put("a",student1);
        Student student2=new Student();
        student2.setName("付家睿");
        student2.setAge(1);
        stu.put("b",student2);
        return stu;
    }
}