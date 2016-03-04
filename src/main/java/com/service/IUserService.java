package com.service;


import com.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService {


    public int deleteByPrimaryKey(Long id);

    public int insert(User record);

    public int insertSelective(User record);

    public User selectByPrimaryKey(Long id);

    public int updateByPrimaryKeySelective(User record);

    public int updateByPrimaryKey(User record);

    List<User> selectByParam(Map map);

}