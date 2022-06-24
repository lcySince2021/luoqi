package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DuoMaiMapper {
    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPic(int goodsPicId);

    @Select("select * from goods  where goodsId=67")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    Goods selectBy67();

    @Select("select * from goods where goodsId=58")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),

    })
    Goods selectBy58();
    @Select("select * from goods where goodsId=127")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),

    })
    Goods selectBy127();
    @Select("select * from goods where goodsId=139")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),

    })
    Goods selectBy139();
    @Select("select * from goods where goodsId=150")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),

    })
    Goods selectBy150();
    @Select("select * from goods where goodsId=189")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),

    })
    Goods selectBy189();
    @Select("select * from goods where goodsId=78")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),

    })
    Goods selectBy78();
    @Select("select * from goods where goodsId=15")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),

    })
    Goods selectBy15();
    @Select("select * from goods where goodsId=46")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.DuoMaiMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),

    })
    Goods selectBy46();



}
