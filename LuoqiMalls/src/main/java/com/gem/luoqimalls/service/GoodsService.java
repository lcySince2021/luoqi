package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getAllGoods();

    Goods getGoodsById(int goodsId);

    void updateGoods(Goods goods);
}
