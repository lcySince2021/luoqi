package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.*;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AdminService {
    PageInfo<Goods> getAllGoods(Integer curPage);
    boolean updateHuoDong(Goods goods);
    boolean updateIsShelf(Integer goodsId,Integer goodsShlef);
    List<GoodsClass1> getAllGoodsClass1();
    List<GoodsClass2> getAllGoodsClass2();
    boolean addAllImage(Image image);
    boolean addAllGoods(Goods goods);
    Integer getGoodsPicIdByGoodsPicMaster(String goodsPicMaster);
    Goods getAllGoodsByGoodsId(Integer goodsId);
    boolean updateImage(Image image);
    boolean updateGoods(Goods goods);
    PageInfo<Goods> getGoodsByKey(Integer curPage,String key);
    PageInfo<User> getAllUser(Integer curPage);
    boolean updateUserVip(Integer goodId,Integer userVip);
    User getAllUserById(Integer id);
    PageInfo<Volume> getAllVolume(Integer curPage);
    Volume getVolumeById(Integer id);
    boolean updateImageById(Integer id,String pic);
    boolean updateVolume(Volume volume);
    boolean delVolumeById(Integer volumeId);
    String[] getvolumeclass();
    boolean addVolume(Volume volume);
    List<Address> getAllAddress(Integer userId);

    int selectimgid(String key);
    void insertimage();
    void insertimage1(String key,int goodspicid);
    void insertimage2(String key,int goodspicid);
    void insertimage3(String key,int goodspicid);
    void insertimage4(String key,int goodspicid);
    void insertimages(String key);
    int newpicid();
    void  newuserpicid(int goodspicId,int goodsId);



    List<Evaluate> selectAllEvaluate();


    int deleteEvaluateByEvaluateId(int evaluateId);


    Evaluate selectEvaluateById(int evaluateId);


    Integer updateReply(String reply, int evaluateId);
    boolean updateJYByUserId(Integer userId,Integer isJY);

    Admin selectAdmin(String adminId,String adminPwd);
    int selectAdminNum(String adminId,String adminPwd);
    void insertimage0(String key,int goodspicid);
}
