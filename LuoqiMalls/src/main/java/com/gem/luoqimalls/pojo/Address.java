package com.gem.luoqimalls.pojo;

public class Address {
    private int addressId;   //地址id
    private String addressrName;   //收货人姓名
    private String addressTel;   //收货人电话
    private String addressProvince;   //收货人所在省
    private String addressCity;    //收货人所在市
    private String addressDistrict;   //收货人所在区
    private String addressDetailed;     //收货人详细地址
    private int userId;    //对应的用户id

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", addressrName='" + addressrName + '\'' +
                ", addressTel='" + addressTel + '\'' +
                ", addressProvince='" + addressProvince + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressDistrict='" + addressDistrict + '\'' +
                ", addressDetailed='" + addressDetailed + '\'' +
                ", userId=" + userId +
                ", isDefault=" + isDefault +
                ", user=" + user +
                '}';
    }

    private int isDefault;    //是否是默认地址

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address() {
    }

    public Address(String addressrName, String addressTel, String addressProvince, String addressCity, String addressDistrict, String addressDetailed, int userId, int isDefault) {
        this.addressrName = addressrName;
        this.addressTel = addressTel;
        this.addressProvince = addressProvince;
        this.addressCity = addressCity;
        this.addressDistrict = addressDistrict;
        this.addressDetailed = addressDetailed;
        this.userId = userId;
        this.isDefault = isDefault;
    }

    public Address(int addressId, String addressrName, String addressTel, String addressProvince, String addressCity, String addressDistrict, String addressDetailed) {
        this.addressId = addressId;
        this.addressrName = addressrName;
        this.addressTel = addressTel;
        this.addressProvince = addressProvince;
        this.addressCity = addressCity;
        this.addressDistrict = addressDistrict;
        this.addressDetailed = addressDetailed;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressrName() {
        return addressrName;
    }

    public void setAddressrName(String addressrName) {
        this.addressrName = addressrName;
    }

    public String getAddressTel() {
        return addressTel;
    }

    public void setAddressTel(String addressTel) {
        this.addressTel = addressTel;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressDistrict() {
        return addressDistrict;
    }

    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public String getAddressDetailed() {
        return addressDetailed;
    }

    public void setAddressDetailed(String addressDetailed) {
        this.addressDetailed = addressDetailed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }
}
