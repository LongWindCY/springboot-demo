package com.example.demo.mh_api;

import com.example.demo.mh_entity.HomePhoto;
import com.example.demo.mh_service.MhHomePhotoService;
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
 * MH05：首页照片信息
 * 作者：程昱
 * 日期：2019/9/20
 */
@RestController
@CrossOrigin
@Api("MH05: 导航栏")
@RequestMapping("/MH05")
public class MhHomePhotoController {
    private final MhHomePhotoService mhHomePhotoService;

    @Autowired
    public MhHomePhotoController(MhHomePhotoService mhHomePhotoService){
        this.mhHomePhotoService = mhHomePhotoService;
    }

    /**
     * 通过id获取首页照片信息
     * @param id
     * @return
     */
    @ApiOperation(value = "通过id获取首页照片信息", notes = "通过id获取首页照片信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    HomePhoto selectByPrimaryKey(int id){
        return mhHomePhotoService.selectByPrimaryKey(id);
    }
    /**
     * 获取全部首页图片信息
     * @return
     */
    @ApiOperation(value = "获取全部首页图片信息", notes = "获取全部首页图片信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    List<HomePhoto> selectAll(){
        return mhHomePhotoService.selectAll();
    }


}
