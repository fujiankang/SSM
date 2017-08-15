package com.jack.king.fu.controller.s2;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController2 implements Controller {
    //第一个程序HelloWorld
//    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("message","HelloWorlds");
        mv.setViewName("welcome");
        return mv;
    }
}
