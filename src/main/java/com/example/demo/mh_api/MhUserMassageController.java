package com.example.demo.mh_api;

import com.example.demo.mh_entity.MassageSearchWord;
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
    public UserMassage selectByPrimaryKey(int id){
        return mhUserMassageService.selectByPrimaryKey(id);
    }

    /**
     * 查找所有用户信息(分页/搜索)
     * @return
     */
    @ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET,value = "/A02")
    public List<UserMassage> selectAll(Integer page,
                                Integer pageSize,
                                String searchAccount) {
        Integer offset = (page - 1)*pageSize;
        MassageSearchWord massageSearchWord = new MassageSearchWord(pageSize,offset,searchAccount);
        return mhUserMassageService.selectAll(massageSearchWord);
    }

    /**
     * 删除指定用户信息
     * @param id
     * @return
     */
    @ApiOperation(value = "id删除用户信息", notes = "删除用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET,value = "/A03")
    public int deleteByPrimaryKey(int id){
        return mhUserMassageService.deleteByPrimaryKey(id);
    }

    /**
     * 添加用户信息
     * @param user_id
     * @param account
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
    public int insert(int user_id,String account, double height,double weight,double bust, double waist_line, double hip_line, double shoulder_line,
               double sleeve_length, double clothing_length, double trousers_length){
        UserMassage userMassage = new UserMassage(user_id,account, height, weight, bust, waist_line, hip_line, shoulder_line,
         sleeve_length, clothing_length, trousers_length);
        return mhUserMassageService.insert(userMassage);
    }

    /**
     * 用户信息总条目（分页/搜索）
     * @param page
     * @param pageSize
     * @param searchAccount
     * @return
     */
    @ApiOperation(value = "用户信息总条目", notes = "用户信息总条目", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET,value = "/A05")
    public int countUserMassage(Integer page,
                                       Integer pageSize,
                                       String searchAccount) {
        Integer offset = (page - 1)*pageSize;
        MassageSearchWord massageSearchWord = new MassageSearchWord(pageSize,offset,searchAccount);
        return mhUserMassageService.countUserMassage(massageSearchWord);
    }


    /**
     * 更新用户信息
     * @param id
     * @param userId
     * @param account
     * @param height
     * @param weight
     * @param bust
     * @param waistLine
     * @param hipLine
     * @param shoulderWidth
     * @param sleeveLength
     * @param clothingLength
     * @param trousersLength
     * @return
     */
    @ApiOperation(value = "更新用户信息", notes = "更新用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST,value = "/A06")
    public int updateByPrimaryKey(Integer id,
                                  Integer userId,
                                  String account,
                                  Double height,
                                  Double weight,
                                  Double bust,
                                  Double waistLine,
                                  Double hipLine,
                                  Double shoulderWidth,
                                  Double sleeveLength,
                                  Double clothingLength,
                                  Double trousersLength){
        UserMassage userMassage = new UserMassage(id, userId, account, height, weight, bust, waistLine, hipLine, shoulderWidth,
                sleeveLength, clothingLength, trousersLength,null);
        return mhUserMassageService.updateByPrimaryKey(userMassage);
    }
}
