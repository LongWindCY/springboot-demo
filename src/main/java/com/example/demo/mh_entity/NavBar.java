package com.example.demo.mh_entity;

public class NavBar {
    private Integer id;

    private String title;

    private Integer parentId;

    private String route;

    public NavBar(Integer id, String title, Integer parentId, String route) {
        this.id = id;
        this.title = title;
        this.parentId = parentId;
        this.route = route;
    }

    public NavBar(String title, Integer parentId, String route){
        this.id = null;
        this.title = title;
        this.parentId = parentId;
        this.route = route;
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

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}