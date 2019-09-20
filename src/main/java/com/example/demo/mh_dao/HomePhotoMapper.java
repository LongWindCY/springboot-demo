package com.example.demo.mh_dao;

import com.example.demo.mh_entity.HomePhoto;

import java.util.List;

public interface HomePhotoMapper {
    int deleteByPrimaryKey(Integer id);

    List<HomePhoto> selectAll();

    int insert(HomePhoto record);

    int insertSelective(HomePhoto record);

    HomePhoto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomePhoto record);

    int updateByPrimaryKey(HomePhoto record);
}