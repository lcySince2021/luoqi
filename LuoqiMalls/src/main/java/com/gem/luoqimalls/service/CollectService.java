package com.gem.luoqimalls.service;


import com.gem.luoqimalls.pojo.Cart;
import com.gem.luoqimalls.pojo.Collect;
import com.gem.luoqimalls.pojo.Goods;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

public interface CollectService {

//收藏表添加商品
     Integer collectinsert(int userId, int goodsId,Date collectDate);
//收藏表内商品是否已有
Collect collectselect(int userid, int goodsid);

     PageInfo<Collect> getCollectgoods(int userId, Integer curPage);

     Integer delcollect(int userId, int goodsId);
}
