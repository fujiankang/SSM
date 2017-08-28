package com.jack.king.fu.annotations.a22.customresolver;
import com.jack.king.fu.annotations.a22.exceplass.AgeException;
import com.jack.king.fu.annotations.a22.exceplass.NameException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExcetionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",ex);
        mv.setViewName("/error/error.jsp");
        if (ex instanceof NameException){
            System.out.println("执行姓名不合法操作行为");
            mv.setViewName("/error/nameerror.jsp");
        }
        if (ex instanceof AgeException){
            System.out.println("执行年龄不合法操作");
            mv.setViewName("/error/ageerror.jsp");
        }
        return mv;
    }
}
