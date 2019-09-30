package com.example.demo.mh_entity;

import java.util.Date;

public class RuleUser {
    private Integer id;

    private String account;

    private String password;

    private String remark;

    private Integer power;

    private Date createdAt;

    private Date updatedAt;

    public RuleUser(Integer id, String account, String password, String remark, Integer power, Date createdAt, Date updatedAt) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.remark = remark;
        this.power = power;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public RuleUser(String account, String password, String remark, Integer power){
        this.id = null;
        this.account = account;
        this.password = password;
        this.remark = remark;
        this.power = power;
        this.createdAt = null;
        this.updatedAt = null;
    }

    public RuleUser(String account, String password){
        this.id = null;
        this.account = account;
        this.password = password;
        this.remark = null;
        this.power = null;
        this.createdAt = null;
        this.updatedAt = null;
    }

    public RuleUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}