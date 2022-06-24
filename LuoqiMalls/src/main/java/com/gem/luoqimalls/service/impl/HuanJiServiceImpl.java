package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.HuanJiMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import com.gem.luoqimalls.service.HuanJiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HuanJiServiceImpl implements HuanJiService {
    @Autowired
    private HuanJiMapper huanJiMapper;

    @Override
    public Goods getGoodsByGoodsSales() {
        return huanJiMapper.selectByGoodsSales();
    }

    @Override
    public Image getImageByGoodsId(int goodsId) {
        return huanJiMapper.selectByGoodsId(goodsId);
    }

    @Override
    public Goods getGoodsByGoodsSales1() {
        return huanJiMapper.selectByGoodsSales1();
    }

    @Override
    public Goods getGoodsByGoodsSales2() {
        return huanJiMapper.selectByGoodsSales2();
    }

    @Override
    public Goods getGoodsByGoodsSales3() {
        return huanJiMapper.selectByGoodsSales3();
    }

    @Override
    public Goods getGoodsByGoodsSales4() {
        return huanJiMapper.selectByGoodsSales4();
    }

    @Override
    public Goods getGoodsByGoodsSales5() {
        return huanJiMapper.selectByGoodsSales5();
    }

    @Override
    public Goods getGoodsByGoodsSales6() {
        return huanJiMapper.selectByGoodsSales6();
    }

    @Override
    public Goods getGoodsByGoodsDiscount() {
        return huanJiMapper.selectByGoodsDiscountBottom();
    }


}
