package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.*;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface OrderService {

    int cartgoodsnum(int userId,int goodsId);
    List<Order> selectOrderByUserId(int userId);

    List<OrderDetails> selectOrderDetailsByOrderId(int orderId);

    Goods selectGoodsByGoodsId(int goodsId);

    Image selectImageByGoodsPicId(int goodsPicId);


    List<Order> selectWaitPayOrderByUserId(int userId);

    List<Order> selectWaitSendGoodsOrderByUserId(int userId);

    List<Order> selectWaitGetGoodsOrderByUserId(int userId);

    List<Order> selectWaitCommentOrderByUserId(int userId);

    void orderinsertto(int userId,int orderNum);
    int orderselectto(int orderNum);
    void orderdetailinsertto(int orderId,int goodsId,int ordergoodsnum);
   List<Integer> numofcartselect(int userId,int goodsId);
    void numofcartupdate(int userId,int goodsId,int ordergoodsnum);
    void ofcartdelete(int userId,int goodsId);

    int selectaddressId(int userId,int orderId);
    Address getaddress(int addressid);

    void orderset(int orderId);
    void goodsbuy(int userId,int orderId,Date goodsbuydate);

    void goodsupdate(int orderId);
    List<Integer> goodsinit(int orderId);
   void userinit(int sum,int userId);
    void orderdel(int orderId);

    void ordermarkupdate(Integer ordermark,int orderid);
    void uservip(int userId);


    int getgoodsint(int goodsid);
    void insertmark(int userId,int orderNum,int ordermark,int addressId,Date goodsbuydate);
    int mraddressid(int userid);
   void usermarkupdate(int userinit,int userId);

    void insertmarkbuy(int userId,int goodsId,int num,Date markdate,int marks);

    List<Integer> ordermarkgoodsid(int orderId);
    int ordermarkgoodsnum(int orderId,int goodsId);
   int ordermarkgoodsmark(int goodsId);
    void thismarkorder(int addressid,int ordermark,Date ordercreateTime,int orderid);
    int ordermarkgoodsint(int goodsId);
    Integer getIsJY(Integer userId);


}
