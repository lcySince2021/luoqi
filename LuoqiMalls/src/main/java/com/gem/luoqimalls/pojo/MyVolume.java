package com.gem.luoqimalls.pojo;

import java.util.List;

public class MyVolume {
    private int myVolumeId;//
    private int volumeId;//优惠券ID
    private int userId;//用户ID
    private MyVolume myVolume;

    private List<Volume> volumeList;

    @Override
    public String toString() {
        return "MyVolume{" +
                "myVolumeId=" + myVolumeId +
                ", volumeId=" + volumeId +
                ", userId=" + userId +
                ", myVolume=" + myVolume +
                ", volumeList=" + volumeList +
                ", volume=" + volume +
                '}';
    }

    public MyVolume getMyVolume() {
        return myVolume;
    }

    public void setMyVolume(MyVolume myVolume) {
        this.myVolume = myVolume;
    }

    public List<Volume> getVolumeList() {
        return volumeList;
    }

    public void setVolumeList(List<Volume> volumeList) {
        this.volumeList = volumeList;
    }

    private Volume volume;

    public MyVolume(int myVolumeId) {
        this.myVolumeId = myVolumeId;
    }


    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public MyVolume(int myVolumeId, int volumeId, int myVolumeNum, int userId) {
        this.myVolumeId = myVolumeId;
        this.volumeId = volumeId;

        this.userId = userId;
    }

    public MyVolume() {
    }

    public int getMyVolumeId() {
        return myVolumeId;
    }

    public void setMyVolumeId(int myVolumeId) {
        this.myVolumeId = myVolumeId;
    }

    public int getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(int volumeId) {
        this.volumeId = volumeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
