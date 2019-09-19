package com.example.demo.mh_service_impl;

import com.example.demo.mh_dao.NavBarMapper;
import com.example.demo.mh_entity.NavBar;
import com.example.demo.mh_service.MhNavBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * NavBar 导航栏
 */
@Component
@Transactional
@Service
public class MhNavBarServiceipml implements MhNavBarService {
    private final NavBarMapper navBarMapper;

    @Autowired
    public MhNavBarServiceipml(NavBarMapper navBarMapper) {
        this.navBarMapper = navBarMapper;
    }

    /**
     * 通过id获取指定导航栏
     * @param id
     * @return
     */
    public NavBar selectByPrimaryKey(int id){
        return navBarMapper.selectByPrimaryKey(id);
    }

    /**
     *  获取全部导航栏
     * @return
     */
    public List<NavBar> selectAll(){
        return navBarMapper.selectAll();
    }

    /**
     * 删除指定id导航栏
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(int id){
        return navBarMapper.deleteByPrimaryKey(id);
    }

    /**
     * 添加导航栏
     * @param navBar
     * @return
     */
    public int insert(NavBar navBar){
        return navBarMapper.insert(navBar);
    }
}
