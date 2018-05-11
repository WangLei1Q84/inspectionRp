package com.wanglei.controller;

import com.alibaba.fastjson.JSONObject;
import com.wanglei.model.UserInfo;
import com.wanglei.servceImpl.BaseService;
import com.wanglei.servcie.UserManageService;
import com.wanglei.util.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/19.
 */
@Controller
@RequestMapping("/user")
public class UserInfoManageContoller extends   BaseService {
    private Logger logger = LoggerFactory.getLogger(UserInfoManageContoller.class);

    @Autowired
    private UserManageService userManageService;

    @RequestMapping("/userInfo")
    public String userInfo(Model model,HttpServletResponse response, HttpServletRequest request) throws IOException {
        try{
            UserInfo userinfo = new UserInfo();
            model.addAttribute("userInfo",userinfo);
        }catch (Exception e){
            logger.error(e.toString(),e);
        }
        return "userInfo";
    }

    @RequestMapping("/addUser")
    public String addUser(@ModelAttribute UserInfo userInfo, HttpServletRequest request) throws IOException {
        userManageService.addUser(userInfo);
        return "userInfo";
    }

    @RequestMapping("/customerInfo")
    public String toLogin(Model model, HttpServletResponse response, HttpServletRequest request) throws IOException {
        return "customerInfo";
    }






    @RequestMapping("/findUserInfo")
    @ResponseBody
    public JSONObject findUserInfo(int pageNumber, int pageSize,  UserInfo info) throws IOException {
        Page targetPage =  findByPage(pageNumber,pageSize,info);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("suc", "true");
        jsonObject.put("msg", "查询成功");
        jsonObject.put("total", targetPage.getTotalRecord());
        jsonObject.put("res", targetPage.getRecords());
        return jsonObject;
    }

}