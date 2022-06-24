package com.gem.luoqimalls.pojo;
import java.util.Date;

public class Comment {
    private int commentId;
    private int userId;
    private int goodsId;
    private String commentLeval;//评论等级
    private String commentContent;//评论内容
    private Date commentTime;//评论时间

    public Comment() {
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getCommentLeval() {
        return commentLeval;
    }

    public void setCommentLeval(String commentLeval) {
        this.commentLeval = commentLeval;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
