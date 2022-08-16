package com.pro12.qqzone.services;

import com.pro12.qqzone.pojo.HostReply;
import com.pro12.qqzone.pojo.Reply;

public interface HostReplyService {
    HostReply getHostReplyByReplyId(Long replyId);
    void addHostReply(HostReply hostReply);
    void delHostReply(Long id);
}