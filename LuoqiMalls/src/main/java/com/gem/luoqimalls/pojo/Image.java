package com.gem.luoqimalls.pojo;
public class Image {
    private int goodsPicId;
    private String goodsPicMaster;//主图片
    private String goodsPic1;//缩略图1
    private String goodsPic2;//缩略图2
    private String goodsPic3;//缩略图3
    private String goodsPic4;//缩略图4

    public Image() {
    }

    @Override
    public String toString() {
        return "Image{" +
                "goodsPicId=" + goodsPicId +
                ", goodsPicMaster='" + goodsPicMaster + '\'' +
                ", goodsPic1='" + goodsPic1 + '\'' +
                ", goodsPic2='" + goodsPic2 + '\'' +
                ", goodsPic3='" + goodsPic3 + '\'' +
                ", goodsPic4='" + goodsPic4 + '\'' +
                '}';
    }

    public Image(int goodsPicId, String goodsPicMaster) {
        this.goodsPicId = goodsPicId;
        this.goodsPicMaster = goodsPicMaster;
    }

    public Image(String goodsPicMaster, String goodsPic1, String goodsPic2, String goodsPic3, String goodsPic4) {
        this.goodsPicMaster = goodsPicMaster;
        this.goodsPic1 = goodsPic1;
        this.goodsPic2 = goodsPic2;
        this.goodsPic3 = goodsPic3;
        this.goodsPic4 = goodsPic4;
    }

    public Image(int goodsPicId, String goodsPicMaster, String goodsPic1, String goodsPic2, String goodsPic3, String goodsPic4) {
        this.goodsPicId = goodsPicId;
        this.goodsPicMaster = goodsPicMaster;
        this.goodsPic1 = goodsPic1;
        this.goodsPic2 = goodsPic2;
        this.goodsPic3 = goodsPic3;
        this.goodsPic4 = goodsPic4;
    }

    public int getGoodsPicId() {
        return goodsPicId;
    }

    public void setGoodsPicId(int goodsPicId) {
        this.goodsPicId = goodsPicId;
    }

    public String getGoodsPicMaster() {
        return goodsPicMaster;
    }

    public void setGoodsPicMaster(String goodsPicMaster) {
        this.goodsPicMaster = goodsPicMaster;
    }

    public String getGoodsPic1() {
        return goodsPic1;
    }

    public void setGoodsPic1(String goodsPic1) {
        this.goodsPic1 = goodsPic1;
    }

    public String getGoodsPic2() {
        return goodsPic2;
    }

    public void setGoodsPic2(String goodsPic2) {
        this.goodsPic2 = goodsPic2;
    }

    public String getGoodsPic3() {
        return goodsPic3;
    }

    public void setGoodsPic3(String goodsPic3) {
        this.goodsPic3 = goodsPic3;
    }

    public String getGoodsPic4() {
        return goodsPic4;
    }

    public void setGoodsPic4(String goodsPic4) {
        this.goodsPic4 = goodsPic4;
    }

}
