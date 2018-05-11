package com.wanglei.dao;


import org.apache.ibatis.annotations.Param;

public interface BaseMapper {
    Long getSequenceNum( @Param("sequenceName")String  sequenceName);
}