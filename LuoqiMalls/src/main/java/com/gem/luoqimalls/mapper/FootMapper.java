package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Collect;
import com.gem.luoqimalls.pojo.Myfoot;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface FootMapper {
//添加到足迹
    @Select(" insert into  myfoot(userId,goodsId,footdate) value(#{param1},#{param2},#{param3})")
    Integer insertFoot(int userId, int goodsId, Date footdate);
//足迹中是否已存在
@Select("select * from myfoot where userid=#{param1} and goodsid=#{param2}")
Myfoot selectFoot(int userid, int goodsid);
//
//足迹更新

@Select("update  myfoot set footdate=#{param3} where userId=#{param1} and goodsId=#{param2}")
Integer updateFoot(int userId, int goodsId, Date footdate);


//展示
    @Select("select * from myfoot where userid=#{param1} ")
    @Results({
            @Result(id = true,column = "collectId",property = "collectId"),
            //一对一关系
            @Result(column = "goodsId",property = "goods",
                    one=@One(select = "com.gem.luoqimalls.mapper.CartMapper.sselectcartgoods")
            ),
            @Result(column = "userId",property = "userId"),
            @Result(column = "collectDate",property = "collectDate"),
    })
    List<Myfoot> footget(int userId);



    @Select("select count(*) from collect where userid=#{param1} and goodsid in(select goodsid from collect where userid=#{param1})")
    int collectGoodsCount(int userId);





}
