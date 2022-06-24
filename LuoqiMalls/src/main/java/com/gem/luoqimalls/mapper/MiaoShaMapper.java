package com.gem.luoqimalls.mapper;


import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MiaoShaMapper {
//    @Select("select * from goods where miaosha = '0'")
//    List<Goods> selectMiaoSha();
//
//    @Select("select * FROM goods g,image i where goodsId=#{param1} and g.goodsPicid=i.goodsPicid")
//    List<Image> selectImageByGoodsId(int goodsId);

    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPic(int goodsPicId);
    //男装
    @Select("select * from goods where ismiaosha='0' and goodsShelf='0' and id_2=1 or id_2=2 or id_2=3 order by RAND() LIMIT 8")
    @Results({
            @Result(id=true,column = "goodsId",property = "goodsId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.MiaoShaMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
            @Result(column = "goodsLastPrice",property = "goodsLastPrice"),
    })
    List<Goods> selectGoodsAndImages();
    //女装
    @Select("select * from goods where ismiaosha='0' and goodsShelf='0' and id_2=6 or id_2=7 or id_2=8 order by RAND() LIMIT 8")
    @Results({
            @Result(id=true,column = "goodsId",property = "goodsId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.MiaoShaMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
            @Result(column = "goodsLastPrice",property = "goodsLastPrice"),
    })
    List<Goods> selectGoodsAndImagesNvZhuang();
    //鞋
    @Select("select * from goods where ismiaosha='0' and goodsShelf='0' and id_2=4 or id_2=5 or id_2=9 or id_2=10 or id_2=11 or id_2=14 or id_2=15 order by RAND() LIMIT 8")
    @Results({
            @Result(id=true,column = "goodsId",property = "goodsId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.MiaoShaMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
            @Result(column = "goodsLastPrice",property = "goodsLastPrice"),
    })
    List<Goods> selectGoodsAndImagesxXie();
    //童装
    @Select("select * from goods where ismiaosha='0' and goodsShelf='0' and id_2=12 or id_2=13 order by RAND() LIMIT 8")
    @Results({
            @Result(id=true,column = "goodsId",property = "goodsId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.MiaoShaMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
            @Result(column = "goodsLastPrice",property = "goodsLastPrice"),
    })
    List<Goods> selectGoodsAndImagesxTongzhuang();
    //箱包
    @Select("select * from goods where ismiaosha='0' and goodsShelf='0' and id_2=21 order by RAND() LIMIT 8")
    @Results({
            @Result(id=true,column = "goodsId",property = "goodsId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.MiaoShaMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
            @Result(column = "goodsLastPrice",property = "goodsLastPrice"),
    })
    List<Goods> selectGoodsAndImagesxXiangBao();
    //睡衣
    @Select("select * from goods where ismiaosha='0' and goodsShelf='0' and id_2=18 or id_2=19 or id_2=20 order by RAND() LIMIT 8")
    @Results({
            @Result(id=true,column = "goodsId",property = "goodsId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.MiaoShaMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
            @Result(column = "goodsLastPrice",property = "goodsLastPrice"),
    })
    List<Goods> selectGoodsAndImagesxShuiYi();
    //配饰
    @Select("select * from goods where ismiaosha='0' and goodsShelf='0' and id_2=16 or id_2=17 order by RAND() LIMIT 8")
    @Results({
            @Result(id=true,column = "goodsId",property = "goodsId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.MiaoShaMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
            @Result(column = "goodsLastPrice",property = "goodsLastPrice"),
    })
    List<Goods> selectGoodsAndImagesxPeiShi();
}
