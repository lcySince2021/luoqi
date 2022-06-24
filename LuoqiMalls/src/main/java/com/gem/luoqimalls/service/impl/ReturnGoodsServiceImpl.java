package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.ReturnGoodsMapper;
import com.gem.luoqimalls.pojo.Order;
import com.gem.luoqimalls.service.ReturnGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnGoodsServiceImpl implements ReturnGoodsService{
    @Autowired
    private ReturnGoodsMapper returnGoodsMapper;

    @Override
    public List<Order> selectOrderListWhereWaitCommentByUserId(int userId, String orderState) {
        return returnGoodsMapper.selectOrderListWhereWaitCommentByUserId(userId,orderState);
    }

    @Override
    public Integer updateOrderStateByOrderId(String orderState,int orderId) {
        return returnGoodsMapper.updateOrderStateByOrderId(orderState,orderId);
    }
}
