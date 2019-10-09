package com.example.demo.mh_entity;

import java.util.Date;

public class UserMassage {
    private Integer id;

    private Integer userId;

    private String account;

    private Double height;

    private Double weight;

    private Double bust;

    private Double waistLine;

    private Double hipLine;

    private Double shoulderWidth;

    private Double sleeveLength;

    private Double clothingLength;

    private Double trousersLength;

    private Date updatedAt;

    public UserMassage(Integer id, Integer userId, String account, Double height, Double weight, Double bust, Double waistLine, Double hipLine, Double shoulderWidth, Double sleeveLength, Double clothingLength, Double trousersLength, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.account = account;
        this.height = height;
        this.weight = weight;
        this.bust = bust;
        this.waistLine = waistLine;
        this.hipLine = hipLine;
        this.shoulderWidth = shoulderWidth;
        this.sleeveLength = sleeveLength;
        this.clothingLength = clothingLength;
        this.trousersLength = trousersLength;
        this.updatedAt = updatedAt;
    }
    public UserMassage(Integer userId,String account, Double height, Double weight, Double bust, Double waistLine, Double hipLine, Double shoulderWidth, Double sleeveLength, Double clothingLength, Double trousersLength) {
        this.id = null;
        this.userId = userId;
        this.account = account;
        this.height = height;
        this.weight = weight;
        this.bust = bust;
        this.waistLine = waistLine;
        this.hipLine = hipLine;
        this.shoulderWidth = shoulderWidth;
        this.sleeveLength = sleeveLength;
        this.clothingLength = clothingLength;
        this.trousersLength = trousersLength;
        this.updatedAt = null;
    }

    public UserMassage() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBust() {
        return bust;
    }

    public void setBust(Double bust) {
        this.bust = bust;
    }

    public Double getWaistLine() {
        return waistLine;
    }

    public void setWaistLine(Double waistLine) {
        this.waistLine = waistLine;
    }

    public Double getHipLine() {
        return hipLine;
    }

    public void setHipLine(Double hipLine) {
        this.hipLine = hipLine;
    }

    public Double getShoulderWidth() {
        return shoulderWidth;
    }

    public void setShoulderWidth(Double shoulderWidth) {
        this.shoulderWidth = shoulderWidth;
    }

    public Double getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(Double sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public Double getClothingLength() {
        return clothingLength;
    }

    public void setClothingLength(Double clothingLength) {
        this.clothingLength = clothingLength;
    }

    public Double getTrousersLength() {
        return trousersLength;
    }

    public void setTrousersLength(Double trousersLength) {
        this.trousersLength = trousersLength;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}