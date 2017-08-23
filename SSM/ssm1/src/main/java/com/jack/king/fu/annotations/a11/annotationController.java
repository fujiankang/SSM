package com.jack.king.fu.annotations.a11;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/vinewobj.do")
    public String doSome()  {
        logger.info("返回值为视图对象名");
        return"taobao";
    }
}
