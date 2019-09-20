package com.example.demo.mh_service;

import com.example.demo.mh_entity.HomePhoto;

import java.util.List;

public interface MhHomePhotoService extends MhBseService {

    HomePhoto selectByPrimaryKey(int id);

    List<HomePhoto> selectAll();
}
