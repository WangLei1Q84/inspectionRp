package com.wanglei.dao;

import com.wanglei.model.PhysicalPropertyTestInfo;
import com.wanglei.model.PhysicalPropertyTestInfoExample;

import java.util.List;

public interface PhysicalPropertyTestInfoMapper {
    int countByExample(PhysicalPropertyTestInfoExample example);

    int deleteByExample(PhysicalPropertyTestInfoExample example);

    int deleteByPrimaryKey(String sampleId);

    int insert(PhysicalPropertyTestInfo record);

    int insertSelective(PhysicalPropertyTestInfo record);

    List<PhysicalPropertyTestInfo> selectByExample(PhysicalPropertyTestInfoExample example);

    PhysicalPropertyTestInfo selectByPrimaryKey(String sampleId);

    int updateByPrimaryKeySelective(PhysicalPropertyTestInfo record);

    int updateByPrimaryKey(PhysicalPropertyTestInfo record);
}