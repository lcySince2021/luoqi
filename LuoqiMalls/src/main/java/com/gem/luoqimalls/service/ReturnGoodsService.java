package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Order;

import java.util.List;

public interface ReturnGoodsService {


    List<Order> selectOrderListWhereWaitCommentByUserId(int userId, String orderState);


    Integer updateOrderStateByOrderId(String orderState,int orderId);
}
