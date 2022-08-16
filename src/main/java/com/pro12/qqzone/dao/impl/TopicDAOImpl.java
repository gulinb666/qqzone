package com.pro12.qqzone.dao.impl;

import com.pro12.myssm.basedao.BaseDAO;
import com.pro12.qqzone.dao.TopicDAO;
import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;

import java.util.List;

public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("select * from t_topic where author=?",userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {
    }

    @Override
    public void delTopic(Topic topic) {
        super.executeUpdate("delete from t_topic where id = ?",topic.getId());
    }

    @Override
    public Topic getTopic(Long id) {
        return super.load("select * from t_topic where id = ?",id);
    }
}