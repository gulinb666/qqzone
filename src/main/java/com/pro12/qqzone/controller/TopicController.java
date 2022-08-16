package com.pro12.qqzone.controller;

import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;
import com.pro12.qqzone.services.TopicService;

import javax.servlet.http.HttpSession;
import java.util.List;

public class TopicController {
    private TopicService topicService;

    public String topicDetail(Long id, HttpSession session) {
        Topic topic = topicService.getTopicById(id);
        session.setAttribute("topic",topic);
        return "detail";
    }
    public String delTopic(Long topicId) {
        topicService.delTopic(topicId);
        return "redirect:topic.do?operate=getTopicList";
    }
    public String getTopicList(HttpSession session) {
        UserBasic userBasic = (UserBasic) session.getAttribute("userBasic");
        List<Topic> topicList = topicService.getTopicList(userBasic);
        userBasic.setTopicList(topicList);
        session.setAttribute("friend",userBasic);
        return "index";
    }
}