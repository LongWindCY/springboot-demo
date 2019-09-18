package com.example.demo.mh_service;

import com.example.demo.mh_entity.User;

import java.util.List;

public interface MhUserService extends MhBseService {

    User selectUserById(int id);

    int addUser(User user);

    int deleteUserById(int id);

    List<User> selectAllUser();
}
