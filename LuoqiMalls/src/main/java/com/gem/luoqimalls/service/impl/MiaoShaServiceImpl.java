package com.gem.luoqimalls.service.impl;


import com.gem.luoqimalls.mapper.MiaoShaMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.service.MiaoShaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiaoShaServiceImpl implements MiaoShaService {
    @Autowired
    private MiaoShaMapper miaoShaMapper;

//    @Override
//    public List<Goods> selectMiaoSha() {
//        return miaoShaMapper.selectMiaoSha();
//    }

//    @Override
//    public List<Image> selectImageByGoodsId(int goodsId) {
//        return miaoShaMapper.selectImageByGoodsId(goodsId);
//    }
    //男装
    @Override
    public List<Goods> selectGoodsAndImages() {
        return miaoShaMapper.selectGoodsAndImages();
    }

    // 女装
    @Override
    public List<Goods> selectGoodsAndImagesNvZhuang() {
        return miaoShaMapper.selectGoodsAndImagesNvZhuang();
    }

    //鞋
    @Override
    public List<Goods> selectGoodsAndImagesXie() {
        return miaoShaMapper.selectGoodsAndImagesxXie();
    }

    //童装
    @Override
    public List<Goods> selectGoodsAndImagesTongZhuang() {
        return miaoShaMapper.selectGoodsAndImagesxTongzhuang();
    }

    //箱包
    @Override
    public List<Goods> selectGoodsAndImagesXiangBao() {
        return miaoShaMapper.selectGoodsAndImagesxXiangBao();
    }

    //睡衣
    @Override
    public List<Goods> selectGoodsAndImagesShuiYi() {
        return miaoShaMapper.selectGoodsAndImagesxShuiYi();
    }

    //配饰
    @Override
    public List<Goods> selectGoodsAndImagesPeiShi() {
        return miaoShaMapper.selectGoodsAndImagesxPeiShi();
    }
}
