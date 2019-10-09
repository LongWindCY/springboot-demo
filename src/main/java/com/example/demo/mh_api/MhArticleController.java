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

    /**
     * 文章统计(分页/查询)
     * @param page
     * @param pageSize
     * @param classId
     * @param searchTitle
     * @return
     */
    @ApiOperation(value = "文章统计(分页/查询)", notes = "文章统计(分页/查询)", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    public int countArticle(Integer page,
                                        Integer pageSize,
                                        Integer classId,
                                        String searchTitle){
        Integer offset = (page - 1)*pageSize;
        ArticleSearchWord articleSearchWord = new ArticleSearchWord(pageSize,offset,classId,searchTitle);
        return mhArticleService.countArticle(articleSearchWord);
    }

    /**
     * 删除文章id
     * @param id
     * @return
     */
    @ApiOperation(value = "删除文章", notes = "删除文章", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public int deleteByPrimaryKey(Integer id){
        return mhArticleService.deleteByPrimaryKey(id);
    }

    /**
     * 获取文章id
     * @param id
     * @return
     */
    @ApiOperation(value = "获取文章id", notes = "获取文章id", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A04")
    public Article selectByPrimaryKey(Integer id){
        return mhArticleService.selectByPrimaryKey(id);
    }

}
