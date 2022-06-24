package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.AdminMapper;
import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.AdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminMapper mapper;
    @Override
    public PageInfo<Goods> getAllGoods(Integer curPage) {
        int count =mapper.countBySelectAllGoods();
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,20);
        List<Goods> goods=mapper.selectAllGoods();
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(20);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public boolean updateHuoDong(Goods goods) {
        return mapper.updateHuoDong(goods);
    }

    @Override
    public boolean updateIsShelf(Integer goodsId, Integer goodsShlef) {
        return mapper.updateIsShelf(goodsId, goodsShlef);
    }

    @Override
    public List<GoodsClass1> getAllGoodsClass1() {
        return mapper.selectAllClassName1();
    }

    @Override
    public List<GoodsClass2> getAllGoodsClass2() {
        return mapper.selectAllClassName2();
    }

    @Override
    public boolean addAllImage(Image image) {
        return mapper.insertImage(image);
    }

    @Override
    public boolean addAllGoods(Goods goods) {
        return mapper.insertGoods(goods);
    }

    @Override
    public Integer getGoodsPicIdByGoodsPicMaster(String goodsPicMaster) {
        return mapper.selectGoodsPicIdBygoodsPicMaster(goodsPicMaster);
    }

    @Override
    public Goods getAllGoodsByGoodsId(Integer goodsId) {
        return mapper.selectAllByGoodsId(goodsId);
    }

    @Override
    public boolean updateImage(Image image) {
        return mapper.updateImage(image);
    }

    @Override
    public boolean updateGoods(Goods goods) {
        return mapper.updateGoods(goods);
    }

    @Override
    public PageInfo<Goods> getGoodsByKey(Integer curPage, String key) {
        int count =mapper.countselectByKey(key);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,15);
        List<Goods> goods=mapper.selectByKey(key);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(15);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<User> getAllUser(Integer curPage) {
        int count =mapper.countUser();
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,15);
        List<User> user=mapper.selectAllUser();
        PageInfo<User> pageInfo=new PageInfo<>(user);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(15);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public boolean updateUserVip(Integer goodId, Integer userVip) {
        return mapper.updateUserVip(goodId,userVip);
    }

    @Override
    public User getAllUserById(Integer id) {
        return mapper.selectAllUserByUserId(id);
    }

    @Override
    public PageInfo<Volume> getAllVolume(Integer curPage) {
        int count =mapper.countSelectVolume();
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,15);
        List<Volume> volumes=mapper.selectAllVolume();
        PageInfo<Volume> pageInfo=new PageInfo<>(volumes);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(15);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public Volume getVolumeById(Integer id) {
        return mapper.selectAllVolumeById(id);
    }

    @Override
    public boolean updateImageById(Integer id,String pic) {
        return mapper.updateImageById(id,pic);
    }

    @Override
    public boolean updateVolume(Volume volume) {
        return mapper.updateVolume(volume);
    }

    @Override
    public boolean delVolumeById(Integer volumeId) {
        return mapper.deleteVolumeById(volumeId);
    }

    @Override
    public String[] getvolumeclass() {
        return mapper.selectVolumeClass();
    }

    @Override
    public boolean addVolume(Volume volume) {
        return mapper.insertAllVolume(volume);
    }

    @Override
    public List<Address> getAllAddress(Integer userId) {
        return mapper.selectAddressByUserId(userId);
    }

    @Override
    public int selectimgid(String key) {
        return mapper.selectimgid(key);
    }

    @Override
    public void insertimage() {
mapper.insertimage();
    }

    @Override
    public void insertimage1(String key, int goodspicid) {
        mapper.insertimage1(key,goodspicid);
    }

    @Override
    public void insertimage2(String key, int goodspicid) {
mapper.insertimage2(key,goodspicid);
    }

    @Override
    public void insertimage3(String key, int goodspicid) {
mapper.insertimage3(key,goodspicid);
    }

    @Override
    public void insertimage4(String key, int goodspicid) {
mapper.insertimage4(key,goodspicid);
    }

    @Override
    public void insertimages(String key) {
        mapper.insertimages(key);
    }

    @Override
    public int newpicid() {
        return mapper.newpicid();
    }

    @Override
    public void newuserpicid(int goodspicId, int goodsId) {
       mapper.newuserpicid(goodspicId,goodsId);
    }

    @Override
    public List<Evaluate> selectAllEvaluate() {
        return mapper.selectAllEvaluate();
    }

    @Override
    public int deleteEvaluateByEvaluateId(int evaluateId) {
        return mapper.deleteEvaluateByEvaluateId(evaluateId);
    }

    @Override
    public Evaluate selectEvaluateById(int evaluateId) {
        return mapper.selectEvaluateById(evaluateId);
    }

    @Override
    public Integer updateReply(String reply, int evaluateId) {
        return mapper.updateReply(reply,evaluateId);
    }

    @Override
    public boolean updateJYByUserId(Integer userId, Integer isJY) {
        return mapper.updateJYByUserId(userId, isJY);
    }
    @Override
    public Admin selectAdmin(String adminId, String adminPwd) {
        return mapper.selectByUnameAndPwd(adminId,adminPwd);
    }

    @Override
    public int selectAdminNum(String adminId, String adminPwd) {
        return mapper.selectByUnameAndPwds(adminId,adminPwd);
    }

    @Override
    public void insertimage0(String key, int goodspicid) {
        mapper.insertimage0(key,goodspicid);

    }


}
