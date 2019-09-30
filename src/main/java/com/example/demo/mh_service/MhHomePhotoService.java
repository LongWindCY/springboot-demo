package com.example.demo.mh_service;

import com.example.demo.mh_entity.HomePhoto;

import java.util.List;

public interface MhHomePhotoService extends MhBseService {

    int insert(HomePhoto homePhoto);

    HomePhoto selectByPrimaryKey(int id);

    List<HomePhoto> selectAll();

    int deleteByPrimaryKey(int id);
}
