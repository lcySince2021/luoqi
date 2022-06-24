package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface OrderMapper {
    //查询全部订单
    @Select("select * from `order` where userId=#{userId}")
    List<Order> selectOrderByUserId(int userId);
    @Select("select * from orderDetails where orderId=#{orderId}")
    List<OrderDetails> selectOrderDetailsByOrderId(int orderId);
    @Select("select * from goods where goodsId=#{goodsId}")
    Goods selectGoodsByGoodsId(int goodsId);
    @Select("select * from image where goodsPicId=#{goodsPicId}")
    Image selectImageByGoodsPicId(int goodsPicId);

    //查询未付款订单
    @Select("select * from `order` where userId=#{userId} and orderState='待付款'")
    List<Order> selectWaitPayOrderByUserId(int userId);

    //查询未发货订单
    @Select("select * from `order` where userId=#{userId} and orderState='待发货'")
    List<Order> selectWaitSendGoodsOrderByUserId(int userId);

    //查询未收货订单
    @Select("select * from `order` where userId=#{userId} and orderState='待收货'")
    List<Order> selectWaitGetGoodsOrderByUserId(int userId);


    //查询待评价订单
    @Select("select * from `order` where userId=#{userId} and orderState='待评价'")
    List<Order> selectWaitCommentOrderByUserId(int userId);

//  添加订单（未付款）

    @Select("insert into `order` (userId,orderstate,orderNum) value(#{param1},'待付款',#{param2})")
void inserttoorder(int userId,int orderNum);

//    查找订到编号
@Select("select orderId from `order` where orderNum=#{param1}")
int selecttoorder(int orderNum);

//    添加订单详情表
@Select("insert into orderdetails (orderId,goodsId,ordergoodsnum) value(#{param1},#{param2},#{param3})")
void inserttoorderdetail(int orderId,int goodsId,int ordergoodsnum);

//    查看购物车中对应商品数量

    @Select("select num from cart where userId=#{param1} and goodsId=#{param2}")
    List<Integer> selectnumofcart(int userId,int goodsId);

//    购物车中商品数量减少


@Select("update cart set num=num-#{param3} where userId=#{param1} and goodsId=#{param2}")
void updatenumofcart(int userId,int goodsId,int ordergoodsnum);

//    删除购物车中对应商品

    @Select(" DELETE from cart where userId=#{param1} and goodsId=#{param2}")
    void deleteofcart(int userId,int goodsId);



//根据订单编号，用户id得到订单的地址id
    @Select(" select addressid from `order` where userId=#{param1} and orderId=#{param2}")
   int selectaddressId(int userId,int orderId);
//根据id得到地址详情
@Select(" select * from address where addressid=#{param1} ")
Address getaddress(int addressid);
//订单改为待发货

    @Select(" update `order` set orderState='待发货' where orderId=#{param1} ")
    void orderset(int orderId);

//购买记录表

    @Select(" insert into goodsbuy(userId,orderId,goodsbuydate) value(#{param1},#{param2},#{param3}) ")
    void goodsbuy(int userId,int orderId,Date goodsbuydate);


    @Select(" update goods set goodssum=goodssum-1,goodssales=goodssales+1 where goodsid in(select goodsid from orderdetails where orderid=#{param1})")
    void goodsupdate(int orderId);

//订单商品包含积分
@Select(" select sum(goodsMark) from goods  where goodsid in(select goodsid from orderdetails where orderid=#{param1})")
List<Integer> goodsinit(int orderId);

//用户积分增加
    @Select(" update user set userinit=userinit+#{param1} where userId=#{param2}")
void userinit(int sum,int userId);
//删除订单

    @Select("delete from `order` where  orderId=#{param1}")
    void orderdel(int orderId);



    @Select("update `order` set ordermark=#{param1} where orderid=#{param2}")
    void ordermarkupdate(Integer ordermark,int orderid);




    @Select("update user set uservip=0 where userId=#{param1}")
    void uservip(int userId);


    @Select("select num from cart where userId=#{param1} and goodsId=#{param2}")
    int cartgoodsnum(int userId,int goodsId);


    @Select("insert into `order` (userId,orderstate,orderNum,ordermark,addressId,orderCreateTime) value(#{param1},'待发货',#{param2},#{param3},#{param4},#{param5})")
    void insertmark(int userId,int orderNum,int ordermark,int addressId,Date goodsbuydate);

  @Select("select goodsint from goods where goodsid=#{param1}")
    int getgoodsint(int goodsid);

    @Select("  select  addressid from  address  where isDefault=0  and userid=#{param1}")
    int mraddressid(int userid);
    @Select(" update user set userinit=userinit-#{param1} where userId=#{param2}")
    void usermarkupdate(int userinit,int userId);
   @Select(" insert into  markbuy(userId,goodsId,num,markdate,marks) value(#{param1},#{param2},#{param3},#{param4},#{param5})")
    void insertmarkbuy(int userId,int goodsId,int num,Date markdate,int marks);


   @Select(" select goodsid from orderdetails where orderId=#{param1}")
    List<Integer> ordermarkgoodsid(int orderId);
   @Select("select orderGoodsNum from orderdetails where orderId=#{param1} and goodsId=#{param2}")
    int ordermarkgoodsnum(int orderId,int goodsId);
   @Select("select goodsmark from goods where goodsid=#{param1}")
    int ordermarkgoodsmark(int goodsId);
   @Select("select goodsint from goods where goodsid=#{param1}")
    int ordermarkgoodsint(int goodsId);

   @Select("update `order` set orderState='待发货',addressid=#{param1},ordermark=#{param2},ordercreateTime=#{param3} where orderid=#{param4}")
   void thismarkorder(int addressid,int ordermark,Date ordercreateTime,int orderid);
    @Select("select isJY from user where userId=#{param1}")
    Integer selectIsJY(Integer userId);




}