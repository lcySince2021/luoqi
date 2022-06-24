package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Order;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BillMapper {
    @Select("select * from  `order` where orderState!=#{param1} and userId=#{param2}")
    List<Order> selectOrderExpectWaitPay(String orderState,int userId);




}
