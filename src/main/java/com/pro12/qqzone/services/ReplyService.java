package com.pro12.qqzone.services;

import com.pro12.qqzone.pojo.Reply;
import com.pro12.qqzone.pojo.Topic;

import java.util.List;

public interface ReplyService {
    // 根据topic的id获取关联的所有的回复
    List<Reply> getReplyListByTopicId(Long topicId);
    Reply getReplyById(Long replyId);
    // 添加回复
    void addReply(Reply reply);
    // 删除指定的回复
    void delReply(Reply id);
    // 删除指定的日志关联的所有的回复
    void delReplyList(Topic topic);
}