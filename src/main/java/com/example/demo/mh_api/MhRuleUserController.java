package com.example.demo.mh_api;

import com.example.demo.mh_entity.RuleUser;
import com.example.demo.mh_service.MhRuleUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * MH02:RuleUser
 * 作者：程昱
 * 日期：2019/9/17
 */
@RestController
@CrossOrigin
@Api("MH01: 管理员")
@RequestMapping("/MH01")
public class MhRuleUserController {
    private final MhRuleUserService mhRuleUserService;

    @Autowired
    public MhRuleUserController(MhRuleUserService mhRuleUserService){
        this.mhRuleUserService = mhRuleUserService;
    }

    /**
     * 获取管理员
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id获取管理员", notes = "获取指定id管理员", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    RuleUser selectRuleUserById(int id){
        return mhRuleUserService.selectRuleUserById(id);
    }

    /**
     * 查找所有管理员
     * @return
     */
    @ApiOperation(value = "查找所有管理员", notes = "查找所有管理员", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    List<RuleUser> selectAllRuleUser(){
        return mhRuleUserService.selectAllRuleUser();
    }

    /**
     * 添加管理员
     * @param account
     * @param password
     * @param power
     * @param remark
     * @return
     */
    @ApiOperation(value = "添加管理员", notes = "添加管理员", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    int addUser(String account, String password,int power, String remark){
        RuleUser ruleUser = new RuleUser(account,password,remark,power);
        return mhRuleUserService.addRuleUser(ruleUser);
    }

    /**
     * id删除管理员
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id删除管理员", notes = "根据id删除管理员", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A04")
    int deleteRuleUserById(int id){
        return mhRuleUserService.deleteRuleUserById(id);
    }

    /**
     * login 用户登录
     * @param account
     * @param password
     * @return
     */
    @ApiOperation(value = "用户登录", notes = "用户登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public RuleUser getUserByAccountAndPassword( String account, String password){
        RuleUser selectUser = new RuleUser(account,password);
        RuleUser user = mhRuleUserService.loginByAccountAndPassword(selectUser);
        if (user != null){
            return user;
        }else
            return null;
    }
}
