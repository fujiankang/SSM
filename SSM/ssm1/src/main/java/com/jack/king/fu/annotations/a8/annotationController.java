package com.jack.king.fu.annotations.a8;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping("/{pname}/register.do")
    public ModelAndView doFirst(@PathVariable("pname") String name)  {
        logger.info("路径变量的使用："+name);

        return new ModelAndView("/WEB-INF/Jsp/paths.jsp").addObject("paths",name);
    }
}
