package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.CartMapper;
import com.gem.luoqimalls.mapper.UserMapper;
import com.gem.luoqimalls.pojo.Cart;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.CartService;
import com.gem.luoqimalls.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServieImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public Integer cartinsert(int userId, int goodsId)
    {
        return cartMapper.insertCart(userId,goodsId);
    }

    @Override
    public Cart cartselect(int userid, int goodsid) {
        return cartMapper.selecttCart(userid,goodsid);
    }

    @Override
    public Integer cartupdate(int userid, int goodsid) {
        return cartMapper.updateCart(userid,goodsid);
    }

    @Override
    public Integer cartupdatedown(int userid, int goodsid) {
        return cartMapper.updateCartdown(userid,goodsid);
    }

    @Override
    public List<Cart> getcartnum(int userid) {
        return cartMapper.CartGoodsNum(userid);
    }

    @Override
    public Integer deletecart(int userId, int goosId) {
   return cartMapper.cartdel(userId,goosId);
    }

    @Override
    public PageInfo<Goods> getcartgoods(int userId, Integer curPage) {
        return null;
    }

    @Override
    public Integer numselect(int userid, int goodsid) {
        return cartMapper.selectnum(userid,goodsid);
    }

//
//    @Override
//    public PageInfo<Goods> getcartgoods(int userId,Integer curPage)
//    {
//        int count =cartMapper.cartCount(userId);
////          拦截添加分页
//        if(curPage==null){
//            curPage=1;
//        }
//        PageHelper.startPage(curPage,12);
//        List<Goods> goods=cartMapper.selectCartGoods(userId);
//        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
//        //当前页
//        pageInfo.setPageNum(curPage);
//        //每页显示的条数
//        pageInfo.setPageSize(12);
//        //总条数
//        pageInfo.setTotal(count);
//        return  pageInfo;
//    }


}
