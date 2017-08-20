package com.ajilisiwei.it.dao;

import com.ajilisiwei.it.domain.City;


public interface CityDao {

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}