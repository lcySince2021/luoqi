package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.GoodsSearch;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface GoodsSearchMapper1 {

    List<Goods> selectAllGoods(GoodsSearch goodsSearch);
    int countSelectAllGoods(GoodsSearch goodsSearch);
    Integer selectId_2ByClassName2(String zl);
    @Select("select DISTINCT brandId from goods where brandId=#{param1} and id_1=0")
    String selectBrangId(String b);
    List<Goods> selectAllGoodsOrderByAll(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsOrderByGoodsPrice(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsOrderByGCommentCount(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsOrderByGoodsCreateDate(GoodsSearch goodsSearch);

    @Select("select  id_2 from goodsclass2 where className2=#{param1} and id_1=#{param2}")
    Integer selectId_2ByClassName2AndId_1(String zl,Integer id_1);

    List<Goods> selectAllGoodsById_1(GoodsSearch goodsSearch);
    int countselectAllGoodsById_1(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1OrderByAll(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1OrderByGoodsPrice(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1OrderByGCommentCount(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1OrderByGoodsCreateDate(GoodsSearch goodsSearch);

    List<Goods> selectAllGoodsById_1AndId_2(GoodsSearch goodsSearch);
    int countselectAllGoodsById_1AndId_2(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1AndId_2OrderByAll(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1AndId_2OrderByGoodsPrice(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1AndId_2OrderByGCommentCount(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1AndId_2OrderByGoodsCreateDate(GoodsSearch goodsSearch);

    List<Goods> selectAllGoodsById_1AndClassName2(GoodsSearch goodsSearch);
    int countselectAllGoodsById_1AndClassName2(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1AndClassName2OrderByAll(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1AndClassName2OrderByGoodsPrice(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1AndClassName2OrderByGCommentCount(GoodsSearch goodsSearch);
    List<Goods> selectAllGoodsById_1AndClassName2OrderByGoodsCreateDate(GoodsSearch goodsSearch);

}
