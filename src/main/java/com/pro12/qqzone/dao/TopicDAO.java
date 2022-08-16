package com.pro12.qqzone.dao;

import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;

import java.util.List;

public interface TopicDAO {
    // 获取指定用户的所有日志
    List<Topic> getTopicList(UserBasic userBasic);
    // 添加日志
    void addTopic(Topic topic);
    // 删除日志
    void delTopic(Topic topic);
    // 获取特定日志信息
    Topic getTopic(Long id);
}