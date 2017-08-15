package com.jack.king.fu.controller.s1;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyController implements Controller {
    //第一个程序HelloWorld
//    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
//        logger.info("我是info信息");
//        logger.warn("我是warn信息");
//
//        logger.error("我是error信息");
//        logger.fatal("我是fatal信息");
        System.out.println("ssss");
        mv.addObject("message","HelloWorld");
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
}
