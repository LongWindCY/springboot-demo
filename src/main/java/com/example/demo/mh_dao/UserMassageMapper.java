package com.example.demo.mh_dao;

import com.example.demo.mh_entity.UserMassage;

import java.util.List;

public interface UserMassageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMassage record);

    int insertSelective(UserMassage record);

    List<UserMassage> selectAll();

    UserMassage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMassage record);

    int updateByPrimaryKey(UserMassage record);
}