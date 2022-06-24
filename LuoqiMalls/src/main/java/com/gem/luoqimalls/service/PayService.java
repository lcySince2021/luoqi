package com.gem.luoqimalls.service;


import com.gem.luoqimalls.pojo.*;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface PayService {
int userIdselectByid(int ordernum);
    List<OrderDetails> selectOrderDetailsByOrderId(int orderId);
//    默认地址
    Address selectAddressByUserId(int userId);
    List<Address> selectAllAddressByUserId(int userId);
    List<Integer> selectvolumeid(int userId);
    Volume selectvolume(int volumeid);
//    减少优惠卷
void deletevolume(int userId,int volumeId);
//    订单添加地址

    void  ordersetaddress(int AddressId,int userId,int orderId,int volumeid);
    Order OrderByOrderId(int orderId);

    int thisgoodsid(int orderId);
    int thisordernum(int orderId);
    int thisgoodsint(int goodsId);
}
