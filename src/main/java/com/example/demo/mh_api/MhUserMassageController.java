package com.example.demo.mh_api;

import com.example.demo.mh_entity.UserMassage;
import com.example.demo.mh_service.MhUserMassageService;
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
 * MH03: UserMassage
 * 作者：程昱
 * 日期：2019/9/18
 */
@RestController
@CrossOrigin
@Api("MH03: 用户信息")
@RequestMapping("/MH03")
public class MhUserMassageController {
    private final MhUserMassageService mhUserMassageService;

    @Autowired
    public MhUserMassageController(MhUserMassageService mhUserMassageService){
        this.mhUserMassageService = mhUserMassageService;
    }

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id获取用户信息", notes = "获取指定id用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET,value = "/A01")
    UserMassage selectByPrimaryKey(int id){
        return mhUserMassageService.selectByPrimaryKey(id);
    }

    /**
     * 查找所有用户信息
     * @return
     */
    @ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET,value = "/A02")
    List<UserMassage> selectAll(){
        return mhUserMassageService.selectAll();
    }

    /**
     * 删除指定用户信息
     * @param id
     * @return
     */
    @ApiOperation(value = "id删除用户信息", notes = "删除用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET,value = "/A03")
    int deleteByPrimaryKey(int id){
        return mhUserMassageService.deleteByPrimaryKey(id);
    }

    /**
     * 添加用户信息
     * @param user_id
     * @param height
     * @param weight
     * @param bust
     * @param waist_line
     * @param hip_line
     * @param shoulder_line
     * @param sleeve_length
     * @param clothing_length
     * @param trousers_length
     * @return
     */
    @ApiOperation(value = "添加用户信息", notes = "添加用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST,value = "/A04")
    int insert(int user_id, double height,double weight,double bust, double waist_line, double hip_line, double shoulder_line,
               double sleeve_length, double clothing_length, double trousers_length){
        UserMassage userMassage = new UserMassage(user_id, height, weight, bust, waist_line, hip_line, shoulder_line,
         sleeve_length, clothing_length, trousers_length);
        return mhUserMassageService.insert(userMassage);
    }
}
