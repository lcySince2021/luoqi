package com.gem.luoqimalls.pojo;

import java.util.Date;

public class Evaluate {
    private int evaluateId;
    private String evaluateText;  //评论
    private String review;        //追评
    private String reply;         //商家回复
    private int goodsId;          //商品号
    private int userId;           //用户号
    private int isGood;            //是否好评
    private Date pjTime;     //评价时间
    private User user;
    private Goods goods;

    public Evaluate() {
    }

    public Evaluate(String evaluateText, int goodsId, int userId, int isGood, Date pjTime) {
        this.evaluateText = evaluateText;
        this.goodsId = goodsId;
        this.userId = userId;
        this.isGood = isGood;
        this.pjTime = pjTime;
    }

    @Override
    public String toString() {
        return "Evaluate{" + "evaluateId=" + evaluateId + ", evaluateText='" + evaluateText + '\'' + ", review='" + review + '\'' + ", reply='" + reply + '\'' + ", goodsId=" + goodsId + ", userId=" + userId + ", isGood=" + isGood + ", pjTime=" + pjTime + ", user=" + user + ", goods=" + goods + '}';
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(int evaluateId) {
        this.evaluateId = evaluateId;
    }

    public String getEvaluateText() {
        return evaluateText;
    }

    public void setEvaluateText(String evaluateText) {
        this.evaluateText = evaluateText;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIsGood() {
        return isGood;
    }

    public void setIsGood(int isGood) {
        this.isGood = isGood;
    }

    public Date getPjTime() {
        return pjTime;
    }

    public void setPjTime(Date pjTime) {
        this.pjTime = pjTime;
    }
}
