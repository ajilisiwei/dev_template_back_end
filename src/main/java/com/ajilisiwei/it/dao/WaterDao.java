package com.ajilisiwei.it.dao;

import com.ajilisiwei.it.domain.Water;
import com.ajilisiwei.it.pojo.WaterExtend;

import java.util.List;


public interface WaterDao {

    int deleteByPrimaryKey(Integer id);

    int insert(Water record);

    int insertSelective(Water record);

    Water selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Water record);

    int updateByPrimaryKey(Water record);

    List<WaterExtend> getWaterByCityId(Integer cityId);
}