package com.gem.luoqimalls.service;


import com.gem.luoqimalls.pojo.Cart;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CartService {

//购物车添加商品
     Integer cartinsert(int userId,int goodsId);
//购物车内商品是否已有
Cart cartselect(int userid, int goodsid);
//     商品已有，则数量加1
Integer cartupdate(int userid,int goodsid);//
    //  数量减一
Integer cartupdatedown(int userid,int goodsid);
//购物车内商品数量
     List<Cart> getcartnum(int userid);
//删除购物车内物品
    Integer deletecart(int userId,int goosId);

//     查看购物车商品
     PageInfo<Goods> getcartgoods(int userId, Integer curPage);

    Integer numselect(int userid,int goodsid);
}
