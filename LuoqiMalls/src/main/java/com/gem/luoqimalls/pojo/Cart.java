package com.gem.luoqimalls.pojo;

import java.math.BigDecimal;

public class Cart {
private int cartId;

private int goodsId;
private int userId;
private int num;
private Goods goods;

    private double allGoodsLastPrice;

    public double getAllGoodsLastPrice() {
        allGoodsLastPrice=goods.getGoodsLastPrice()*num;
        BigDecimal b   =   new   BigDecimal(allGoodsLastPrice);
        double   allGoodsLastPrice   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
        return allGoodsLastPrice;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", goodsId=" + goodsId +
                ", userId=" + userId +
                ", num=" + num +
                ", goods=" + goods +
                '}';
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Cart(int cartId, int goodsId, int userId, int num) {
        this.cartId = cartId;
        this.goodsId = goodsId;
        this.userId = userId;
        this.num = num;
    }

    public Cart() {
    }
}
