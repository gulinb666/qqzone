package com.pro12.qqzone.pojo;

import java.sql.Timestamp;

public class Reply {
    private Long id;
    private String content;
    private Timestamp replyDate;
    private UserBasic author;   // M:1
    private Topic topic;     // M:1

    private HostReply hostReply;     // 1:1

    public Reply() {}

    public Reply(Long id) {
        this.id = id;
    }

    public Reply(String content,Timestamp replyDate,UserBasic author,Topic topic) {
        this.content = content;
        this.replyDate = replyDate;
        this.author = author;
        this.topic = topic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setReplyDate(Timestamp replyDate) {
        this.replyDate = replyDate;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setHostReply(HostReply hostReply) {
        this.hostReply = hostReply;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getReplyDate() {
        return replyDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public Topic getTopic() {
        return topic;
    }

    public HostReply getHostReply() {
        return hostReply;
    }
}