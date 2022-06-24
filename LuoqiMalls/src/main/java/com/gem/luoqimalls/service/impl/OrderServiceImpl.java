package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.OrderMapper;
import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public int cartgoodsnum(int userId, int goodsId) {
        return orderMapper.cartgoodsnum(userId,goodsId);
    }

    @Override
    public List<Order> selectOrderByUserId(int userId) {
        return orderMapper.selectOrderByUserId(userId);
    }

    @Override
    public List<OrderDetails> selectOrderDetailsByOrderId(int orderId) {
        return orderMapper.selectOrderDetailsByOrderId(orderId);
    }

    @Override
    public Goods selectGoodsByGoodsId(int goodsId) {
        return orderMapper.selectGoodsByGoodsId(goodsId);
    }

    @Override
    public Image selectImageByGoodsPicId(int goodsPicId) {
        return orderMapper.selectImageByGoodsPicId(goodsPicId);
    }

    @Override
    public List<Order> selectWaitPayOrderByUserId(int userId) {
        return orderMapper.selectWaitPayOrderByUserId(userId);
    }

    @Override
    public List<Order> selectWaitSendGoodsOrderByUserId(int userId) {
        return orderMapper.selectWaitSendGoodsOrderByUserId(userId);
    }

    @Override
    public List<Order> selectWaitGetGoodsOrderByUserId(int userId) {
        return orderMapper.selectWaitGetGoodsOrderByUserId(userId);
    }

    @Override
    public List<Order> selectWaitCommentOrderByUserId(int userId) {
        return orderMapper.selectWaitCommentOrderByUserId(userId);
    }

    @Override
    public void orderinsertto(int userId, int orderNum) {
        orderMapper.inserttoorder(userId,orderNum);
    }

    @Override
    public int orderselectto(int orderNum) {
        return orderMapper.selecttoorder(orderNum);
    }

    @Override
    public void orderdetailinsertto(int orderId, int goodsId, int ordergoodsnum) {
      orderMapper.inserttoorderdetail(orderId,goodsId,ordergoodsnum);
    }

    @Override
    public List<Integer> numofcartselect(int userId, int goodsId) {
        return orderMapper.selectnumofcart(userId,goodsId);
    }

    @Override
    public void numofcartupdate(int userId, int goodsId, int ordergoodsnum) {
     orderMapper.updatenumofcart(userId,goodsId,ordergoodsnum);
    }

    @Override
    public void ofcartdelete(int userId, int goodsId) {
   orderMapper.deleteofcart(userId,goodsId);
    }

    @Override
    public int selectaddressId(int userId, int orderId) {
        return orderMapper.selectaddressId(userId,orderId);
    }

    @Override
    public Address getaddress(int addressid) {
        return orderMapper.getaddress(addressid);
    }

    @Override
    public void orderset(int orderId) {
        orderMapper.orderset(orderId);
    }

    @Override
    public void goodsbuy(int userId, int orderId, Date goodsbuydate) {
        orderMapper.goodsbuy(userId,orderId,goodsbuydate);
    }

    @Override
    public void goodsupdate(int orderId) {
        orderMapper.goodsupdate(orderId);
    }

    @Override
    public List<Integer> goodsinit(int orderId) {
        return orderMapper.goodsinit(orderId);
    }

    @Override
    public void userinit(int sum, int userId) {
       orderMapper.userinit(sum,userId);
    }

    @Override
    public void orderdel(int orderId) {
        orderMapper.orderdel(orderId);
    }

    @Override
    public void ordermarkupdate(Integer ordermark, int orderid) {
        orderMapper.ordermarkupdate(ordermark,orderid);
    }

    @Override
    public void uservip(int userId) {
        orderMapper.uservip(userId);
    }



    @Override
    public int getgoodsint(int goodsid) {
        return orderMapper.getgoodsint(goodsid);
    }

    @Override
    public void insertmark(int userId, int orderNum, int ordermark, int addressId,Date goodsbuydate) {
        orderMapper.insertmark(userId,orderNum,ordermark,addressId,goodsbuydate);
    }

    @Override
    public int mraddressid(int userid) {
        return orderMapper.mraddressid(userid);
    }

    @Override
    public void usermarkupdate(int userinit, int userId) {
        orderMapper.usermarkupdate(userinit,userId);
    }

    @Override
    public void insertmarkbuy(int userId, int goodsId, int num, Date markdate, int marks) {
        orderMapper.insertmarkbuy(userId,goodsId,num,markdate,marks);
    }

    @Override
    public List<Integer> ordermarkgoodsid(int orderId) {
        return orderMapper.ordermarkgoodsid(orderId);
    }

    @Override
    public int ordermarkgoodsnum(int orderId, int goodsId) {
        return orderMapper.ordermarkgoodsnum(orderId,goodsId);
    }

    @Override
    public int ordermarkgoodsmark(int goodsId) {
        return orderMapper.ordermarkgoodsmark(goodsId);
    }

    @Override
    public void thismarkorder(int addressid, int ordermark, Date ordercreateTime, int orderid) {
        orderMapper.thismarkorder(addressid,ordermark,ordercreateTime,orderid);
    }

    @Override
    public int ordermarkgoodsint(int goodsId) {
        return orderMapper.ordermarkgoodsint(goodsId);
    }

    @Override
    public Integer getIsJY(Integer userId) {
        return orderMapper.selectIsJY(userId);
    }

}
