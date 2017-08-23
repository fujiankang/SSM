package com.jack.king.fu.annotations.a5;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/test") //命名空间
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping("/register.do")
    public ModelAndView doFirst(@RequestParam("pname") String name, int age) throws Exception {
        logger.info("逐个参数的接收"+"姓名："+name+"年龄："+age);
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
}
