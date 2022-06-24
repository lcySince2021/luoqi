package com.gem.luoqimalls.pojo;

import java.util.Date;

public class Myfoot {
    private int footId;
    private int userId;//用户id
    private  int goodsId;//商品id

    private Date footdate;//创建时间
    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    @Override
    public String toString() {
        return "Myfoot{" +
                "footId=" + footId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", footdate=" + footdate +
                ", goods=" + goods +
                '}';
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getFootId() {
        return footId;
    }

    public void setFootId(int footId) {
        this.footId = footId;
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

    public Date getFootdate() {
        return footdate;
    }

    public void setFootdate(Date footdate) {
        this.footdate = footdate;
    }

    public Myfoot(int footId, int userId, int goodsId, Date footdate) {
        this.footId = footId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.footdate = footdate;
    }

    public Myfoot() {
    }
}
