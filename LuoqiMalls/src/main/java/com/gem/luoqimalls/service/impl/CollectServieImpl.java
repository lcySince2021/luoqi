package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.CartMapper;
import com.gem.luoqimalls.mapper.CollectMapper;
import com.gem.luoqimalls.pojo.Cart;
import com.gem.luoqimalls.pojo.Collect;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.service.CartService;
import com.gem.luoqimalls.service.CollectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CollectServieImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;


    @Override
    public Integer collectinsert(int userId, int goodsId, Date collectDate) {
        return collectMapper.insertCollet(userId,goodsId,collectDate);
    }

    @Override
    public Collect collectselect(int userid, int goodsid) {
        return collectMapper.selecttCollet(userid,goodsid);
    }

    @Override
    public PageInfo<Collect> getCollectgoods(int userId, Integer curPage) {
        int count =collectMapper.collectGoodsCount(userId);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Collect> collects=collectMapper.collectGoodsGet(userId);
//        List<Goods> goods=mapper.selectAllGoodsByKey(Key);
        PageInfo<Collect> pageInfo=new PageInfo<>(collects);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
//        return null;
    }

    @Override
    public Integer delcollect(int userId, int goodsId) {
        return collectMapper.collectdel(userId,goodsId);
    }
}
