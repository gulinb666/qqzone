package com.pro12.qqzone.dao;

import com.pro12.qqzone.pojo.HostReply;
import com.pro12.qqzone.pojo.Reply;

public interface HostReplyDAO {
    // 根据replyId查询关联的HostReply实体
    HostReply getHostReplyByReplyId(Long replyId);
    void addHostReply(HostReply hostReply);
    // 删除特定的HostReply
    void delHostReply(Long id);
}