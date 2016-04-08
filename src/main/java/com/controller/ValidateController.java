package com.controller;

import com.entity.ValidateTestClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * 用于测试hibernate validate 数据验证用的类
 */
@Controller
@RequestMapping("/validateController")
public class ValidateController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }


    /**
     * validateTest 数据验证测试页面
     * 当 validateTestClass 中的name有值时会通过数据验证，否则不会通过验证
     * @param model
     * @param validateTestClass
     * @param result
     * @return
     */
    @RequestMapping(value = "validateTest", method = RequestMethod.GET)
    public String validateTest(ModelMap model, @Valid ValidateTestClass validateTestClass, BindingResult result) {

        if (result.hasErrors()) {
            return "validate/validateFail";
        }
        return "validate/validateSuccess";
    }

}