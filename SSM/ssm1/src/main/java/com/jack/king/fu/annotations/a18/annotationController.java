package com.jack.king.fu.annotations.a18;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/test") //命名空间
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/redirects.do")
    public ModelAndView doFirst() throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("pname","张三");
        mv.addObject("page",23);
        mv.setViewName("redirect:/redirects.jsp");
        return mv;
    }
}
