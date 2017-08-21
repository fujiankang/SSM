package com.jack.king.fu.controller.s7;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


public class MyController extends AbstractController  {

    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        ArrayList<String> strings = new ArrayList<String>();
        //其底层调用的是request.setAttribute()方法
        mv.addObject("message", "HelloWorld AbstractControllers");
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");
        return mv;
    }
}
