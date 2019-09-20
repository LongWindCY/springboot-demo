package com.example.demo.mh_entity;

public class PhotoLocation {
    private Integer id;

    private Integer classId;

    private String location;

    private String massage;

    public PhotoLocation(Integer id, Integer classId, String location, String massage) {
        this.id = id;
        this.classId = classId;
        this.location = location;
        this.massage = massage;
    }

    public PhotoLocation() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage == null ? null : massage.trim();
    }
}