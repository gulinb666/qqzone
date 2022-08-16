package com.pro12.qqzone.controller;

import com.pro12.qqzone.pojo.HostReply;
import com.pro12.qqzone.pojo.Reply;
import com.pro12.qqzone.pojo.Topic;
import com.pro12.qqzone.pojo.UserBasic;
import com.pro12.qqzone.services.HostReplyService;
import com.pro12.qqzone.services.ReplyService;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

public class ReplyController {
    private ReplyService replyService;

    public String hostReply(Long replyId, HttpSession session) {
        Reply reply = replyService.getReplyById(replyId);
        session.setAttribute("reply",reply);
        return "hostreply";
    }

    public String addReply(String content,Long topicId,HttpSession session) {
        UserBasic author = (UserBasic)session.getAttribute("userBasic");
        Date date = new Date();
        Reply reply = new Reply(content,new Timestamp(date.getTime()),author,new Topic(topicId));
        replyService.addReply(reply);
        return "redirect:topic.do?operate=topicDetail&id=" + topicId;
    }

    public String delReply(Long replyId,Long topicId) {
        replyService.delReply(new Reply(replyId));
        return "redirect:topic.do?operate=topicDetail&id=" + topicId;
    }
}