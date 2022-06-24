package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PingJiaMapper {
    @Select("select * from user where userId=#{param1}")
    User selectByUserId(Integer userId);

    List<Evaluate> selectAllEvaluate(Integer goodsId);
    @Select("select count(*) from evaluate where goodsId=#{param1}")
    int countSelectAllEvaluate(Integer goodsId);
    @Select("select * from evaluate where isGood=0 and goodsId=#{param1}")
    @Results({
            @Result(id = true,column = "evaluateId",property = "evaluateId"),
            //一对一关系
            @Result(column = "userId",property = "user",
                    one=@One(select = "com.gem.luoqimalls.mapper.PingJiaMapper.selectByUserId")
            ),
            @Result(column = "evaluateText",property = "evaluateText"),
            @Result(column = "review",property = "review"),
            @Result(column = "reply",property = "reply"),
            @Result(column = "pjTime",property = "pjTime"),
    })
    List<Evaluate> selectAllGoodsEvalute(Integer goodsId);
    @Select("select count(*) from evaluate where isGood=0 and goodsId=#{param1}")
    int countSelectAllGoodsEvalute(Integer goodsId);
    @Select("select * from evaluate where isGood=1 and goodsId=#{param1}")
    @Results({
            @Result(id = true,column = "evaluateId",property = "evaluateId"),
            //一对一关系
            @Result(column = "userId",property = "user",
                    one=@One(select = "com.gem.luoqimalls.mapper.PingJiaMapper.selectByUserId")
            ),
            @Result(column = "evaluateText",property = "evaluateText"),
            @Result(column = "review",property = "review"),
            @Result(column = "reply",property = "reply"),
            @Result(column = "pjTime",property = "pjTime"),
    })
    List<Evaluate> selectAllBadEvalute(Integer goodsId);
    @Select("select count(*) from evaluate where isGood=1 and goodsId=#{param1}")
    int countSelectAllBadEvalute(Integer goodsId);
    boolean updateStateShouHuo(Integer orderId);
    @Select("select * from goods where goodsId=#{param1}")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.PingJiaMapper.selectPicIdInOrder")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    Goods selectAllGoodsByGoodsInOrder(Integer goodsId);
    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPicIdInOrder(Integer goodsPicId);
    @Select("select * from orderdetails where orderId=#{param1} and isEvaluate=1")
    @Results({
            @Result(id = true,column = "orderDetailId",property = "orderDetailId"),
            //一对一关系
            @Result(column = "goodsId",property = "goods",
                    one=@One(select = "com.gem.luoqimalls.mapper.PingJiaMapper.selectAllGoodsByGoodsInOrder")
            ),
            @Result(column = "orderGoodsNum",property = "orderGoodsNum"),
            @Result(column = "orderId",property = "orderId"),
    })
    List<OrderDetails> selectAllOrders(Integer orderId);
    @Select("select userId from `order` where orderId=#{param1}")
    int selectUserIdByOrderId(Integer orderId);
    @Select("select orderNum from `order` where orderId=#{param1}")
    int selectOrderNumByOrderNum(Integer orderId);
    boolean updateStateByOrderId(Integer orderId);
    boolean insertEvaluateId(Evaluate evaluate);
    boolean updateIsEvaluateByOrderDetailId(Integer orderDetailId);
    Integer selectorderDetailIdByOrderIdAndGoodsId(Integer orderId,Integer goodsId);
    @Select("select * from evaluate where userId=#{param1}")
    @Results({
            @Result(id = true,column = "evaluateId",property = "evaluateId"),
            //一对一关系
            @Result(column = "goodsId",property = "goods",
                    one=@One(select = "com.gem.luoqimalls.mapper.PingJiaMapper.selectAllGoodsByGoodsInOrder")
            ),
            @Result(column = "evaluateText",property = "evaluateText"),
            @Result(column = "review",property = "review"),
            @Result(column = "reply",property = "reply"),
            @Result(column = "userId",property = "userId"),
    })
    List<Evaluate> selectAllByUserId(Integer userId);
    @Select("select count(*) from evaluate where userId=#{param1}")
     int countselectAllByUserId(Integer userId);
    @Select("select * from evaluate where userId=#{param1} and review is null")
    @Results({
            @Result(id = true,column = "evaluateId",property = "evaluateId"),
            //一对一关系
            @Result(column = "goodsId",property = "goods",
                    one=@One(select = "com.gem.luoqimalls.mapper.PingJiaMapper.selectAllGoodsByGoodsInOrder")
            ),
            @Result(column = "evaluateText",property = "evaluateText"),
            @Result(column = "review",property = "review"),
            @Result(column = "reply",property = "reply"),
            @Result(column = "pjTime",property = "pjTime"),
    })
    List<Evaluate> selectAllByUserIdIsNotNull(Integer userId);
    @Select("select count(*) from evaluate where userId=#{param1} and review is null")
    int countselectAllByUserIdIsNotNull(Integer userId);
    @Update("update evaluate set review=#{param1} where evaluateId=#{param2}")
    boolean updateReview(String review,Integer evaluateId);   //追评
}
