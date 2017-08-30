package com.jack.king.fu.converters.c4;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
@Controller
@RequestMapping("/test")
public class ConverterController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/cc4.do")
    public ModelAndView ConverterCustom(int week, Date date) {
        logger.info("类型转换器,发生异常数据会回显");
        logger.error("周数" + week);
        logger.error("日期" + date);
        ModelAndView mv = new ModelAndView();
        mv.addObject("week", week);
        mv.addObject("date", date);
        mv.setViewName("/WEB-INF/Jsp/retc1.jsp");
        return mv;
    }
    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView paramException(HttpServletRequest request, Exception ex) {
        String week=request.getParameter("week");
        String date=request.getParameter("date");
        ModelAndView mv = new ModelAndView();
        if (ex.getMessage().contains(week)){
            mv.addObject("weekErr", "周期数错误");
        }
        if (ex.getMessage().contains(date)){
            mv.addObject("dateErr","输入日期不正确");
        }
        mv.addObject("week",week);
        mv.addObject("date",date);
        mv.setViewName("/c1.jsp");
        return mv;
    }
}
