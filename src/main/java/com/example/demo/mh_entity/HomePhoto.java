package com.example.demo.mh_entity;

public class HomePhoto {
    private Integer id;

    private String massage;

    private Integer sign;

    private String location;

    public HomePhoto(Integer id, String massage, Integer sign, String location) {
        this.id = id;
        this.massage = massage;
        this.sign = sign;
        this.location = location;
    }

    public HomePhoto(String massage, Integer sign, String location) {
        this.id = null;
        this.massage = massage;
        this.sign = sign;
        this.location = location;
    }

    public HomePhoto() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage == null ? null : massage.trim();
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}