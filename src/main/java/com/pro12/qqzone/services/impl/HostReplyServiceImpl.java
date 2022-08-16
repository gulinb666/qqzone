package com.pro12.qqzone.services.impl;

import com.pro12.qqzone.dao.HostReplyDAO;
import com.pro12.qqzone.pojo.HostReply;
import com.pro12.qqzone.pojo.Reply;
import com.pro12.qqzone.services.HostReplyService;

public class HostReplyServiceImpl implements HostReplyService {
    private HostReplyDAO hostReplyDAO;
    @Override
    public HostReply getHostReplyByReplyId(Long replyId) {
        return hostReplyDAO.getHostReplyByReplyId(replyId);
    }

    @Override
    public void addHostReply(HostReply hostReply) {
        hostReplyDAO.addHostReply(hostReply);
    }

    @Override
    public void delHostReply(Long id) {
        hostReplyDAO.delHostReply(id);
    }
}
