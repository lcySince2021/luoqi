package com.gem.luoqimalls.pojo;

import java.math.BigDecimal;

public class getId {

    private int goodsNum;
    private double sum;

    public getId(int goodsNum, double sum) {
        this.goodsNum = goodsNum;
        this.sum = sum;
    }

    public getId() {
    }

    @Override
    public String toString() {
        return "getId{" +
                "goodsNum=" + goodsNum +
                ", sum=" + sum +
                '}';
    }

    public double getSum() {
        BigDecimal   b   =   new BigDecimal(sum);
        double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public getId(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }
}
