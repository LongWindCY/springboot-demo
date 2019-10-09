package com.example.demo.mh_dao;

import com.example.demo.mh_entity.Article;
import com.example.demo.mh_entity.ArticleSearchWord;

import java.util.List;

public interface ArticleMapper {

    List<Article> getAllArticles(ArticleSearchWord articleSearchWord);

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}