package com.example.demo.mh_entity;

public class UserSearchWord {
    private Integer pageSize;

    private Integer offset;

    private String searchAccount;

    private String searchAddress;

    private String searchPhone;

    private String searchGender;

    public UserSearchWord(){}

    public UserSearchWord(Integer pageSize,
                          Integer offset,
                          String searchAccount,
                          String searchAddress,
                          String searchPhone,
                          String searchGender){
        this.pageSize = pageSize;
        this.offset = offset;
        this.searchAccount = searchAccount;
        this.searchAddress = searchAddress;
        this.searchGender = searchGender;
        this.searchPhone = searchPhone;
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

    public String getSearchAddress() {
        return searchAddress;
    }

    public String getSearchPhone() {
        return searchPhone;
    }

    public String getSearchGender() {
        return searchGender;
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

    public void setSearchAddress(String searchAddress) {
        this.searchAddress = searchAddress;
    }

    public void setSearchPhone(String searchPhone) {
        this.searchPhone = searchPhone;
    }

    public void setSearchGender(String searchGender) {
        this.searchGender = searchGender;
    }
}
