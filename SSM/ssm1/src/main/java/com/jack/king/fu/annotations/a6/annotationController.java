package com.jack.king.fu.annotations.a6;

import com.jack.king.fu.vo.Student;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping("/register.do")
    public ModelAndView doFirst(Student student)  {
        logger.info("整体以对象形式"+"姓名："+student.getName()+"年龄："+student.getAge());
        ModelAndView mv=new ModelAndView();
        mv.addObject("student",student);
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
}
