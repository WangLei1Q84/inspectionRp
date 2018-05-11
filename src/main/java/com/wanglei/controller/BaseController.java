package com.wanglei.controller;

import com.wanglei.model.User;
import com.wanglei.model.UserInfo;
import com.wanglei.servceImpl.BaseService;
import com.wanglei.servcie.LoginService;
import com.wanglei.util.WordExportUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/19.
 */
@Controller
@RequestMapping("/inspectionRp")
public class BaseController extends   BaseService {
    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping("/export")
    public void exportWord(HttpServletResponse response, HttpServletRequest request) throws IOException {
        Map<String, Object> beanParams = new HashMap<String, Object>();
        List<User> userList = new ArrayList<User>();
        for(int i=0;i<10;i++){
            User u = new User();
            u.setName("ZhangSan"+i);
            u.setRealName("张三"+i);
            u.setCompany("xx公司"+i);
            u.setPhone("130xxxxxxxx"+i);
            userList.add(u);
        }
        beanParams.put("title", "用户信息11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        beanParams.put("userList", userList);
        beanParams.put("attention", "请注意确保所有信息的正确性");

        WordExportUtil.writeResponse(request, response, WordExportUtil.WORD_2003, "用户信息列表导出", "templateFile.ftl", beanParams);
    }
    @RequestMapping("/login")
    public String toLogin(Model model, HttpServletResponse response, HttpServletRequest request) throws IOException {
        UserInfo userinfo = new UserInfo();
        model.addAttribute("userInfo",userinfo);
        return "login";
    }


    @RequestMapping("/logining")
    public String login(@ModelAttribute UserInfo userInfo, HttpServletRequest request) throws IOException {
        UserInfo info = loginService.hasPass(userInfo);
        HttpSession session = request.getSession(true);
        if(info != null){
            session.setAttribute("userId", userInfo.getUserId());
            session.setAttribute("user",info);
        }else{
            session.setAttribute("logingMsg","账号密码有误");
            return "login";
        }
        return "main";
    }


    @RequestMapping("/logOut")
    public String logOut( @ModelAttribute UserInfo userInfo, HttpServletRequest request) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        System.out.print("1111");
        return "login";

    }


    @RequestMapping("/typography")
    public String toTypography(HttpServletResponse response, HttpServletRequest request) throws IOException {
        return "typography";
    }



}