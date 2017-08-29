package com.jack.king.fu.converters.c3;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Date;
@Controller
@RequestMapping("/test")
public class ConverterController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/cc3.do")
    public ModelAndView ConverterCustom(int week, Date date)  {
        logger.info("类型转换器,参数异常不能正确接收和转换");
        logger.error("周数"+week);
        logger.error("日期"+date);
        ModelAndView mv=new ModelAndView();
        mv.addObject("week",week);
        mv.addObject("date",date);
        mv.setViewName("/WEB-INF/Jsp/retc1.jsp");
        return mv;
    }
    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView paramException(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/c1.jsp");
        return mv;
    }
}
