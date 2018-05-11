package com.wanglei.dao;

import com.wanglei.model.MaterialsInfo;
import com.wanglei.model.MaterialsInfoExample;

import java.util.List;

public interface MaterialsInfoMapper {
    int countByExample(MaterialsInfoExample example);

    int deleteByExample(MaterialsInfoExample example);

    int deleteByPrimaryKey(String materialsId);

    int insert(MaterialsInfo record);

    int insertSelective(MaterialsInfo record);

    List<MaterialsInfo> selectByExample(MaterialsInfoExample example);

    MaterialsInfo selectByPrimaryKey(String materialsId);

    int updateByPrimaryKeySelective(MaterialsInfo record);

    int updateByPrimaryKey(MaterialsInfo record);
}