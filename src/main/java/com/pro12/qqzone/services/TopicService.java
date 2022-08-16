package com.pro12.qqzone.services;

import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;

import java.util.List;

public interface TopicService {
    // 查询特定用户的日志列表
    List<Topic> getTopicList(UserBasic userBasic);
    // 根据id获取特定topic
    Topic getTopicById(Long id);
    // 根据id获取指定的topic信息，包含这个topic关联的作者信息
    Topic getTopic(Long id);
    // 删除特定的topic
    void delTopic(Long id);
}