package com.example.demo.mh_entity;

public class ArticleSearchWord {

    private Integer pageSize;

    private Integer offset;

    private Integer classId;

    private String searchTitle;

    public ArticleSearchWord(){}

    public ArticleSearchWord(Integer pageSize, Integer offset, Integer classId, String searchTitle){
        this.pageSize = pageSize;
        this.offset = offset;
        this.classId = classId;
        this.searchTitle = searchTitle;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getClassId() {
        return classId;
    }

    public String getSearchTitle() {
        return searchTitle;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public void setSearchTitle(String searchTitle) {
        this.searchTitle = searchTitle;
    }
}
