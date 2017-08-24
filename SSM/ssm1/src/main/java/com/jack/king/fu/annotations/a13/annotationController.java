package com.jack.king.fu.annotations.a13;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;
@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/rspnum.do")
    @ResponseBody
    public Object doAjax() throws IOException {
        logger.info("Ajax请求到达========");
        return 3.1415926;
    }
}