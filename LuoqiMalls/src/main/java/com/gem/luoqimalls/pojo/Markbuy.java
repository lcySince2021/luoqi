package com.gem.luoqimalls.pojo;

import java.util.Date;

public class Markbuy {

    private  int markId;
    private  int userId;
    private  int goodsId;
    private  int num;
    private Date markdate;
    private Goods goods;
    private int marks;

    @Override
    public String toString() {
        return "Markbuy{" +
                "markId=" + markId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", num=" + num +
                ", markdate=" + markdate +
                ", goods=" + goods +
                ", marks=" + marks +
                '}';
    }

    public Markbuy(int markId, int userId, int goodsId, int num, Date markdate, int marks) {
        this.markId = markId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.num = num;
        this.markdate = markdate;
        this.marks = marks;
    }

    public Markbuy(int markId, int userId, int goodsId, int num, Date markdate, Goods goods, int marks) {
        this.markId = markId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.num = num;
        this.markdate = markdate;
        this.goods = goods;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getMarkdate() {
        return markdate;
    }

    public void setMarkdate(Date markdate) {
        this.markdate = markdate;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Markbuy(int markId, int userId, int goodsId, int num, Date markdate) {
        this.markId = markId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.num = num;
        this.markdate = markdate;
    }

    public Markbuy(int markId, int userId, int goodsId, int num, Date markdate, Goods goods) {
        this.markId = markId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.num = num;
        this.markdate = markdate;
        this.goods = goods;
    }

    public Markbuy() {
    }
}
