package com.pro12.qqzone.controller;

import com.pro12.qqzone.pojo.HostReply;
import com.pro12.qqzone.pojo.Reply;
import com.pro12.qqzone.pojo.UserBasic;
import com.pro12.qqzone.services.HostReplyService;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

public class HostReplyController {
    private HostReplyService hostReplyService;
    public String addHostReply(Long replyId,Long topicId, String content, HttpSession session) {
        UserBasic author = (UserBasic) session.getAttribute("userBasic");
        Date date = new Date();
        HostReply hostReply = new HostReply(content,new Timestamp(date.getTime()),author,new Reply(replyId));
        hostReplyService.addHostReply(hostReply);
        return "redirect:topic.do?operate=topicDetail&id=" + topicId;
    }
}