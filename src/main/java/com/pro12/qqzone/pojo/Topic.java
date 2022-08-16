package com.pro12.qqzone.pojo;

import java.sql.Timestamp;
import java.util.List;

public class Topic {
    private Long id;
    private String title;
    private String content;
    private Timestamp topicDate;
    private UserBasic author;     // M:1

    private List<Reply> replyList;   // 1:N

    public Topic() {}

    public Topic(Long id) {
        this.id = id;
    }

    public Topic(String title,String content,Timestamp topicDate,UserBasic author) {
        this.title = title;
        this.content = content;
        this.topicDate = topicDate;
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTopicDate(Timestamp topicDate) {
        this.topicDate = topicDate;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    public void setReplyList(List<Reply> replyList) {
        this.replyList = replyList;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getTopicDate() {
        return topicDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public List<Reply> getReplyList() {
        return replyList;
    }
}