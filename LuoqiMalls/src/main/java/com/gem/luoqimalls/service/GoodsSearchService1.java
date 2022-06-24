package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.GoodsSearch;
import com.github.pagehelper.PageInfo;

public interface GoodsSearchService1 {
    PageInfo<Goods> getAllGoods(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsOrderByAll(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsOrderByGoodsPrice(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsOrderBygGoodsComment(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsOrderByGoodsCreateDate(GoodsSearch goodsSearch, Integer curPage);
    Integer getId_2ByBrandId(String zl);
    String getBrandId(String b);
    PageInfo<Goods> getAllGoodsById_1(GoodsSearch goodsSearch, Integer curPage);
    Integer getId_2ByClassName2AndId_1(String className2,Integer id_1);
    PageInfo<Goods> getAllGoodsById_1OrderByAll(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1OrderByGoodsPrice(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1OrderBygGoodsComment(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1OrderByGoodsCreateDate(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2OrderByAll(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2OrderByGoodsPrice(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2OrderBygGoodsComment(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2OrderByGoodsCreateDate(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndClassName2(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndClassName2OrderByAll(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndClassName2OrderByGoodsPrice(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndClassName2OrderBygGoodsComment(GoodsSearch goodsSearch, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndClassName2OrderByGoodsCreateDate(GoodsSearch goodsSearch, Integer curPage);


}
