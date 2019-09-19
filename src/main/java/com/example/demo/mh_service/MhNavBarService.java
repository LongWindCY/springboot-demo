package com.example.demo.mh_service;

import com.example.demo.mh_entity.NavBar;

import java.util.List;

public interface MhNavBarService extends MhBseService {

    NavBar selectByPrimaryKey(int id);

    List<NavBar> selectAll();

    int deleteByPrimaryKey(int id);

    int insert(NavBar navBar);

}
