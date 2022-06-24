package com.gem.luoqimalls.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private int userId;//用户Id
    private String orderState;  //订单状态
    private int addressId;   //地址标号
    private int orderNum;//订单号
    private String oid;
    private String  oname;
    private float money;
    private  String detail;
    private int status;
    private int ordermark;
    private Date orderCreateTime;

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderState='" + orderState + '\'' +
                ", addressId=" + addressId +
                ", orderNum=" + orderNum +
                ", oid='" + oid + '\'' +
                ", oname='" + oname + '\'' +
                ", money=" + money +
                ", detail='" + detail + '\'' +
                ", status=" + status +
                ", ordermark=" + ordermark +
                ", orderCreateTime=" + orderCreateTime +
                ", orderAddress=" + orderAddress +
                ", address=" + address +
                ", orderMoney=" + orderMoney +
                ", goods=" + goods +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    private OrderAddress orderAddress;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public OrderAddress getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(OrderAddress orderAddress) {
        this.orderAddress = orderAddress;
    }

    public int getOrdermark() {
        return ordermark;
    }

    public void setOrdermark(int ordermark) {
        this.ordermark = ordermark;
    }

    private double orderMoney;

    public double getOrderMoney() {
        return orderMoney;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }

    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    List<OrderDetails> orderDetailsList;

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Order(String oid, String oname, float money, String detail) {
        this.oid = oid;
        this.oname = oname;
        this.money = money;
        this.detail = detail;
        this.status=0;
    }

}
