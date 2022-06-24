package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.PingJiaMapper;
import com.gem.luoqimalls.pojo.Evaluate;
import com.gem.luoqimalls.pojo.OrderDetails;
import com.gem.luoqimalls.service.PingJiaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PingJiaServiceImpl implements PingJiaService{
    @Autowired
    private PingJiaMapper mapper;
    @Override
    public PageInfo<Evaluate> getAllEvaluateByGoodsId(Integer goodsId,Integer curPage) {
        int count =mapper.countSelectAllEvaluate(goodsId);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,6);
        List<Evaluate> evaluates=mapper.selectAllEvaluate(goodsId);
        PageInfo<Evaluate> pageInfo=new PageInfo<>(evaluates);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(6);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Evaluate> getAllGoodsEvaluateByGoodsId(Integer goodsId,Integer curPage) {
        int count =mapper.countSelectAllGoodsEvalute(goodsId);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,6);
        List<Evaluate> evaluates=mapper.selectAllGoodsEvalute(goodsId);
        PageInfo<Evaluate> pageInfo=new PageInfo<>(evaluates);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(6);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Evaluate> getAllBadEvaluateByGoodsId(Integer goodsId,Integer curPage) {
        int count =mapper.countSelectAllBadEvalute(goodsId);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,6);
        List<Evaluate> evaluates=mapper.selectAllBadEvalute(goodsId);
        PageInfo<Evaluate> pageInfo=new PageInfo<>(evaluates);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(6);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public boolean updateReview(String review, Integer evaluateId) {
        return mapper.updateReview(review, evaluateId);
    }

    @Override
    public boolean updateStateShouHuo(Integer orderId) {
        return mapper.updateStateShouHuo(orderId);
    }

    @Override
    public List<OrderDetails> getAllOrderDetails(Integer orderId) {
        return mapper.selectAllOrders(orderId);
    }

    @Override
    public int getUserIdByOrderId(Integer orderId) {
        return mapper.selectUserIdByOrderId(orderId);
    }

    @Override
    public boolean updateStateByOrderId(Integer orderId) {
        return mapper.updateStateByOrderId(orderId);
    }

    @Override
    public int getOrderNumInCommentByOrderId(Integer orderId) {
        return mapper.selectOrderNumByOrderNum(orderId);
    }

    @Override
    public boolean addEvaluate(Evaluate evaluate) {
        return mapper.insertEvaluateId(evaluate);
    }

    @Override
    public boolean updateIsEvaluateToZero(Integer orderDetailId) {
        return mapper.updateIsEvaluateByOrderDetailId(orderDetailId);
    }

    @Override
    public Integer getorderDetailIdByOrderIdAndGoodsId(Integer orderId, Integer goodsId) {
        return mapper.selectorderDetailIdByOrderIdAndGoodsId(orderId, goodsId);
    }


    @Override
    public PageInfo<Evaluate> getAllEvaluateByUserId(Integer userId,Integer curPage) {
        int count =mapper.countselectAllByUserId(userId);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,6);
        List<Evaluate> evaluates=mapper.selectAllByUserId(userId);
        PageInfo<Evaluate> pageInfo=new PageInfo<>(evaluates);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(6);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Evaluate> getAllEvaluateByUserIdReplyIsNull(Integer userId,Integer curPage) {
        int count =mapper.countselectAllByUserIdIsNotNull(userId);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,6);
        List<Evaluate> evaluates=mapper.selectAllByUserIdIsNotNull(userId);
        PageInfo<Evaluate> pageInfo=new PageInfo<>(evaluates);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(6);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }
}
