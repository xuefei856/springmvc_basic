package com.controller;

import com.entity.User;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userInfoController")
public class UserInfoController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(method = RequestMethod.GET, value = "getUserInfo")
    public String printUserInfo(ModelMap model) {


        Map userMap = new HashMap();
        userMap.put("username", "dingxu");
        List<User> user = iUserService.selectByParam(userMap);
        model.addAttribute("user", user);
        return "user/userInfo";
    }


}