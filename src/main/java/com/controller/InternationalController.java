package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * InternationalController
 *
 * @author 丁旭
 * @date 2016/4/11
 */
@Controller
@RequestMapping("/internationalController")
public class InternationalController {
    @RequestMapping(value = "internationalTest", method = RequestMethod.GET)
    public String validateTest(ModelMap model, HttpServletRequest request) {

        //从后台代码获取国际化信息
        RequestContext requestContext = new RequestContext(request);
        model.addAttribute("username", requestContext.getMessage("username"));
        model.addAttribute("userpwd", requestContext.getMessage("userpwd"));

        return "international/international";
    }
}
