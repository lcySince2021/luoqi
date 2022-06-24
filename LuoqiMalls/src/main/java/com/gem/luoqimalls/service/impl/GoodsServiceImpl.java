package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.GoodsMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper mapper;
    @Override
    public List<Goods> getAllGoods() {
        return mapper.selectAllGoods();
    }

    @Override
    public Goods getGoodsById(int gid) {
        return mapper.selectById(gid);
    }

    @Override
    public void updateGoods(Goods goods) {
         mapper.update(goods);
    }
}
