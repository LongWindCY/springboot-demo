package com.example.demo.mh_entity;

import java.util.Date;

public class Article {
    private Integer id;

    private Integer classId;

    private String title;

    private Date createdAt;

    private String content;

    public Article(Integer id, Integer classId, String title, Date createdAt) {
        this.id = id;
        this.classId = classId;
        this.title = title;
        this.createdAt = createdAt;
    }

    public Article(Integer id, Integer classId, String title, Date createdAt, String content) {
        this.id = id;
        this.classId = classId;
        this.title = title;
        this.createdAt = createdAt;
        this.content = content;
    }

    public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}