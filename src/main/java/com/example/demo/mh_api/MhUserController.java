package com.example.demo.mh_api;

import com.example.demo.mh_entity.User;
import com.example.demo.mh_service.MhUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * MH01: User
 * 作者：程昱
 * 日期：2019/9/16
 */
@RestController
@CrossOrigin
@Api("MH02: 用户")
@RequestMapping("/MH02")
public class MhUserController {
    private final MhUserService mhUserService;

    @Autowired
    public MhUserController(MhUserService mhUserService){
        this.mhUserService = mhUserService;
    }

    /**
     * login 用户登录
     * @param account
     * @param password
     * @return
     */
    @ApiOperation(value = "用户登录", notes = "用户登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public Boolean getUserByAccountAndPassword(String account,String password){
        User selectUser = new User(account,password);
        User user = mhUserService.loginByAccountAndPassword(selectUser);
        if (user != null){
            return true;
        }else
            return false;
    }


    /**
     * 查找所有用户
     * @return
     */
    @ApiOperation(value = "查找所有用户", notes = "获取所有用户", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    List<User> selectAllUser(){
        return mhUserService.selectAllUser();
    }

    /**
     * 添加用户
     * @param account
     * @param password
     * @param phone
     * @param address
     * @param gender
     * @param remark
     * @return
     */
    @ApiOperation(value = "添加用户", notes = "添加用户", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    int addUser(String account, String password, String phone, String address, String gender, String remark){
        User user = new  User(null,account,password,phone,address,gender,remark,null,null);
        return mhUserService.addUser(user);
    }

    /***
     * 删除用户
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id删除用户", notes = "删除指定id用户", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A04")
    int deleteUserById(int id){
        return mhUserService.deleteUserById(id);
    }

}
