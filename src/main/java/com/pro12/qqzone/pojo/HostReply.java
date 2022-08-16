package com.pro12.qqzone.pojo;

import java.sql.Timestamp;

public class HostReply {
    private Long id;
    private String content;
    private Timestamp hostReplyDate;
    private UserBasic author;   // M:1
    private Reply reply;     // 1:1

    public HostReply() {}

    public HostReply(Long id) {
        this.id = id;
    }

    public HostReply(String content,Timestamp hostReplyDate,UserBasic author,Reply reply) {
        this.content = content;
        this.hostReplyDate = hostReplyDate;
        this.author = author;
        this.reply = reply;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setHostReplyDate(Timestamp hostReplyDate) {
        this.hostReplyDate = hostReplyDate;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getHostReplyDate() {
        return hostReplyDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public Reply getReply() {
        return reply;
    }
}