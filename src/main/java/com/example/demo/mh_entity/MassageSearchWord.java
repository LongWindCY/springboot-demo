package com.example.demo.mh_entity;

public class MassageSearchWord {
    private Integer pageSize;

    private Integer offset;

    private String searchAccount;

    public MassageSearchWord(){}

    public MassageSearchWord(Integer pageSize, Integer offset, String searchAccount){
        this.pageSize = pageSize;
        this.offset = offset;
        this.searchAccount = searchAccount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getOffset() {
        return offset;
    }

    public String getSearchAccount() {
        return searchAccount;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setSearchAccount(String searchAccount) {
        this.searchAccount = searchAccount;
    }
}
