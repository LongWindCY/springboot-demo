package com.example.demo.mh_api;

import com.example.demo.mh_entity.NavBar;
import com.example.demo.mh_service.MhNavBarService;
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
 * MH04: 导航栏
 * 作者：程昱
 * 日期：2019/9/19
 */
@RestController
@CrossOrigin
@Api("MH04: 导航栏")
@RequestMapping("/MH04")
public class MhNavBarController {
    private final MhNavBarService mhNavBarService;

    @Autowired
    public MhNavBarController(MhNavBarService mhNavBarService){
        this.mhNavBarService = mhNavBarService;
    }

    /**
     * 通过id获取指定导航栏
     * @param id
     * @return
     */
    @ApiOperation(value = "通过id获取指定导航栏", notes = "通过id获取指定导航栏", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public NavBar selectByPrimaryKey(int id){
        return mhNavBarService.selectByPrimaryKey(id);
    }

    /**
     * 获取全部导航栏
     * @return
     */
    @ApiOperation(value = "获取全部导航栏", notes = "获取全部导航栏", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    public List<NavBar> selectAll(){
        return mhNavBarService.selectAll();
    }

    /**
     * 删除指定id导航栏
     * @param id
     * @return
     */
    @ApiOperation(value = "删除指定id导航栏", notes = "删除指定id导航栏", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    public int deleteByPrimaryKey(int id){
        return mhNavBarService.deleteByPrimaryKey(id);
    }

    /**
     * 添加导航栏
     * @param title
     * @param parent_id
     * @return
     */
    @ApiOperation(value = "添加导航栏", notes = "添加导航栏", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public int insert(String title, Integer parent_id){
        NavBar navBar = new NavBar(title, parent_id);
        return mhNavBarService.insert(navBar);
    }


}
