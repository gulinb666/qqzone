package com.pro12.qqzone.dao.impl;

import com.pro12.myssm.basedao.BaseDAO;
import com.pro12.qqzone.dao.HostReplyDAO;
import com.pro12.qqzone.pojo.HostReply;
import com.pro12.qqzone.pojo.Reply;

public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Long replyId) {
        return super.load("select * from t_host_reply where reply = ?",replyId);
    }

    @Override
    public void addHostReply(HostReply hostReply) {
        super.executeUpdate("insert into t_host_reply values(0,?,?,?,?)",hostReply.getContent(),hostReply.getHostReplyDate(),hostReply.getAuthor().getId(),hostReply.getReply().getId());
    }

    @Override
    public void delHostReply(Long id) {
        super.executeUpdate("delete from t_host_reply where id = ?",id);
    }
}