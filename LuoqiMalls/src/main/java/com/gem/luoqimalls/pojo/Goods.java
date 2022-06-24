package com.gem.luoqimalls.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private int goodsId;
    private int goodsMark;//商品所含积分
    private int goodsInt;//商品所需积分
    private String goodsName;//商品名称
    private int goodsPicId; //商品图片
    private double goodsPrice;  //商品价格
    private int goodsSales; //销售量
    private double goodsDiscount;  // 商品折扣
    private int goodsSum;  //库存量
    private String brandId;  //品牌
    private Date goodsCreateDate;  //创建时间

    public Goods(int goodsId, int goodsMark, int goodsInt, int goodsPicId, double goodsPrice, double goodsDiscount, int goodsSum, String goodsDescribe) {
        this.goodsId = goodsId;
        this.goodsMark = goodsMark;
        this.goodsInt = goodsInt;
        this.goodsPicId = goodsPicId;
        this.goodsPrice = goodsPrice;
        this.goodsDiscount = goodsDiscount;
        this.goodsSum = goodsSum;
        this.goodsDescribe = goodsDescribe;
    }

    private int goodsShelf;  //是否上架
    private int id_2;  //二级类别id
    private int speId;  //规格编号
    private int gCommentCount; //好评数
    private int goodsInteder;  //是否是积分是商品
    private String goodsDescribe;  //商品描述
    private  int goodsInteger;
    private Image image;
    private double goodsLastPrice;
   private int isMiaoSha;
   private int isYouHui;
   private int id_1;


    public int getGoodsInteger() {
        return goodsInteger;
    }

    public void setGoodsInteger(int goodsInteger) {
        this.goodsInteger = goodsInteger;
    }

    public double getGoodsLastPrice() {
        goodsLastPrice=goodsDiscount*goodsPrice;
        BigDecimal b   =   new   BigDecimal(goodsLastPrice);
        double   goodsLastPrice   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
        return goodsLastPrice;
    }


    public Goods() {

    }

    public Goods(int goodsMark, int goodsInt, String goodsName, int goodsPicId, double goodsPrice, double goodsDiscount, int goodsSum, String brandId, Date goodsCreateDate, int goodsShelf, int id_2, int speId, int goodsInteder, String goodsDescribe, int isMiaoSha, int isYouHui, int id_1) {
        this.goodsMark = goodsMark;
        this.goodsInt = goodsInt;
        this.goodsName = goodsName;
        this.goodsPicId = goodsPicId;
        this.goodsPrice = goodsPrice;
        this.goodsDiscount = goodsDiscount;
        this.goodsSum = goodsSum;
        this.brandId = brandId;
        this.goodsCreateDate = goodsCreateDate;
        this.goodsShelf = goodsShelf;
        this.id_2 = id_2;
        this.speId = speId;
        this.goodsInteder = goodsInteder;
        this.goodsDescribe = goodsDescribe;
        this.isMiaoSha = isMiaoSha;
        this.isYouHui = isYouHui;
        this.id_1 = id_1;
    }

    public Goods(int goodsId, int goodsInteder, int isMiaoSha, int isYouHui) {
        this.goodsId = goodsId;
        this.goodsInteder = goodsInteder;
        this.isMiaoSha = isMiaoSha;
        this.isYouHui = isYouHui;
    }

    public Goods(int goodsId, int goodsMark, int goodsInt, double goodsPrice, double goodsDiscount, int goodsSum, String goodsDescribe) {
        this.goodsId = goodsId;
        this.goodsMark = goodsMark;
        this.goodsInt = goodsInt;
        this.goodsPrice = goodsPrice;
        this.goodsDiscount = goodsDiscount;
        this.goodsSum = goodsSum;
        this.goodsDescribe = goodsDescribe;
    }

    public int getId_1() {
        return id_1;
    }

    public void setId_1(int id_1) {
        this.id_1 = id_1;
    }

    public void setGoodsLastPrice(double goodsLastPrice) {
        this.goodsLastPrice = goodsLastPrice;
    }

    public int getIsMiaoSha() {
        return isMiaoSha;
    }

    public void setIsMiaoSha(int isMiaoSha) {
        this.isMiaoSha = isMiaoSha;
    }

    public int getIsYouHui() {
        return isYouHui;
    }

    public void setIsYouHui(int isYouHui) {
        this.isYouHui = isYouHui;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getGoodsMark() {
        return goodsMark;
    }

    public void setGoodsMark(int goodsMark) {
        this.goodsMark = goodsMark;
    }

    public int getGoodsInt() {
        return goodsInt;
    }

    public void setGoodsInt(int goodsInt) {
        this.goodsInt = goodsInt;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsPicId() {
        return goodsPicId;
    }

    public void setGoodsPicId(int goodsPicId) {
        this.goodsPicId = goodsPicId;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(int goodsSales) {
        this.goodsSales = goodsSales;
    }

    public double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public int getGoodsSum() {
        return goodsSum;
    }

    public void setGoodsSum(int goodsSum) {
        this.goodsSum = goodsSum;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public Date getGoodsCreateDate() {
        return goodsCreateDate;
    }

    public void setGoodsCreateDate(Date goodsCreateDate) {
        this.goodsCreateDate = goodsCreateDate;
    }

    public int getGoodsShelf() {
        return goodsShelf;
    }

    public void setGoodsShelf(int goodsShelf) {
        this.goodsShelf = goodsShelf;
    }

    public int getId_2() {
        return id_2;
    }

    public void setId_2(int id_2) {
        this.id_2 = id_2;
    }

    public int getSpeId() {
        return speId;
    }

    public void setSpeId(int speId) {
        this.speId = speId;
    }

    public int getgCommentCount() {
        return gCommentCount;
    }

    public void setgCommentCount(int gCommentCount) {
        this.gCommentCount = gCommentCount;
    }

    public int getGoodsInteder() {
        return goodsInteder;
    }

    public void setGoodsInteder(int goodsInteder) {
        this.goodsInteder = goodsInteder;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

}
