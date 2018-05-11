package com.wanglei.dao;

import com.wanglei.model.ProductionBatchInfo;
import com.wanglei.model.ProductionBatchInfoExample;

import java.util.List;

public interface ProductionBatchInfoMapper {
    int countByExample(ProductionBatchInfoExample example);

    int deleteByExample(ProductionBatchInfoExample example);

    int deleteByPrimaryKey(String batchId);

    int insert(ProductionBatchInfo record);

    int insertSelective(ProductionBatchInfo record);

    List<ProductionBatchInfo> selectByExample(ProductionBatchInfoExample example);

    ProductionBatchInfo selectByPrimaryKey(String batchId);

    int updateByPrimaryKeySelective(ProductionBatchInfo record);

    int updateByPrimaryKey(ProductionBatchInfo record);
}