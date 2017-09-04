package com.jack.king.fu.interceptors.handles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/test")
public class InterceptControllers {
    @RequestMapping("/first.do")
    public String doSome() {
        System.out.println("执行InterceptControllers+-+doSome的方法+++++++++------");
        return "/intercep/dosome.jsp";
    }
}
