package com.jack.king.fu.controller.s9;

import org.apache.logging.log4j.LogManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController extends MultiActionController {

    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    public ModelAndView doFirst(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层调用的是request.setAttribute()方法
        mv.addObject("message", "propertiesMethodNameResolver doFirst");
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
    public ModelAndView doSecond(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层调用的是request.setAttribute()方法
        mv.addObject("message", "propertiesMethodNameResolver doSecond");
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
}
