package com.example.demo.mh_service;

import com.example.demo.mh_entity.Store;
import com.example.demo.mh_entity.StoreSearchWord;

import java.util.List;

public interface MhStoreService extends MhBseService{
    List<Store> selectAllStore(StoreSearchWord storeSearchWord);
}
