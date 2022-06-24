package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.BillMapper;
import com.gem.luoqimalls.pojo.Order;
import com.gem.luoqimalls.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillMapper billMapper;

    @Override
    public List<Order> selectOrderExpectWaitPay(String orderState,int userId) {
        return billMapper.selectOrderExpectWaitPay(orderState,userId);
    }
}
