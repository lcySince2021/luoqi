package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Goods;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GoodsSearchService {
    PageInfo<Goods> getAllGoodsByKey(String Key, Integer curPage);
    Goods getGoodsById(int goodsId);
    String[] getBrandId();
    Integer getId_1ByClassName1(String p);
    PageInfo<Goods> getAllGoodsById_1(Integer id_1,Integer curPage);
    Integer getId_2ByClassName2(String s,Integer id_1);
    PageInfo<Goods> getAllGoodsById_1AndId_2(Integer id_1,Integer id_2,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndBrandId(Integer id_1,Integer curPage,String ss);
    List<Goods> getGoodsRandom();
    PageInfo<Goods> getAllGoodsByKeyOrderByPrice(String Key, Integer curPage);
    PageInfo<Goods> getAllGoodsByKeyOrderByGCommentCount(String Key, Integer curPage);
    PageInfo<Goods> getAllGoodsByKeyOrderByGoodsCreateDate(String Key, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1OrderByPrice(Integer id_1,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1OrderByGCommentCount(Integer id_1,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1OrderByGoodsCreateDate(Integer id_1,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2OrderByPrice(Integer id_1,Integer id_2,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2OrderByGCommentCount(Integer id_1,Integer id_2,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2OrderByGoodsCreateDate(Integer id_1,Integer id_2,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndBrandIdOrderByPrice(Integer id_1,Integer curPage,String ss);
    PageInfo<Goods> getAllGoodsById_1AndBrandIdOrderByGCommentCount(Integer id_1,Integer curPage,String ss);
    PageInfo<Goods> getAllGoodsById_1AndBrandIdOrderByGoodsCreateDate(Integer id_1,Integer curPage,String ss);
    String[] getClassName2();
    PageInfo<Goods> getAllGoodsByKeyOrderByAll(String Key, Integer curPage);
    PageInfo<Goods> getAllGoodsById_1OrderByAll(Integer id_1,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndId_2OrderByAll(Integer id_1,Integer id_2,Integer curPage);
    PageInfo<Goods> getAllGoodsById_1AndBrandIdOrderByAll(Integer id_1,Integer curPage,String ss);
    String[] getBrandIdById_1(Integer id_1);
    String[] getClassName2ById_1(Integer id_1);
    String[] getBrandIdById_1AndId_2(Integer id_1,Integer id_2);
    Integer getId_1BygoodsId(Integer id_1);
    Integer getId_2BygoodsId(Integer id_2);
    List<Goods> getLikeGoodsById_1(Integer id_1);
    List<Goods> getLikeGoodsById_2(Integer id_2);
    String getClassName1Byid(Integer id_1);
    String getClassName2Byid(Integer id_2);
    PageInfo<Goods> getAllGoodsById_2(Integer curPage);
    PageInfo<Goods> getAllGoodsorderByTime(Integer curPage);

}
