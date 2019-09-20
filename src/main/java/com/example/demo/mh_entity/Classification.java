package com.example.demo.mh_entity;

public class Classification {
    private Integer id;

    private Integer navId;

    private String title;

    private String remark;

    public Classification(Integer id, Integer navId, String title, String remark) {
        this.id = id;
        this.navId = navId;
        this.title = title;
        this.remark = remark;
    }

    public Classification() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNavId() {
        return navId;
    }

    public void setNavId(Integer navId) {
        this.navId = navId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}