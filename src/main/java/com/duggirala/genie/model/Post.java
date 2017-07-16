package com.duggirala.genie.model;

import org.springframework.data.annotation.Id;

/**
 * Created by raviteja on 7/15/17.
 */
public class Post {
    @Id
    protected String postId;
    protected Long postDate;
    protected User user;
    protected String description;
    protected Boolean decisionFlag;
    protected int views;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Long getPostDate() {
        return postDate;
    }

    public void setPostDate(Long postDate) {
        this.postDate = postDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDecisionFlag() {
        return decisionFlag;
    }

    public void setDecisionFlag(Boolean decisionFlag) {
        this.decisionFlag = decisionFlag;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
