package com.example.demo.mh_service;

import com.example.demo.mh_entity.Article;
import com.example.demo.mh_entity.ArticleSearchWord;

import java.util.List;

public interface MhArticleService extends MhBseService{
    List<Article> getAllArticles(ArticleSearchWord articleSearchWord);

    int countArticle(ArticleSearchWord articleSearchWord);

    int deleteByPrimaryKey(Integer id);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeyWithBLOBs(Article article);
}
