package com.gem.luoqimalls.pojo;

public class OrderAddress {
    private int orderAddress;
    private String address;
    private int orderId;
    private User user;

    public OrderAddress() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OrderAddress(int orderAddress) {
        this.orderAddress = orderAddress;
    }

    public int getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(int orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderAddress{" +
                "orderAddress=" + orderAddress +
                ", address='" + address + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
