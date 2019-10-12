package com.example.demo.mh_service_impl;

import com.example.demo.mh_dao.StoreMapper;
import com.example.demo.mh_entity.Store;
import com.example.demo.mh_entity.StoreSearchWord;
import com.example.demo.mh_service.MhStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Service
public class MhStoreServiceipml implements MhStoreService {
    private final StoreMapper storeMapper;

    @Autowired
    public MhStoreServiceipml(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    /**
     * 线下门店（分页/查询）
     * @param storeSearchWord
     * @return
     */
    public List<Store> selectAllStore(StoreSearchWord storeSearchWord){
        return storeMapper.selectAllStore(storeSearchWord);
    }

    /**
     * 统计
     * @param storeSearchWord
     * @return
     */
    public int countAllStore(StoreSearchWord storeSearchWord){
        return storeMapper.countAllStore(storeSearchWord);
    }
}
