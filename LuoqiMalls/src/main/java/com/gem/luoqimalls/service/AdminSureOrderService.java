package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Address;
import com.gem.luoqimalls.pojo.Order;
import com.gem.luoqimalls.pojo.User;

import java.util.List;

public interface AdminSureOrderService {
    List<Order> selectAllWaitSendGoodsOrder(String orderState);
    User selectUserByUserId(int userId);
    Address selectAddressByAddressId(int addressId);

    //确认订单
    int updateAdminSureSendGoodsByOrderId(String orderState,int orderId);


    List<Order> selectReturnGoods(String orderState);

}
