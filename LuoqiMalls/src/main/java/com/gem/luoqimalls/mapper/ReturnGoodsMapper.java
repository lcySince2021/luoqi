package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Order;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ReturnGoodsMapper {
    @Select("select * from `order` where userId=#{param1} and orderState=#{param2}")
    List<Order> selectOrderListWhereWaitCommentByUserId(int userId,String orderState);

    @Update("update `order` set orderState=#{param1} where orderId=#{param2}")
    Integer updateOrderStateByOrderId(String orderState,int orderId);


}
