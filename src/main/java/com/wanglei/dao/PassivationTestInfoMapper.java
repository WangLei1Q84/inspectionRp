package com.wanglei.dao;

import com.wanglei.model.PassivationTestInfo;
import com.wanglei.model.PassivationTestInfoExample;

import java.util.List;

public interface PassivationTestInfoMapper {
    int countByExample(PassivationTestInfoExample example);

    int deleteByExample(PassivationTestInfoExample example);

    int deleteByPrimaryKey(String passivationId);

    int insert(PassivationTestInfo record);

    int insertSelective(PassivationTestInfo record);

    List<PassivationTestInfo> selectByExample(PassivationTestInfoExample example);

    PassivationTestInfo selectByPrimaryKey(String passivationId);

    int updateByPrimaryKeySelective(PassivationTestInfo record);

    int updateByPrimaryKey(PassivationTestInfo record);
}