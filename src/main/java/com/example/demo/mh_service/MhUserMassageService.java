package com.example.demo.mh_service;

import com.example.demo.mh_entity.UserMassage;

import java.util.List;

public interface MhUserMassageService extends MhBseService {
    UserMassage selectByPrimaryKey(int id);

    List<UserMassage> selectAll();

    int deleteByPrimaryKey(int id);

    int insert(UserMassage userMassage);
}
