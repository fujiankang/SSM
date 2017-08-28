package com.jack.king.fu.annotations.a23;

import com.jack.king.fu.annotations.a23.exceplass.AException;
import com.jack.king.fu.annotations.a23.exceplass.AgeException;
import com.jack.king.fu.annotations.a23.exceplass.NameException;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test") //命名空间
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping("/cuex.do")
    public ModelAndView doFirst() throws AException {
        logger.info("自定义异常处理器");
        String name="FJK";
        int age=31;
        if (!name.equals("FJK")){
        throw  new NameException("用户名规范，请检查");
        }
        if(age!=30){
        throw  new AgeException("年龄不正确");
        }
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
    @ExceptionHandler
    public ModelAndView handlerException(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",ex);
        mv.setViewName("/error/error.jsp");
        if (ex instanceof NameException){
            System.out.println("执行姓名不合法操作行为");
            mv.setViewName("/error/nameerror.jsp");
        }
        if (ex instanceof NameException){
            System.out.println("执行年龄不合法操作");
            mv.setViewName("/error/ageerror.jsp");
        }
        return mv;
    }
}
