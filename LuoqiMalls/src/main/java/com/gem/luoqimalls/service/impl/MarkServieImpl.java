package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.GoodsIntegerMapper;
import com.gem.luoqimalls.pojo.Markbuy;
import com.gem.luoqimalls.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkServieImpl implements MarkService {
    @Autowired
   private GoodsIntegerMapper integerMapper;

    @Override
    public List<Markbuy> selectmarkbuy(int userId) {
        return integerMapper.selectmarkbuy(userId);
    }
}
