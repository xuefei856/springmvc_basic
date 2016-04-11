package com.serviceImpl;

import com.IDao.CountryMapper;
import com.entity.Country;
import com.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CountryServiceImpl
 *
 * @author 丁旭
 * @date 2016/4/11
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper ountryMapper;

    @Override
    public List<Country> selectByPage() {
        return ountryMapper.selectByPage();
    }
}
