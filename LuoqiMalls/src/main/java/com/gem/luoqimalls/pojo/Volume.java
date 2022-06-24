package com.gem.luoqimalls.pojo;

import java.util.Date;
import java.util.List;

public class Volume {
    private int volumeId;
    private String volumeClass;   //优惠券类别编号
    private double hMoney;  //优惠额度
    private double hMoneys;  //优惠额度所需金额
    private double hNum;  //数量
    private Date volumeDate;  //截止日期
    private Image image;
    private int volumePicId;
    private List<Volume> volumeList;

    @Override
    public String toString() {
        return "Volume{" +
                "volumeId=" + volumeId +
                ", volumeClass='" + volumeClass + '\'' +
                ", hMoney=" + hMoney +
                ", hMoneys=" + hMoneys +
                ", hNum=" + hNum +
                ", volumeDate=" + volumeDate +
                ", image=" + image +
                ", volumePicId=" + volumePicId +
                ", volumeList=" + volumeList +
                '}';
    }

    public int getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(int volumeId) {
        this.volumeId = volumeId;
    }

    public String getVolumeClass() {
        return volumeClass;
    }

    public void setVolumeClass(String volumeClass) {
        this.volumeClass = volumeClass;
    }

    public double gethMoney() {
        return hMoney;
    }

    public void sethMoney(double hMoney) {
        this.hMoney = hMoney;
    }

    public double gethMoneys() {
        return hMoneys;
    }

    public void sethMoneys(double hMoneys) {
        this.hMoneys = hMoneys;
    }

    public double gethNum() {
        return hNum;
    }

    public void sethNum(double hNum) {
        this.hNum = hNum;
    }

    public Date getVolumeDate() {
        return volumeDate;
    }

    public void setVolumeDate(Date volumeDate) {
        this.volumeDate = volumeDate;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getVolumePicId() {
        return volumePicId;
    }

    public void setVolumePicId(int volumePicId) {
        this.volumePicId = volumePicId;
    }

    public List<Volume> getVolumeList() {
        return volumeList;
    }

    public void setVolumeList(List<Volume> volumeList) {
        this.volumeList = volumeList;
    }

    public Volume() {

    }

    public Volume(int volumeId, String volumeClass, double hMoney, double hMoneys, double hNum, Date volumeDate, Image image, int volumePicId, List<Volume> volumeList) {

        this.volumeId = volumeId;
        this.volumeClass = volumeClass;
        this.hMoney = hMoney;
        this.hMoneys = hMoneys;
        this.hNum = hNum;
        this.volumeDate = volumeDate;
        this.image = image;
        this.volumePicId = volumePicId;
        this.volumeList = volumeList;
    }

    public Volume(int volumeId, String volumeClass, double hMoney, double hMoneys, double hNum, Date volumeDate) {
        this.volumeId = volumeId;
        this.volumeClass = volumeClass;
        this.hMoney = hMoney;
        this.hMoneys = hMoneys;
        this.hNum = hNum;
        this.volumeDate = volumeDate;
    }

    public Volume(String volumeClass, double hMoney, double hMoneys, double hNum, Date volumeDate, int volumePicId) {
        this.volumeClass = volumeClass;
        this.hMoney = hMoney;
        this.hMoneys = hMoneys;
        this.hNum = hNum;
        this.volumeDate = volumeDate;
        this.volumePicId = volumePicId;
    }
}
