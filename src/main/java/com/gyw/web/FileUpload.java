package com.gyw.web;

import com.gyw.mgr.user.UserMgr;
import com.gyw.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * Created by Administrator on 2016/3/14.
 */
@Controller
public class FileUpload {

    @RequestMapping("upload") //用来处理前台的login请求
    @ResponseBody
    public String hello(
            @RequestParam(value = "file", required = false)MultipartFile file,
            HttpServletRequest request,ModelMap model
    ){
       String path =request.getSession().getServletContext().getRealPath("upload");
        String filename = file.getOriginalFilename();
        File targetFile = new File(path,filename);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        try{
            file.transferTo(targetFile);
        }catch (Exception e){
            e.printStackTrace();
        }
          return "index";
    }

}
