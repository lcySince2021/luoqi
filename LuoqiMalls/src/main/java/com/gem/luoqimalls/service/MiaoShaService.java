package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;

import java.util.List;

public interface MiaoShaService {
//    List<Goods> selectMiaoSha();
//    List<Image> selectImageByGoodsId(int goodsId);
    //男装
    List<Goods> selectGoodsAndImages();

    // 女装
    List<Goods> selectGoodsAndImagesNvZhuang();

    //鞋
    List<Goods> selectGoodsAndImagesXie();

    //童装
    List<Goods> selectGoodsAndImagesTongZhuang();

    //箱包
    List<Goods> selectGoodsAndImagesXiangBao();

    //睡衣
    List<Goods> selectGoodsAndImagesShuiYi();

    //配饰
    List<Goods> selectGoodsAndImagesPeiShi();


}
