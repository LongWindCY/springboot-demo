package com.example.demo.mh_dao;

import com.example.demo.mh_entity.User;
import com.example.demo.mh_entity.UserSearchWord;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserMapper {
    int deleteUserById(@Param("id")Integer id);

    int addUser(User record);

    List<User> selectAllUser(UserSearchWord userSearchWord);

    User selectUserById(@Param("id") Integer id);

    int insertSelective(User record);
    //id更新
    int updateByPrimaryKeySelective(User record);
    //更新
    int updateByPrimaryKey(User record);
    //登录
    User loginByAccountAndPassword(User user);
    //用户总条目
    int countUser(UserSearchWord userSearchWord);
}