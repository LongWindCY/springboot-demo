package com.example.demo.mh_dao;

import com.example.demo.mh_entity.ArticleClass;

public interface ArticleClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleClass record);

    int insertSelective(ArticleClass record);

    ArticleClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleClass record);

    int updateByPrimaryKey(ArticleClass record);
}