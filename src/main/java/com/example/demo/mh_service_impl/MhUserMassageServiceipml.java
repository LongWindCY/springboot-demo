package com.example.demo.mh_service_impl;

import com.example.demo.mh_dao.UserMassageMapper;
import com.example.demo.mh_entity.UserMassage;
import com.example.demo.mh_service.MhUserMassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户信息
 */
@Component
@Transactional
@Service
public class MhUserMassageServiceipml implements MhUserMassageService {
    private final UserMassageMapper userMassageMapper;

    @Autowired
    public MhUserMassageServiceipml(UserMassageMapper userMassageMapper){
        this.userMassageMapper = userMassageMapper;
    }

    /**
     * id查询用户信息
     * @param id
     * @return
     */
    public UserMassage selectByPrimaryKey(int id){
        return userMassageMapper.selectByPrimaryKey(id);
    }

    /**
     * 添加用户信息
     * @param userMassage
     * @return
     */
    public int insert(UserMassage userMassage){
        return userMassageMapper.insert(userMassage);
    }

    /**
     * id删除用户信息
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(int id){
        return userMassageMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询所有用户信息
     * @return
     */
    public List<UserMassage> selectAll(){
        return userMassageMapper.selectAll();
    }
}
