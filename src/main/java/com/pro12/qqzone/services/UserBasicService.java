package com.pro12.qqzone.services;

import com.pro12.qqzone.pojo.UserBasic;

import java.util.List;

public interface UserBasicService {
    UserBasic login(String loginId,String pwd);
    List<UserBasic> getFriendList(UserBasic userBasic);
    // 根据id获取指定用户信息
    UserBasic getUserBasicById(Long id);
}