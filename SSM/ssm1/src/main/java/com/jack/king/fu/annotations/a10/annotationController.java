package com.jack.king.fu.annotations.a10;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/pageto.do")
    public String doFirst()  {
        logger.info("返回逻 辑视图");
        return"page";
    }
}
