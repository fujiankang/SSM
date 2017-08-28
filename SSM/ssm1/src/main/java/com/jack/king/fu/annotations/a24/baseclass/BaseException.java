package com.jack.king.fu.annotations.a24.baseclass;

import com.jack.king.fu.annotations.a24.exceplass.AgeException;
import com.jack.king.fu.annotations.a24.exceplass.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseException {
    @ExceptionHandler(NameException.class)
    public ModelAndView handlerNameException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        if (ex instanceof NameException) {
            System.out.println("执行姓名不合法操作行为");
            mv.setViewName("/error/nameerror.jsp");
        }
        return mv;
    }

    @ExceptionHandler(AgeException.class)
    public ModelAndView handlerAgeException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        if (ex instanceof AgeException) {
            System.out.println("执行年龄不合法操作");
            mv.setViewName("/error/ageerror.jsp");
        }
        return mv;
    }

    @ExceptionHandler
    public ModelAndView handlerException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/error/error.jsp");
        return mv;
    }
}
