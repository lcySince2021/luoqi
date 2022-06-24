package com.gem.luoqimalls.pojo;

import java.util.Date;

public class Collect {
    private int userId;
    private int goodsId;
    private Date collectDate;
    private int collectId;
    private Goods goods;

    public Collect() {
    }

    public Collect(int userId, int goodsId, Date collectDate, int collectId, Goods goods) {
        this.userId = userId;
        this.goodsId = goodsId;
        this.collectDate = collectDate;
        this.collectId = collectId;
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "userId=" + userId +
                ", goodsId=" + goodsId +
                ", collectDate=" + collectDate +
                ", collectId=" + collectId +
                ", goods=" + goods +
                '}';
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
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

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    public int getCollectId() {
        return collectId;
    }

    public void setCollectId(int collectId) {
        this.collectId = collectId;
    }

    public Collect(int userId, int goodsId, Date collectDate, int collectId) {
        this.userId = userId;
        this.goodsId = goodsId;
        this.collectDate = collectDate;
        this.collectId = collectId;
    }
}
