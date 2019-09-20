package com.example.demo.mh_entity;

public class Store {
    private Integer id;

    private String name;

    private String address;

    private String addressClear;

    private String introduction;

    private String imgLocation;

    public Store(Integer id, String name, String address, String addressClear, String introduction, String imgLocation) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.addressClear = addressClear;
        this.introduction = introduction;
        this.imgLocation = imgLocation;
    }

    public Store() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressClear() {
        return addressClear;
    }

    public void setAddressClear(String addressClear) {
        this.addressClear = addressClear == null ? null : addressClear.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getImgLocation() {
        return imgLocation;
    }

    public void setImgLocation(String imgLocation) {
        this.imgLocation = imgLocation == null ? null : imgLocation.trim();
    }
}