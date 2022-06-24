package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Order;

import java.util.List;

public interface BillService {
    List<Order> selectOrderExpectWaitPay(String orderState,int userId);
}
