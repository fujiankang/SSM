package com.jack.king.fu.annotations.a4;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/test") //命名空间
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping(value = {"/my.do","hello.do"},method= RequestMethod.POST)
    public ModelAndView doFirst(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("一个控制器多个访问路径my.do,hello.do");
        return new ModelAndView("/WEB-INF/Jsp/welcome.jsp");
    }
    @RequestMapping(value = "/second.do",params = {"name","!age"})//http://127.0.0.1:8080/test/second.do?name=zs
    public ModelAndView doSecond(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("一个控制器多个访问路径second.do请求");
        return new ModelAndView("/WEB-INF/Jsp/welcome.jsp");
    }

    @RequestMapping("/*third.do")
    public ModelAndView doThird(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("doThird 方法执行");
        return new ModelAndView("/WEB-INF/Jsp/welcome.jsp");
    }
    @RequestMapping("/fourth*.do")
    public ModelAndView doFourth(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("doFourth 方法执行");
        return new ModelAndView("/WEB-INF/Jsp/welcome.jsp");
    }
    @RequestMapping("/*/fifth.do")//路径级数的绝对匹配，即要求在test与fifth.do之间必须要有一级路径
    public ModelAndView doFifth(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("doFourth 方法执行");
        return new ModelAndView("/WEB-INF/Jsp/welcome.jsp");
    }
    @RequestMapping("/**/sixth.do")//要求在test与sixth.do之间可以包含多级路径
    public ModelAndView doSixth(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("doFourth 方法执行");
        return new ModelAndView("/WEB-INF/Jsp/welcome.jsp");
    }
}
