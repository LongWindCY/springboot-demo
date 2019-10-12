package com.example.demo.mh_api;

import com.example.demo.mh_entity.Store;
import com.example.demo.mh_entity.StoreSearchWord;
import com.example.demo.mh_service.MhStoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@Api("MH06: 线下商店")
@RequestMapping("/MH06")
public class MhStoreController {
    private final MhStoreService mhStoreService;

    @Autowired
    public MhStoreController(MhStoreService mhStoreService) {
        this.mhStoreService = mhStoreService;
    }

    /**
     * 所有店铺信息
     * @return
     */
    @ApiOperation(value = "店铺信息", notes = "店铺信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public List<Store> selectAllStore(Integer page,
                                      Integer pageSize,
                                      String keyword){
        Integer offset = (page - 1)*pageSize;
        StoreSearchWord storeSearchWord = new StoreSearchWord(pageSize,offset,keyword);
        return mhStoreService.selectAllStore(storeSearchWord);
    }
}
