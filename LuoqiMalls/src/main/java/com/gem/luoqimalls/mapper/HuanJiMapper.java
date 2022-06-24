package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HuanJiMapper {
    //人气最高(顶部)
    @Select("select * from goods order by goodsSales desc limit 0,1")
    Goods selectByGoodsSales();

    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
    Image selectByGoodsId(int goodsId);

    //人气1-6(最高除外)
    //第一
    @Select("select * from goods order by goodsSales desc limit 1,1")
    Goods selectByGoodsSales1();
    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
    Image selectByGoodsId1(int goodsId);
    //第二
    @Select("select * from goods order by goodsSales desc limit 2,1")
    Goods selectByGoodsSales2();
    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
    Image selectByGoodsId2(int goodsId);
    //第三
    @Select("select * from goods order by goodsSales desc limit 3,1")
    Goods selectByGoodsSales3();
    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
    Image selectByGoodsId3(int goodsId);
    //第四
    @Select("select * from goods order by goodsSales desc limit 4,1")
    Goods selectByGoodsSales4();
    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
    Image selectByGoodsId4(int goodsId);
    //第五
    @Select("select * from goods order by goodsSales desc limit 5,1")
    Goods selectByGoodsSales5();
    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
    Image selectByGoodsId5(int goodsId);
    //第六
    @Select("select * from goods order by goodsSales desc limit 6,1")
    Goods selectByGoodsSales6();
    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
    Image selectByGoodsId6(int goodsId);




//    最底部带介绍(打折最高的)
    @Select("select * from goods order by goodsDiscount limit 0,1")
    Goods selectByGoodsDiscountBottom();
    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
    Image selectByGoodsIdBottom(int goodsId);


}
