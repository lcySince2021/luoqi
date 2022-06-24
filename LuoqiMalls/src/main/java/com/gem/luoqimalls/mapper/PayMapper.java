package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.*;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PayMapper {

//    根据ordernum查找orderid
@Select("select orderid from `order` where ordernum=#{param1}")
int  selectOrderByUserId(int ordernum);

//根据用户id展示用户地址(默认地址)
@Select("select * from address where userId=#{param1} and isDefault=0")
Address selectAddressByUserId(int userId);
    //根据用户id展示用户地址
@Select("select * from address where userId=#{param1} and isDefault=1")
List<Address> selectAllAddressByUserId(int userId);

    //     根据orderid得到订单商品详细展示
    @Select("select * from orderDetails where orderId=#{param1}")
  @Results({
            @Result(id = true,column = "orderDetailId",property = "orderDetailId"),
          @Result(column = "orderId",property = "orderId"),
            //一对一关系
            @Result(column = "goodsId",property = "goods",
                    one=@One(select = "com.gem.luoqimalls.mapper.CartMapper.sselectcartgoods")
            ),
            @Result(column = "orderGoodsNum",property = "orderGoodsNum"),
            @Result(column = "volumeId",property = "volumeId"),
    })
    List<OrderDetails> selectOrderDetailsByOrderId(int orderId);

    @Select("select * from order where orderId=#{param1}")
    Goods selectorder(int goodsId);

//    根据用户id的得到用户所拥有的优惠卷
@Select(" select volumeid from myvolume where userId=#{param1}")
List<Integer> selectvolumeid(int userId);
//根据volumeid得到优惠卷具体信息
@Select(" select * from volume where volumeid=#{param1}")
Volume  selectvolume(int volumeid);
//用户对应拥有优惠卷减少
    @Select(" delete from myvolume where  userId=#{param1} and volumeId=#{param2}")
void deletevolume(int userId,int volumeId);
//    订单加入地址
    @Select(" update `order` set addressId=#{param1},volumeid=#{param4} where userId=#{param2} and orderId=#{param3} ")
void  ordersetaddress(int AddressId,int userId,int orderId,int volumeid);

    @Select("select * from `order` where orderId=#{param1}")
   Order OrderByOrderId(int orderId);

    @Select("select ordergoodsnum from orderdetails where orderId=#{param1} ")
  int thisordernum(int orderId);

    @Select("select goodsint from goods where goodsId=#{param1}")
  int thisgoodsint(int goodsId);
    @Select("select goodsid from orderdetails where orderId=#{param1}")
  int thisgoodsid(int orderId);

















}
