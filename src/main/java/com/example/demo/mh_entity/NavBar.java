package com.example.demo.mh_entity;

public class NavBar {
    private Integer id;

    private String title;

    private Integer parentId;

    public NavBar(Integer id, String title, Integer parentId) {
        this.id = id;
        this.title = title;
        this.parentId = parentId;
    }
    public NavBar(String title, Integer parentId){
        this.id = null;
        this.title = title;
        this.parentId = parentId;
    }


    public NavBar() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}