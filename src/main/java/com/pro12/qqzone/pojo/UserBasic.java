package com.pro12.qqzone.pojo;

import java.util.List;

public class UserBasic {
    private Long id;
    private String loginId;
    private String nickName;
    private String pwd;
    private String headImg;

    private UserDetail userDetail;   // 1:1
    private List<Topic> topicList;   // 1:N
    private List<UserBasic> friendList;    // N:N

    public UserBasic() {}

    public UserBasic(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public void setFriendList(List<UserBasic> friendList) {
        this.friendList = friendList;
    }

    public Long getId() {
        return id;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPwd() {
        return pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public List<UserBasic> getFriendList() {
        return friendList;
    }
}