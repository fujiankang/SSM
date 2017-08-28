package com.jack.king.fu.annotations.a24;

import com.jack.king.fu.annotations.a24.baseclass.BaseException;
import com.jack.king.fu.annotations.a24.exceplass.AException;
import com.jack.king.fu.annotations.a24.exceplass.AgeException;
import com.jack.king.fu.annotations.a24.exceplass.NameException;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test") //命名空间
public class annotationController extends BaseException {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping("/basecuex.do")
    public ModelAndView doFirst() throws AException {
        logger.info("注解带参数并使用BaseExceptions异常处理器");
        String name = "FJK";
        int age = 31;
        if (!name.equals("FJK")) {
            throw new NameException("用户名规范，请检查");
        }
        if (age != 30) {
            throw new AgeException("年龄不正确");
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }

}
