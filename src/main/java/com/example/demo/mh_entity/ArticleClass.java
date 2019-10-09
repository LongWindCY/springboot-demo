package com.example.demo.mh_entity;

public class ArticleClass {
    private Integer id;

    private String classType;

    public ArticleClass(Integer id, String classType) {
        this.id = id;
        this.classType = classType;
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

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType == null ? null : classType.trim();
    }
}