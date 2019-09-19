package com.example.demo.mh_dao;

import com.example.demo.mh_entity.NavBar;

import java.util.List;

public interface NavBarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NavBar record);

    int insertSelective(NavBar record);

    NavBar selectByPrimaryKey(Integer id);

    List<NavBar> selectAll();

    int updateByPrimaryKeySelective(NavBar record);

    int updateByPrimaryKey(NavBar record);
}