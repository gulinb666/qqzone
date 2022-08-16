package com.pro12.qqzone.dao;

import com.pro12.qqzone.pojo.UserBasic;

import java.util.List;

public interface UserBasicDAO {
    // 根据账号和密码获取特定用户信息
    UserBasic getUserBasic(String loginId,String pwd);
    // 获取指定用户的所有好友列表
    List<UserBasic> getUserBasicList(UserBasic userBasic);
    // 根据id查询UserBasic的信息
    UserBasic getUserBasicById(Long id);
}