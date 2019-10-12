package com.example.demo.mh_dao;

import com.example.demo.mh_entity.Store;
import com.example.demo.mh_entity.StoreSearchWord;

import java.util.List;

public interface StoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);

    List<Store> selectAllStore(StoreSearchWord storeSearchWord);
}