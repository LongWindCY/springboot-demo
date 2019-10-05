package com.example.demo.mh_service;

import com.example.demo.mh_entity.User;
import com.example.demo.mh_entity.UserSearchWord;

import java.util.List;

public interface MhUserService extends MhBseService {

    User selectUserById(int id);

    User loginByAccountAndPassword(User user);

    int addUser(User user);

    int deleteUserById(int id);

    List<User> selectAllUser(UserSearchWord userSearchWord);

    int countUser(UserSearchWord userSearchWord);
}
