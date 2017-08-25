package com.jack.king.fu.annotations.a22;

import com.jack.king.fu.annotations.a22.exceplass.AException;
import com.jack.king.fu.annotations.a22.exceplass.AgeException;
import com.jack.king.fu.annotations.a22.exceplass.NameException;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test") //命名空间
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping("/ex3.do")
    public ModelAndView doFirst() throws AException {
        logger.info("自定义异常处理器");
        String name="FJK";
        int age=31;
        if (!name.equals("FJK")){
        throw  new NameException("用户名规范");
        }
        if(age!=30){
        throw  new AgeException("年龄不正确");
        }
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
}
