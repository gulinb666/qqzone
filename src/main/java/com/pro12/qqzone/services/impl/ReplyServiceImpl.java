package com.pro12.qqzone.services.impl;

import com.pro12.qqzone.dao.ReplyDAO;
import com.pro12.qqzone.pojo.HostReply;
import com.pro12.qqzone.pojo.Reply;
import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;
import com.pro12.qqzone.services.HostReplyService;
import com.pro12.qqzone.services.ReplyService;
import com.pro12.qqzone.services.UserBasicService;

import java.util.List;

public class ReplyServiceImpl implements ReplyService {
    private ReplyDAO replyDAO;
    private HostReplyService hostReplyService;
    private UserBasicService userBasicService;
    @Override
    public List<Reply> getReplyListByTopicId(Long topicId) {
        List<Reply> replyList = replyDAO.getReplyList(new Topic(topicId));
        for (int i = 0; i < replyList.size(); i++) {
            Reply reply = replyList.get(i);

            UserBasic author = userBasicService.getUserBasicById(reply.getAuthor().getId());
            reply.setAuthor(author);

            HostReply hostReply = hostReplyService.getHostReplyByReplyId(reply.getId());
            reply.setHostReply(hostReply);
        }
        return replyList;
    }

    public Reply getReplyById(Long replyId) {
        return replyDAO.getReplyById(replyId);
    }

    @Override
    public void addReply(Reply reply) {
        replyDAO.addReply(reply);
    }

    @Override
    public void delReply(Reply replyId) {
        Reply reply = replyDAO.getReply(replyId.getId());
        if (reply != null) {
            HostReply hostReply = hostReplyService.getHostReplyByReplyId(reply.getId());
            if (hostReply != null) {
                hostReplyService.delHostReply(hostReply.getId());
            }
            replyDAO.delReply(replyId);
        }
    }

    @Override
    public void delReplyList(Topic topic) {
        List<Reply> replyList = replyDAO.getReplyList(topic);
        if (replyList != null) {
            for (Reply reply : replyList) {
                delReply(new Reply(reply.getId()));
            }
        }
    }
}