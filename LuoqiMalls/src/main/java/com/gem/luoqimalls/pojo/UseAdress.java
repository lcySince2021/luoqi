package com.gem.luoqimalls.pojo;

public class UseAdress {
    private int addressId;  //地址id
    private String address;  //用户地址
    private String addressPhone;  //该地址的收获地址
    private String addressPer;  //收货人
    private int userId;  //用户id

    public UseAdress() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public String getAddressPer() {
        return addressPer;
    }

    public void setAddressPer(String addressPer) {
        this.addressPer = addressPer;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
