package com.jack.king.fu.annotations.a9;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/pageto.do")
    public String doFirst()  {
        logger.info("返回String类型");
        return"/WEB-INF/Jsp/page.jsp";
    }
}
