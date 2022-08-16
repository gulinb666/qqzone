package com.pro12.qqzone.services.impl;

import com.pro12.qqzone.dao.TopicDAO;
import com.pro12.qqzone.pojo.Reply;
import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;
import com.pro12.qqzone.services.ReplyService;
import com.pro12.qqzone.services.TopicService;
import com.pro12.qqzone.services.UserBasicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {
    private TopicDAO topicDAO = null;
    private ReplyService replyService;
    private UserBasicService userBasicService;
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }

    public Topic getTopic(Long id) {
        Topic topic = topicDAO.getTopic(id);
        UserBasic author = topic.getAuthor();
        author = userBasicService.getUserBasicById(author.getId());
        topic.setAuthor(author);
        return topic;
    }

    @Override
    public void delTopic(Long id) {
        Topic topic = topicDAO.getTopic(id);
        if (topic != null) {
            replyService.delReplyList(topic);
            topicDAO.delTopic(topic);
        }
    }

    @Override
    public Topic getTopicById(Long id) {
        Topic topic = getTopic(id);
        List<Reply> replyList = replyService.getReplyListByTopicId(topic.getId());
        topic.setReplyList(replyList);
        return topic;
    }
}