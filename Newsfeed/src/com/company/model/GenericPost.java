package com.company.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GenericPost {

    private Integer postId;
    private int upVote = 0;
    private int downVote = 0;
    private String createdByUserName;
    private String comment;
    private Date postedDate;
    private static int counter = 0;

    private Map<Integer, GenericPost> replies;

    public GenericPost(String comment, String createdByUserName) {
        this.comment = comment;
        this.createdByUserName = createdByUserName;
        postId = counter++;
        postedDate = new Date();
        replies = new HashMap<Integer, GenericPost>();
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote() {
        this.upVote = upVote++;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote() {
        this.downVote = downVote--;
    }

    public String getUserName() {
        return createdByUserName;
    }

    public void setUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }

    public Map<Integer, GenericPost> getReplies() {
        return replies;
    }

    public void setReplies(Map<Integer, GenericPost> reply) {
        this.replies = reply;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("postId=").append(postId);
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", postedDate=").append(postedDate);
        sb.append(", upVote=").append(upVote);
        sb.append(", downVote=").append(downVote);
        sb.append(", userName=").append(createdByUserName);
        return sb.toString();
    }
}
