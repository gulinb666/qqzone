package com.pro12.qqzone.pojo;

import java.sql.Timestamp;

public class UserDetail {
    private Long id;
    private String realName;
    private String tel;
    private String email;
    private Timestamp birth;
    private String star;
    public UserDetail() {}

    public void setId(Long id) {
        this.id = id;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirth(Timestamp birth) {
        this.birth = birth;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public Long getId() {
        return id;
    }

    public String getRealName() {
        return realName;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public Timestamp getBirth() {
        return birth;
    }

    public String getStar() {
        return star;
    }
}