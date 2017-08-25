package com.jack.king.fu.annotations.a20;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test") //命名空间
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping("/ex1.do")
    public ModelAndView doFirst() throws Exception {
        logger.info("异常处理的基本应用");
        int i=3/0;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
}
