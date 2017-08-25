package com.jack.king.fu.annotations.a17;

import com.jack.king.fu.vo.Student;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping(value = "/rsplist.do")
    @ResponseBody
    public Object doAjax() throws IOException {
        logger.info("Ajax请求到达========返回List");
        List<Student> list=new ArrayList<Student>();
        Student student1=new Student();
        student1.setName("付健康");
        student1.setAge(31);
        list.add(student1);
        Student student2=new Student();
        student2.setName("付家睿");
        student2.setAge(1);
        list.add(student2);
        return list ;
    }
}