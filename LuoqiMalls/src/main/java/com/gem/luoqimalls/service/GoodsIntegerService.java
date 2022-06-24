package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Goods;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GoodsIntegerService {
    PageInfo<Goods> getAllIntegerGoods( Integer curPage);
    PageInfo<Goods> getAllIntegerGoodsbyName( String name,Integer curPage);
    PageInfo<Goods> getAllIntegerGoodsbyAll( String name,int num1,int num2,Integer curPage);

    PageInfo<Goods> selectonlyname(String  name,Integer curPage);
    PageInfo<Goods> selectonlynum(int num1,int num2,Integer curPage);
    PageInfo<Goods> selectonlynum1(int num1,Integer curPage1);
    PageInfo<Goods> selectonlynum2(int num2,Integer curPage);

}
