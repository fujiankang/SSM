package com.jack.king.fu.annotations.a19;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test") //命名空间
public class annotationController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    //127.0.0.1:8080/项目名/test/redirectc.do
    @RequestMapping("/redirectc.do")
    public String doFirst( Model model)  {
        model.addAttribute("pname", "张三");
        model.addAttribute("page", 23);
        //加斜杠访问路径:127.0.0.1:8080/项目名/redirectcontroller.do
        //mv.setViewName("redirect:/redirectcontroller.do");
        //不加斜杠---访问路径 127.0.0.1:8080/项目名/test/redirectcontroller.do
        return "redirect:redirectcontroller.do";
    }
    //访问路径 127.0.0.1:8080/项目名/test/redirectcontroller.do
    @RequestMapping("/redirectcontroller.do")
    public String doOther(String pname, int page) {
        logger.info("姓名:"+pname);
        logger.info("年龄:"+page);
        return "/redirects.jsp";
    }
}
