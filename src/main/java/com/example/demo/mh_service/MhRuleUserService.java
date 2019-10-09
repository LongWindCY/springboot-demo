package com.example.demo.mh_service;

import com.example.demo.mh_entity.RuleUser;

import java.util.List;

public interface MhRuleUserService extends MhBseService {

    RuleUser selectRuleUserById(int id);

    List<RuleUser> selectAllRuleUser(Integer pageSize,Integer offset);

    int addRuleUser(RuleUser ruleUser);

    int deleteRuleUserById(int id);

    RuleUser loginByAccountAndPassword(RuleUser ruleUser);

    int countRuleUser();

    int updateByPrimaryKey(RuleUser ruleUser);
}
