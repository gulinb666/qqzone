package com.pro12.qqzone.dao.impl;

import com.pro12.myssm.basedao.BaseDAO;
import com.pro12.qqzone.dao.ReplyDAO;
import com.pro12.qqzone.pojo.Reply;
import com.pro12.qqzone.pojo.Topic;

import java.util.List;

public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return super.executeQuery("select * from t_reply where topic = ?",topic.getId());
    }

    @Override
    public Reply getReplyById(Long replyId) {
        return super.load("select * from t_reply where id = ?",replyId);
    }

    @Override
    public void addReply(Reply reply) {
        super.executeUpdate("insert into t_reply values(0,?,?,?,?)",reply.getContent(),reply.getReplyDate(),reply.getAuthor().getId(),reply.getTopic().getId());
    }

    @Override
    public void delReply(Reply reply) {
        super.executeUpdate("delete from t_reply where id = ?",reply.getId());
    }

    @Override
    public Reply getReply(Long id) {
        return super.load("select * from t_reply where id = ?",id);
    }
}