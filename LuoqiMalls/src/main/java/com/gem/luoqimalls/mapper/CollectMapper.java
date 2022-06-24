package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Cart;
import com.gem.luoqimalls.pojo.Collect;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface CollectMapper {
//添加到收藏
    @Select(" insert into  collect(userId,goodsId,collectDate) value(#{param1},#{param2},#{param3})")
    Integer insertCollet(int userId, int goodsId, Date collectDate);
//收藏中是否已存在
@Select("select * from collect where userid=#{param1} and goodsid=#{param2}")
Collect selecttCollet(int userid, int goodsid);
//



    @Select("select * from collect where userid=#{param1} and goodsid in(select goodsid from collect where userid=#{param1})")
    @Results({
            @Result(id = true,column = "collectId",property = "collectId"),
            //一对一关系
            @Result(column = "goodsId",property = "goods",
                    one=@One(select = "com.gem.luoqimalls.mapper.CartMapper.sselectcartgoods")
            ),
            @Result(column = "userId",property = "userId"),
            @Result(column = "collectDate",property = "collectDate"),
    })
    List<Collect> collectGoodsGet(int userId);



    @Select("select count(*) from collect where userid=#{param1} and goodsid in(select goodsid from collect where userid=#{param1})")
    int collectGoodsCount(int userId);


    @Select("delete  from collect where userid=#{param1} and goodsid=#{param2}")
    Integer collectdel(int userId,int goodsId);


}
