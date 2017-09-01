package com.jack.king.fu.fileupload;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
// 简单的文件上传
@Controller
@RequestMapping("/test")
public class FileuploadController {
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @RequestMapping("/upload.do")
    public String doFileUpload(MultipartFile imgs) throws IOException {
        logger.info("上传到本地磁盘");
        //上传到本地磁盘
        String path = "d:/images";
        String fileName = imgs.getOriginalFilename();
        File file = new File(path, fileName);
        imgs.transferTo(file);
        return "/fileupload/sucess.jsp";
    }
    //设置文件大小
    @RequestMapping("/upload2.do")
    public String doFileUpload2(MultipartFile imgs, HttpSession session) throws IOException {
        logger.info("文件上传对象:"+imgs);
        String path = session.getServletContext().getRealPath("/images");
        //不能使用等于null的语句
        if(imgs.getSize()>0){
            String fileName = imgs.getOriginalFilename();
            File file = new File(path, fileName);
            imgs.transferTo(file);
            return "/fileupload/sucess.jsp";
        }
        return "/fileupload/error.jsp";
    }
    //限定文件类型
    @RequestMapping("/upload3.do")
    public String doFileUpload3(MultipartFile imgs, HttpSession session) throws IOException {
        String path = session.getServletContext().getRealPath("/images");
        //不能使用等于null的语句
        if(imgs.getSize()>0){
            logger.info("限定文件类型");
            String fileName = imgs.getOriginalFilename();
            if (fileName.endsWith(".png")||fileName.endsWith(".jpg")){
                File file = new File(path, fileName);
                imgs.transferTo(file);
                return "/fileupload/sucess.jsp";
            }
                return "/fileupload/notsupport.jsp";
        }
                return "/fileupload/error.jsp";
    }
    //上传多个文件
    @RequestMapping("/upload4.do")
    public String doFileUpload4(@RequestParam  MultipartFile[] igs, HttpSession session) throws IOException {
        String path = session.getServletContext().getRealPath("/images");
        logger.info("上传多个文件");
        for (MultipartFile imgs : igs) {
            if(imgs.getSize()>0){
                String fileName = imgs.getOriginalFilename();
                if (fileName.endsWith("png")||fileName.endsWith("jpg")){
                    File file = new File(path, fileName);
                    imgs.transferTo(file);
                }else {
                    return "/fileupload/notsupport.jsp";
                }
            }
        }
        return "/fileupload/sucess.jsp";
    }
}
