package com.pro12.qqzone.dao;

import com.pro12.qqzone.pojo.Reply;
import com.pro12.qqzone.pojo.Topic;

import java.util.List;

public interface ReplyDAO {
    // 获取指定日志的回复列表
    List<Reply> getReplyList(Topic topic);
    Reply getReplyById(Long replyId);
    // 添加回复
    void addReply(Reply reply);
    // 删除回复
    void delReply(Reply reply);
    // 根据id获取指定的reply
    Reply getReply(Long id);
}