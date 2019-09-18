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
}
