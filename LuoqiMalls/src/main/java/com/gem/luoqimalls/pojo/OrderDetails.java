package com.gem.luoqimalls.pojo;

import java.math.BigDecimal;
import java.util.List;

public class OrderDetails {
    private int orderDetailId;
    private int orderId;
    private int goodsId;
    private int orderGoodsNum;//数量
    private double goodsMoney;//当前价格
    private double goodsAllMoney;//总价
    private int volumeId;//优惠券编号
    private String GoodsPicId;//订单详情
    private Goods goods;
    private double allGoodsLastPrice;
    private double orderMoney;
    private int isEvaluate;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderDetailId=" + orderDetailId +
                ", orderId=" + orderId +
                ", goodsId=" + goodsId +
                ", orderGoodsNum=" + orderGoodsNum +
                ", goodsMoney=" + goodsMoney +
                ", goodsAllMoney=" + goodsAllMoney +
                ", volumeId=" + volumeId +
                ", GoodsPicId='" + GoodsPicId + '\'' +
                ", goods=" + goods +
                ", allGoodsLastPrice=" + allGoodsLastPrice +
                ", orderMoney=" + orderMoney +
                ", isEvaluate=" + isEvaluate +
                ", orderDetailsMoney=" + orderDetailsMoney +
                '}';
    }

    public int getIsEvaluate() {
        return isEvaluate;
    }

    public void setIsEvaluate(int isEvaluate) {
        this.isEvaluate = isEvaluate;
    }

    public void setAllGoodsLastPrice(double allGoodsLastPrice) {

        this.allGoodsLastPrice = allGoodsLastPrice;
    }

    public double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public double getAllGoodsLastPrice() {
        allGoodsLastPrice=goods.getGoodsLastPrice()*orderGoodsNum;
        BigDecimal b   =   new   BigDecimal(allGoodsLastPrice);
        double   allGoodsLastPrice   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
        return allGoodsLastPrice;
    }
    private double orderDetailsMoney;

    public double getOrderDetailsMoney() {
        orderDetailsMoney=orderGoodsNum*goods.getGoodsLastPrice();
        BigDecimal b   =   new   BigDecimal(orderDetailsMoney);
        double   orderDetailsMoney   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
        return orderDetailsMoney;
    }
    public void setOrderDetailsMoney(double orderDetailsMoney) {
        this.orderDetailsMoney = orderDetailsMoney;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public OrderDetails() {
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getOrderGoodsNum() {
        return orderGoodsNum;
    }

    public void setOrderGoodsNum(int orderGoodsNum) {
        this.orderGoodsNum = orderGoodsNum;
    }

    public double getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(double goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public double getGoodsAllMoney() {
        return goodsAllMoney;
    }

    public void setGoodsAllMoney(double goodsAllMoney) {
        this.goodsAllMoney = goodsAllMoney;
    }

    public int getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(int volumeId) {
        this.volumeId = volumeId;
    }

    public String getGoodsPicId() {
        return GoodsPicId;
    }

    public void setGoodsPicId(String goodsPicId) {
        GoodsPicId = goodsPicId;
    }

}
