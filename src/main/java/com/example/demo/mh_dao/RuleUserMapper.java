package com.example.demo.mh_dao;

import com.example.demo.mh_entity.RuleUser;

import java.util.List;

public interface RuleUserMapper {
    int deleteRuleUserById(Integer id);

    int addRuleUser(RuleUser record);

    int insertSelective(RuleUser record);

    RuleUser selectRuleUserById(Integer id);

    List<RuleUser> selectAllRuleUser();

    int updateByPrimaryKeySelective(RuleUser record);

    int updateByPrimaryKey(RuleUser record);
}