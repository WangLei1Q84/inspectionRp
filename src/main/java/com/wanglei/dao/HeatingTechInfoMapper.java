package com.wanglei.dao;

import com.wanglei.model.HeatingTechInfo;
import com.wanglei.model.HeatingTechInfoExample;

import java.util.List;

public interface HeatingTechInfoMapper {
    int countByExample(HeatingTechInfoExample example);

    int deleteByExample(HeatingTechInfoExample example);

    int deleteByPrimaryKey(String heatTreatmentInfoId);

    int insert(HeatingTechInfo record);

    int insertSelective(HeatingTechInfo record);

    List<HeatingTechInfo> selectByExample(HeatingTechInfoExample example);

    HeatingTechInfo selectByPrimaryKey(String heatTreatmentInfoId);

    int updateByPrimaryKeySelective(HeatingTechInfo record);

    int updateByPrimaryKey(HeatingTechInfo record);
}