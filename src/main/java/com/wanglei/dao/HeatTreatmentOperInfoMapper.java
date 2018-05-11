package com.wanglei.dao;

import com.wanglei.model.HeatTreatmentOperInfo;
import com.wanglei.model.HeatTreatmentOperInfoExample;

import java.util.List;

public interface HeatTreatmentOperInfoMapper {
    int countByExample(HeatTreatmentOperInfoExample example);

    int deleteByExample(HeatTreatmentOperInfoExample example);

    int deleteByPrimaryKey(String heatTreatmentId);

    int insert(HeatTreatmentOperInfo record);

    int insertSelective(HeatTreatmentOperInfo record);

    List<HeatTreatmentOperInfo> selectByExample(HeatTreatmentOperInfoExample example);

    HeatTreatmentOperInfo selectByPrimaryKey(String heatTreatmentId);

    int updateByPrimaryKeySelective(HeatTreatmentOperInfo record);

    int updateByPrimaryKey(HeatTreatmentOperInfo record);
}