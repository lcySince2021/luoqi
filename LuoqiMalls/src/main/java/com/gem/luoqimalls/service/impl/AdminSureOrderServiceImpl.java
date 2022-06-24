package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.AdminSureOrderMapper;
import com.gem.luoqimalls.pojo.Address;
import com.gem.luoqimalls.pojo.Order;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.AdminSureOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminSureOrderServiceImpl implements AdminSureOrderService {
    @Autowired
    private AdminSureOrderMapper adminSureOrderMapper;
    @Override
    public List<Order> selectAllWaitSendGoodsOrder(String orderState) {
        return adminSureOrderMapper.selectAllWaitSendGoodsOrder(orderState);
    }

    @Override
    public User selectUserByUserId(int userId) {
        return adminSureOrderMapper.selectUserByUserId(userId);
    }

    @Override
    public Address selectAddressByAddressId(int addressId) {
        return adminSureOrderMapper.selectAddressByAddressId(addressId);
    }


    @Override
    public int updateAdminSureSendGoodsByOrderId(String orderState,int orderId) {
        return adminSureOrderMapper.updateAdminSureSendGoodsByOrderId(orderState,orderId);
    }

    @Override
    public List<Order> selectReturnGoods(String orderState) {
        return adminSureOrderMapper.selectReturnGoods(orderState);
    }

}
