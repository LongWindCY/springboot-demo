package com.example.demo.mh_service_impl;

import com.example.demo.mh_dao.UserMapper;
import com.example.demo.mh_entity.User;
import com.example.demo.mh_service.MhUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User 用户
 */
@Component
@Transactional
@Service
public class MhUserServiceimpl implements MhUserService {
    private final UserMapper userMapper;

    @Autowired
    public MhUserServiceimpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 查找所有用户
     * @return
     */
    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user){
        return userMapper.addUser(user);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    public int deleteUserById(int id){
        return userMapper.deleteUserById(id);
    }

    /**
     * 查找所有用户
     * @return
     */
    public List<User> selectAllUser(){
        return userMapper.selectAllUser();
    }

    /**
     * login
     * @param user
     * @return
     */
    public User loginByAccountAndPassword(User user){
        return userMapper.loginByAccountAndPassword(user);
    }
}
