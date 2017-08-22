package com.jack.king.fu.annotations.a2;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping({"/my.do","hello.do"})
    public ModelAndView doFirst(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("一个控制器多个访问路径my.do,hello.do");
        return new ModelAndView("/WEB-INF/Jsp/welcome.jsp");
    }
    @RequestMapping("/second.do")
    public ModelAndView doSecond(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("一个控制器多个访问路径second.do请求");
        return new ModelAndView("/WEB-INF/Jsp/welcome.jsp");
    }

}
