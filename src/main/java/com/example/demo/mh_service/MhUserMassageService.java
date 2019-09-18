package com.example.demo.mh_service;

import com.example.demo.mh_entity.UserMassage;

public interface MhUserMassageService extends MhBseService {
    UserMassage selectByPrimaryKey(int id);
}
