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

    /**
     * 文章统计（分页/查询）
     * @param articleSearchWord
     * @return
     */
    public int countArticle(ArticleSearchWord articleSearchWord){
        return articleMapper.countArticle(articleSearchWord);
    }

    /**
     * 删除文章id
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(Integer id){
        return articleMapper.deleteByPrimaryKey(id);
    }
}
