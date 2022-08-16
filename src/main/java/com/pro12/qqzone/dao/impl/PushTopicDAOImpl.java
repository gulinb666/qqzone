package com.pro12.qqzone.dao.impl;

import com.pro12.myssm.basedao.BaseDAO;
import com.pro12.qqzone.dao.PushTopicDAO;
import com.pro12.qqzone.pojo.Topic;

public class PushTopicDAOImpl extends BaseDAO<Topic> implements PushTopicDAO {
    @Override
    public void addTopic(Topic topic) {
        super.executeUpdate("insert into t_topic values(0,?,?,?,?)",topic.getTitle(),topic.getContent(),topic.getTopicDate(),topic.getAuthor().getId());
    }
}
