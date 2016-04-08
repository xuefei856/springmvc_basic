package com.IDao;

import com.entity.PathManagement;

public interface PathManagementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PathManagement record);

    int insertSelective(PathManagement record);

    PathManagement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PathManagement record);

    int updateByPrimaryKey(PathManagement record);
}