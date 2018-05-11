package com.wanglei.dao;

import com.wanglei.model.EquipmentInfo;
import com.wanglei.model.EquipmentInfoExample;

import java.util.List;

public interface EquipmentInfoMapper {
    int countByExample(EquipmentInfoExample example);

    int deleteByExample(EquipmentInfoExample example);

    int deleteByPrimaryKey(String equipmentId);

    int insert(EquipmentInfo record);

    int insertSelective(EquipmentInfo record);

    List<EquipmentInfo> selectByExample(EquipmentInfoExample example);

    EquipmentInfo selectByPrimaryKey(String equipmentId);

    int updateByPrimaryKeySelective(EquipmentInfo record);

    int updateByPrimaryKey(EquipmentInfo record);
}