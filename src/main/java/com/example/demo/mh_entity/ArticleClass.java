package com.example.demo.mh_entity;

public class ArticleClass {
    private Integer id;

    private String className;

    public ArticleClass(Integer id, String className) {
        this.id = id;
        this.className = className;
    }

    public ArticleClass() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}