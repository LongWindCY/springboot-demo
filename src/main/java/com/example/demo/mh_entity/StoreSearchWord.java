package com.example.demo.mh_entity;

public class StoreSearchWord {
    private Integer pageSize;
    private Integer offset;
    private String keyword;
    public StoreSearchWord(){

    }
    public StoreSearchWord(Integer pageSize, Integer offset, String keyword){
        this.pageSize = pageSize;
        this.offset = offset;
        this.keyword = keyword;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getOffset() {
        return offset;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
