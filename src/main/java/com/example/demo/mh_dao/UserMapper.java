package com.example.demo.mh_dao;

import com.example.demo.mh_entity.User;

import java.util.List;

public interface UserMapper {
    int deleteUserById(Integer id);

    int addUser(User record);

    List<User> selectAllUser();

    User selectUserById(Integer id);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}