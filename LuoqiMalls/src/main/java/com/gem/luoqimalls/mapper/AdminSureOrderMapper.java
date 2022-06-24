package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Address;
import com.gem.luoqimalls.pojo.Order;
import com.gem.luoqimalls.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminSureOrderMapper {

    @Select("select * from `order` where orderState = #{param1}")
    List<Order> selectAllWaitSendGoodsOrder(String orderState);
    @Select("select * from user where userId=#{userId}")
    User selectUserByUserId(int userId);
    @Select("select * from address where addressId=#{param1}")
    Address selectAddressByAddressId(int addressId);
    @Update("update `order` set orderState=#{orderState} where orderId=#{orderId}")
    int updateAdminSureSendGoodsByOrderId(@Param("orderState")String orderState, @Param("orderId")int orderId);

    @Select("select * from `order` where orderState=#{param1}")
    List<Order> selectReturnGoods(String orderState);



}
