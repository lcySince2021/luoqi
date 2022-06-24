package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;

public interface HuanJiService {
    //人气最高
    Goods getGoodsByGoodsSales();
    Image getImageByGoodsId(int goodsId);

    //人气1-6(最高除外)
    Goods getGoodsByGoodsSales1();
    Goods getGoodsByGoodsSales2();
    Goods getGoodsByGoodsSales3();
    Goods getGoodsByGoodsSales4();
    Goods getGoodsByGoodsSales5();
    Goods getGoodsByGoodsSales6();





    //    最底部带介绍(打折最高的)
    Goods getGoodsByGoodsDiscount();


}
