package com.gem.luoqimalls.service;


import com.gem.luoqimalls.pojo.Collect;
import com.gem.luoqimalls.pojo.Myfoot;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

public interface FootService {

//足迹表添加商品
     Integer footinsert(int userId, int goodsId, Date footdate);
//足迹表内商品是否已有
Myfoot footselect(int userId, int goodsId);
//足迹更新
     Integer  footupdate(int userId, int goodsId, Date footdate);
//     展示
List<Myfoot> getfoot(int userId);


}
