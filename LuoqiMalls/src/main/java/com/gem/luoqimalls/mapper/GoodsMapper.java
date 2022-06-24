package com.gem.luoqimalls.mapper;


import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface GoodsMapper {


//    查询商品的信息+类别名  多表查询 resultMap

    //     查询所有的商品[不包含类别名,类别号]
    @Select("select * from goods")
    //绑定另外一张表的数据
    @Results({
         @Result(id = true,column = "id",property = "id"),
            //一对一关系
         @Result(column = "catory_id",property = "catory",
         one=@One(select = "com.gem.luoqimalls.mapper.CategoryMapper.selectCatory")
         ),
         @Result(column = "name",property = "name"),
         @Result(column = "price",property = "price"),
         @Result(column = "detail",property = "detail"),
         @Result(column = "pic",property = "pic"),
         @Result(column = "createtime",property = "createtime"),
         @Result(column = "status",property = "status")
    })
    List<Goods> selectAllGoods();



    @Select("select * from goods where id=#{param1}")
    //绑定另外一张表的数据
    @Results({
            @Result(id = true,column = "id",property = "id"),
            //一对一关系
            @Result(column = "catory_id",property = "catory",
                    one=@One(select = "com.gem.luoqimalls.mapper.CategoryMapper.selectCatory")
            ),
            @Result(column = "name",property = "name"),
            @Result(column = "price",property = "price"),
            @Result(column = "detail",property = "detail"),
            @Result(column = "pic",property = "pic"),
            @Result(column = "createtime",property = "createtime"),
            @Result(column = "status",property = "status")
    })
    Goods selectById(int gid);

    @Update("update goods set price=#{price} ,pic =#{pic},createtime=#{createtime} where id=#{id}")
    void update(Goods goods);
}
