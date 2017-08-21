package com.jack.king.fu.controller.s6;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.HttpRequestHandler;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MyController implements HttpRequestHandler {

    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.setAttribute("message", "HelloWorld HttpRequestHandler");
        httpServletRequest.getRequestDispatcher("/WEB-INF/Jsp/welcome.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
