package com.example.demo.mh_api;

import com.example.demo.mh_entity.HomePhoto;
import com.example.demo.mh_entity.ResponseResult;
import com.example.demo.mh_service.MhHomePhotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MH05：首页照片信息
 * 作者：程昱
 * 日期：2019/9/20
 */
@RestController
@CrossOrigin
@Api("MH05: 首页图片信息")
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

    /**
     * 上传图片文件信息
     * @param massage
     * @param sign
     * @param location
     * @return
     */
    @ApiOperation(value = "上传图片文件信息", notes = "上传图片文件信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public int insert(String massage, Integer sign, String location){
        HomePhoto homePhoto = new HomePhoto(massage,sign,location);
        return mhHomePhotoService.insert(homePhoto);
    }

    /**
     * 通过id删除首页照片信息
     * @param id
     * @return
     */
    @ApiOperation(value = "通过id删除首页照片信息", notes = "通过id删除首页照片信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A04")
    int deleteByPrimaryKey(int id){
        return mhHomePhotoService.deleteByPrimaryKey(id);
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/A05")
//    public String upload(@RequestParam("fileName")MultipartFile file, Map<String,Object> map){
//        //要上传的目标文件存放路径
//        String localPath = "H:/webstormProject/vue-demo/static/img";
//        //上传成功或者失败的提示
////        String mag = "";
//////        return mag;
//
////        if (FileUtils.upload)
//
//
//
//        ResponseResult result = new ResponseResult();
//        Map<String, Object> map = new HashMap<String, Object>();
//        File targetFile=null;
//        String url="";//返回存储路径
//        int code=1;
//        System.out.println(file);
//        String fileName=file.getOriginalFilename();//获取文件名加后缀
//        if(fileName!=null&&fileName!=""){
//            String returnUrl = localPath + file.getName();//存储路径
//            String path = localPath + file.getName(); //文件存储位置
//
//            //先判断文件是否存在
//            //获取文件夹路径
//            File file1 =new File(localPath);
//            //如果文件夹不存在则创建
//            if(!file1 .exists()  && !file1 .isDirectory()){
//                file1 .mkdir();
//            }
//            //将图片存入文件夹
//            targetFile = new File(file1, fileName);
//            try {
//                //将上传的文件写到服务器上指定的文件。
//                file.transferTo(targetFile);
//                url=returnUrl+fileAdd+"/"+fileName;
//                code=0;
//                result.setCode(code);
//                result.setMessage("图片上传成功");
//                map.put("url", url);
//                result.setResult(map);
//            } catch (Exception e) {
//                e.printStackTrace();
//                result.setMessage("系统异常，图片上传失败");
//            }
//        }
//        writeJson(response, result);
//    }

}
