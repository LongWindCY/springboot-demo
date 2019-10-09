package com.example.demo.mh_api;

import com.example.demo.mh_entity.RuleUser;
import com.example.demo.mh_service.MhRuleUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public RuleUser selectRuleUserById(int id){
        return mhRuleUserService.selectRuleUserById(id);
    }

    /**
     * 查找所有管理员
     * @return
     */
    @ApiOperation(value = "查找所有管理员", notes = "查找所有管理员", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    public List<RuleUser> selectAllRuleUser(Integer page,
                                     Integer pageSize){
        Integer offset = (page - 1)*pageSize;
        return mhRuleUserService.selectAllRuleUser(pageSize,offset);
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
    public int addUser(String account, String password,int power, String remark){
        RuleUser ruleUser = new RuleUser(account,password,remark,power);
        return mhRuleUserService.addRuleUser(ruleUser);
    }

    /**
     * id删除管理员
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id删除管理员", notes = "根据id删除管理员", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public int deleteRuleUserById(int id){
        return mhRuleUserService.deleteRuleUserById(id);
    }

    /**
     * login 管理员登录
     * @param account
     * @param password
     * @return
     */
    @ApiOperation(value = "管理员登录", notes = "管理员登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public RuleUser getUserByAccountAndPassword(String account, String password){
//        System.out.println(account + password); //测试
        RuleUser selectUser = new RuleUser(account,password);
        RuleUser ruleUser = mhRuleUserService.loginByAccountAndPassword(selectUser);
        if (ruleUser != null){
            return ruleUser;
        }else
            return null;
    }

    /**
     * 管理员总条目
     * @return
     */
    @ApiOperation(value = "管理员总条目", notes = "管理员总条目", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A06")
    public int countRuleUser(){
        return mhRuleUserService.countRuleUser();
    }


    @ApiOperation(value = "权限设置", notes = "权限设置", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A07")
    public int updateByPrimaryKey(Integer id,
                               String account,
                               String password,
                               String remark,
                               Integer power){
        RuleUser ruleUser = new RuleUser(id,account,password,remark,power,null,null);
        return mhRuleUserService.updateByPrimaryKey(ruleUser);
    }
}
