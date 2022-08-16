package com.pro12.qqzone.services.impl;

import com.pro12.qqzone.dao.PushTopicDAO;
import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.services.PushTopicService;

public class PushTopicServiceImpl implements PushTopicService {
    private PushTopicDAO pushTopicDAO;
    @Override
    public void addTopic(Topic topic) {
        pushTopicDAO.addTopic(topic);
    }
}
