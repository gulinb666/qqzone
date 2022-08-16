package com.pro12.qqzone.dao.impl;

import com.pro12.myssm.basedao.BaseDAO;
import com.pro12.qqzone.dao.UserBasicDAO;
import com.pro12.qqzone.pojo.UserBasic;

import java.util.List;

public class UserBasicDAOImpl extends BaseDAO<UserBasic> implements UserBasicDAO {
    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        return super.load("select * from t_user_basic where loginId=? and pwd=?",loginId,pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql = "select fid as id from t_friend where uid = ?";
        return super.executeQuery(sql,userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Long id) {
        return super.load("select * from t_user_basic where id=?",id);
    }
}