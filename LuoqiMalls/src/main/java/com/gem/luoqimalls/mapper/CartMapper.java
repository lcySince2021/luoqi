package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Cart;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CartMapper {
//添加到购物车
    @Select(" insert into  cart(userid,goodsid,num) value(#{param1},#{param2},1)")
    Integer insertCart(int userid,int goodsid);
//购物车中是否已存在
@Select("select * from cart where userid=#{param1} and goodsid=#{param2}")
Cart selecttCart(int userid, int goodsid);
//    若已存在则num+1
@Select("update cart set num=num+1 where userid=#{param1} and goodsid=#{param2}")
Integer updateCart(int userid,int goodsid);
@Select("update cart set num=num-1 where userid=#{param1} and goodsid=#{param2}")
Integer updateCartdown(int userid,int goodsid);
@Select("select num from cart where userid=#{param1} and goodsid=#{param2}")
Integer selectnum(int userid,int goodsid);

//购物车中对应物品的数量
//select num from cart where userid=54 and goodsid in(select goodsid from cart where userid=54)



//查找id
    @Select("select * from goods where goodsId=#{param1}")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodspicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    Goods sselectcartgoods(int goodsId);
    @Select("select * from cart where userid=#{param1} and goodsid in(select goodsid from cart where userid=#{param1})")
    @Results({
            @Result(id = true,column = "cartId",property = "cartId"),
            //一对一关系
            @Result(column = "goodsId",property = "goods",
                    one=@One(select = "com.gem.luoqimalls.mapper.CartMapper.sselectcartgoods")
            ),
            @Result(column = "userId",property = "userId"),
            @Result(column = "num",property = "num"),
    })
    List<Cart> CartGoodsNum(int userId);


//    删除
    @Select("\n" +
            "delete  from cart where userid=#{param1} and goodsid=#{param2}")
    Integer cartdel(int userId,int goodsId);






//
//    //查看购物车中的信息
//    @Select("select * from goods where goodsid in(select goodsid from cart where userid=#{param1})")
//    @Results({
//            @Result(id = true,column = "goodsId",property = "goodsId"),
//            //一对一关系
//            @Result(column = "goodspicid",property = "image",
//                    one=@One(select = "com.example.demo.mapper.GoodsSearchMapper.selectPic")
//            ),
//            @Result(column = "goodsName",property = "goodsName"),
//            @Result(column = "goodsPrice",property = "goodsPrice"),
//            @Result(column = "goodsSales",property = "goodsSales"),
//    })
//    List<Goods> selectCartGoods(int userid);


    @Select("select count(*) from goods where goodsid in(select goodsid from cart where userid=#{param1})")
int cartCount(int userid);

    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPic(int goodsPicId);







}
