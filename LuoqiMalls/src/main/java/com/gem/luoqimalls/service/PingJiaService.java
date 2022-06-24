package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Evaluate;
import com.gem.luoqimalls.pojo.OrderDetails;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface PingJiaService {
    PageInfo<Evaluate> getAllEvaluateByGoodsId(Integer goodsId,Integer curPage);
    PageInfo<Evaluate> getAllGoodsEvaluateByGoodsId(Integer goodsId,Integer curPage);
    PageInfo<Evaluate>getAllBadEvaluateByGoodsId(Integer goodsId,Integer curPage);
    boolean updateStateShouHuo(Integer orderId);
    List<OrderDetails> getAllOrderDetails(Integer orderId);
    int getUserIdByOrderId(Integer orderId);
    boolean updateStateByOrderId(Integer orderId);
    int getOrderNumInCommentByOrderId(Integer orderId);
    boolean addEvaluate(Evaluate evaluate);
    boolean updateIsEvaluateToZero(Integer orderDetailId);
    Integer getorderDetailIdByOrderIdAndGoodsId(Integer orderId,Integer goodsId);
    PageInfo<Evaluate> getAllEvaluateByUserId(Integer userId,Integer curPage);
    PageInfo<Evaluate> getAllEvaluateByUserIdReplyIsNull(Integer userId,Integer curPage);
    boolean updateReview(String review,Integer evaluateId);
}
