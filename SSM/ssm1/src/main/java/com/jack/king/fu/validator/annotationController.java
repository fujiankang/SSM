package com.jack.king.fu.validator;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @RequestMapping("/v1.do")
    public ModelAndView doFirst(@Validated StudentModel student, BindingResult br)  {
        ModelAndView mv=new ModelAndView();
        mv.addObject("student",student);
        mv.setViewName("/WEB-INF/Jsp/welcome.jsp");

        int errorCount=br.getErrorCount();
        if (errorCount>0){
            FieldError nameError=br.getFieldError("name");
            FieldError scoreError=br.getFieldError("score");
            FieldError mobileError=br.getFieldError("mobile");
            if (nameError!=null){
                String nameErrorMSG=nameError.getDefaultMessage();
                mv.addObject("nameErrorMSG",nameErrorMSG);
            }
            if (scoreError!=null){
                String scoreErrorMSG=scoreError.getDefaultMessage();
                mv.addObject("scoreErrorMSG",scoreErrorMSG);
            }
            if(mobileError!=null){
                    String mobileErrorMSG=mobileError.getDefaultMessage();
                    mv.addObject("mobileErrorMSG",mobileErrorMSG);
            }
            mv.setViewName("/st2.jsp");
        }

        return mv;
    }
}
