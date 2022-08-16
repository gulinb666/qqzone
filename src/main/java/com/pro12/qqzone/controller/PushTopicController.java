package com.pro12.qqzone.controller;

import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;
import com.pro12.qqzone.services.PushTopicService;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

public class PushTopicController {
    private PushTopicService pushTopicService;

    public String addTopic(String title, String content, HttpSession session) {
        UserBasic author = (UserBasic) session.getAttribute("userBasic");
        Date date = new Date();
        Topic topic = new Topic(title,content,new Timestamp(date.getTime()),author);
        pushTopicService.addTopic(topic);
        return "redirect:topic.do?operate=getTopicList";
    }
}