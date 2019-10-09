package com.example.demo.mh_api;

import com.example.demo.mh_entity.Article;
import com.example.demo.mh_entity.ArticleSearchWord;
import com.example.demo.mh_service.MhArticleService;
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
@Api("MH09: 文章")
@RequestMapping("/MH09")
public class MhArticleController {
    private final MhArticleService mhArticleService;

    @Autowired
    public MhArticleController(MhArticleService mhArticleService) {
        this.mhArticleService = mhArticleService;
    }

    /**
     * 文章获取(分页/查询)
     * @param page
     * @param pageSize
     * @param classId
     * @param searchTitle
     * @return
     */
    @ApiOperation(value = "文章获取(分页/查询)", notes = "文章获取(分页/查询)", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public List<Article> getAllArticles(Integer page,
                                Integer pageSize,
                                Integer classId,
                                String searchTitle){
        Integer offset = (page - 1)*pageSize;
        ArticleSearchWord articleSearchWord = new ArticleSearchWord(pageSize,offset,classId,searchTitle);
        return mhArticleService.getAllArticles(articleSearchWord);
    }
}
