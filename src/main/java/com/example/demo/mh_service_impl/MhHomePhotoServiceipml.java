package com.example.demo.mh_service_impl;

import com.example.demo.mh_dao.HomePhotoMapper;
import com.example.demo.mh_entity.HomePhoto;
import com.example.demo.mh_service.MhHomePhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Service
public class MhHomePhotoServiceipml implements MhHomePhotoService {
    private final HomePhotoMapper homePhotoMapper;

    @Autowired
    public MhHomePhotoServiceipml(HomePhotoMapper homePhotoMapper) {
        this.homePhotoMapper = homePhotoMapper;
    }

    /**
     * 通过id获取首页图片信息
     * @param id
     * @return
     */
    public HomePhoto selectByPrimaryKey(int id){
        return homePhotoMapper.selectByPrimaryKey(id);
    }

    /***
     * 获取全部首页图片信息
     * @return
     */
    public List<HomePhoto> selectAll(){
        return homePhotoMapper.selectAll();
    }

    /**
     * 添加首页图片信息
     * @param homePhoto
     * @return
     */
    public int insert(HomePhoto homePhoto){
        return homePhotoMapper.insert(homePhoto);
    }

    /**
     * 根据id删除首页照片信息
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(int id){
        return homePhotoMapper.deleteByPrimaryKey(id);
    }
}
