package com.controller;

import com.entity.SettlementBills;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.SettlementBillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 用于测试MybatisPager的类
 *
 * 分页插件使用参考文档
 * http://git.oschina.net/free/Mybatis_PageHelper/blob/master/wikis/HowToUse.markdown
 *
 */
@Controller
@RequestMapping("/mybatisPagerController")
public class MybatisPagerController {


    @Autowired
    private SettlementBillsService settlementBillsService;

    @RequestMapping(value = "mybatisPagerTest", method = RequestMethod.GET)
    public String mybatisPagerTest(ModelMap model) {

        PageHelper.startPage(1, 3, "id asc");  //分页
        List<SettlementBills> settlementBillsList = settlementBillsService.selectByPage();

        PageInfo page = new PageInfo(settlementBillsList);   //强转为PageInfo类型，包含了大量分页信息，总条数等


//        model.addAttribute("page", page);
        return "mybatisTest/list";
    }

}