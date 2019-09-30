package com.example.demo.mh_service_impl;

import com.example.demo.mh_dao.RuleUserMapper;
import com.example.demo.mh_entity.RuleUser;
import com.example.demo.mh_service.MhRuleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * RuleUser 管理员
 */
@Component
@Transactional
@Service
public class MhRuleUserServiceipml implements MhRuleUserService {
    private final RuleUserMapper ruleUserMapper;

    @Autowired
    public MhRuleUserServiceipml(RuleUserMapper ruleUserMapper){
        this.ruleUserMapper = ruleUserMapper;
    }

    /**
     * id查询管理员
     * @param id
     * @return
     */
    public RuleUser selectRuleUserById(int id){
        return ruleUserMapper.selectRuleUserById(id);
    }

    /**
     * 查询所有管理员
     * @return
     */
    public List<RuleUser> selectAllRuleUser (){
        return ruleUserMapper.selectAllRuleUser();
    }

    /**
     * 添加管理员
     * @param ruleUser
     * @return
     */
    public int addRuleUser(RuleUser ruleUser){
        return ruleUserMapper.addRuleUser(ruleUser);
    }

    /**
     * 删除管理员
     * @param id
     * @return
     */
    public int deleteRuleUserById(int id){
        return ruleUserMapper.deleteRuleUserById(id);
    }

    public RuleUser loginByAccountAndPassword(RuleUser ruleUser){
        return ruleUserMapper.loginByAccountAndPassword(ruleUser);
    }
}
