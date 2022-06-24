package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.CartMapper;
import com.gem.luoqimalls.mapper.OrderMapper;
import com.gem.luoqimalls.mapper.PayMapper;
import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.CartService;
import com.gem.luoqimalls.service.PayService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayServieImpl implements PayService {
    @Autowired
    private PayMapper payMapper;
    @Override
    public int userIdselectByid(int ordernum) {
        return payMapper.selectOrderByUserId(ordernum);
    }

    @Override
    public List<OrderDetails> selectOrderDetailsByOrderId(int orderId) {
        return payMapper.selectOrderDetailsByOrderId(orderId);
    }

    @Override
    public Address selectAddressByUserId(int userId) {
        return payMapper.selectAddressByUserId(userId);
    }

    @Override
    public List<Address> selectAllAddressByUserId(int userId) {
        return payMapper.selectAllAddressByUserId(userId);
    }

    @Override
    public List<Integer> selectvolumeid(int userId) {
        return payMapper.selectvolumeid(userId);
    }

    @Override
    public Volume selectvolume(int volumeid) {
        return payMapper.selectvolume(volumeid);
    }

    @Override
    public void deletevolume(int userId, int volumeId) {
        payMapper.deletevolume(userId,volumeId);
    }

    @Override
    public void ordersetaddress(int AddressId, int userId, int orderId, int volumeid) {
        payMapper.ordersetaddress(AddressId,userId,orderId,volumeid);
    }


    @Override
    public Order OrderByOrderId(int orderId) {
        return payMapper.OrderByOrderId(orderId);
    }

    @Override
    public int thisgoodsid(int orderId) {
        return payMapper.thisgoodsid(orderId);
    }

    @Override
    public int thisordernum(int orderId) {
        return payMapper.thisordernum(orderId);
    }

    @Override
    public int thisgoodsint(int goodsId) {
        return payMapper.thisgoodsint(goodsId);
    }


}
