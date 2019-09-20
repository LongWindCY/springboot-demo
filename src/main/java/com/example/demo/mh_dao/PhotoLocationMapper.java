package com.example.demo.mh_dao;

import com.example.demo.mh_entity.PhotoLocation;

public interface PhotoLocationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhotoLocation record);

    int insertSelective(PhotoLocation record);

    PhotoLocation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhotoLocation record);

    int updateByPrimaryKey(PhotoLocation record);
}