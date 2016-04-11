package com.service;


import com.entity.Country;

import java.util.List;

/**
 * PathManagementService
 *
 * @author 丁旭
 * @date 2016/4/11
 */
public interface CountryService {

    List<Country> selectByPage();
}
