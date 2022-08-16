package com.pro12.qqzone.controller;

import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;
import com.pro12.qqzone.services.TopicService;
import com.pro12.qqzone.services.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.List;

public class UserController {
    private UserBasicService userBasicService;
    private TopicService topicService;
    public String login(String loginId, String pwd, HttpSession session) {
        UserBasic userBasic = userBasicService.login(loginId,pwd);
        if(userBasic != null) {
            // 获取相关的好友信息
            List<UserBasic> friendList = userBasicService.getFriendList(userBasic);
            // 获取相关的日志列表信息(但是，日志只有id，没有其它信息)
            List<Topic> topicList = topicService.getTopicList(userBasic);
            userBasic.setFriendList(friendList);
            userBasic.setTopicList(topicList);
            session.setAttribute("userBasic",userBasic);
            session.setAttribute("friend",userBasic);
            return "index";
        } else {
            return "login";
        }
    }
    public String friend(Long id,HttpSession session) {
        // 根据id获取指定的用户信息
        UserBasic currFriend = userBasicService.getUserBasicById(id);
        List<Topic> topicList = topicService.getTopicList(currFriend);
        currFriend.setTopicList(topicList);
        session.setAttribute("friend",currFriend);
        return "index";
    }

    public String topicAdd() {
        return "addtopic";
    }

}