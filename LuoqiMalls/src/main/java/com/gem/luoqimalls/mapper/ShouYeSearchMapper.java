package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShouYeSearchMapper {
    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPic(int goodsPicId);

    @Select("select * from goods order by RAND() LIMIT 4")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
    })
    List<Goods> selectGoodsLimit4();
}
