package com.example.demo.mh_service_impl;

import com.example.demo.mh_dao.ArticleMapper;
import com.example.demo.mh_entity.Article;
import com.example.demo.mh_entity.ArticleSearchWord;
import com.example.demo.mh_service.MhArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Service
public class MhArticleServiceipml implements MhArticleService {
    private final ArticleMapper articleMapper;

    @Autowired
    public MhArticleServiceipml(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    /**
     * 获取所有文章（分页/查询）
     * @param articleSearchWord
     * @return
     */
    public List<Article> getAllArticles(ArticleSearchWord articleSearchWord){
        return articleMapper.getAllArticles(articleSearchWord);
    }
}
