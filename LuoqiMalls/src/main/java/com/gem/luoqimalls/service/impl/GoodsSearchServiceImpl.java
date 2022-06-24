package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.GoodsSearchMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsSearchServiceImpl implements GoodsSearchService{
@Autowired
private GoodsSearchMapper mapper;

    @Override
    public PageInfo<Goods> getAllGoodsByKey(String Key,Integer curPage) {
        int count =mapper.selectCount(Key);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodsByKey(Key);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public Goods getGoodsById(int goodsId) {
        return mapper.selectGoodsById(goodsId);
    }

    @Override
    public String[] getBrandId() {
        return mapper.selectBrandId();
    }

    @Override
    public Integer getId_1ByClassName1(String p) {
        return mapper.selectId_1ByClassName1(p);
    }



    @Override
    public PageInfo<Goods> getAllGoodsById_1(Integer id_1,Integer curPage) {
        int count =mapper.countById_1(id_1);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1(id_1);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public Integer getId_2ByClassName2(String s,Integer id_1) {
        return mapper.selectId_2ByClassName2(s,id_1);
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndId_2(Integer id_1, Integer id_2, Integer curPage) {
        int count =mapper.countById_1AndId_2(id_1,id_2);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndId_2(id_1,id_2);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndBrandId(Integer id_1,Integer curPage, String ss) {
        int count =mapper.countById_1AndBrandId(id_1,ss);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndBrandId(id_1, ss);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public List<Goods> getGoodsRandom() {
        return mapper.selectGoodsRandom();
    }

    @Override
    public PageInfo<Goods> getAllGoodsByKeyOrderByPrice(String Key, Integer curPage) {
        int count =mapper.selectCount(Key);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodsByKeyOrderByPrice(Key);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsByKeyOrderByGCommentCount(String Key, Integer curPage) {
        int count =mapper.selectCount(Key);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodsByKeyOrderByGCommentCount(Key);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsByKeyOrderByGoodsCreateDate(String Key, Integer curPage) {
        int count =mapper.selectCount(Key);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodsByKeyOrderByGoodsCreateDate(Key);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1OrderByPrice(Integer id_1, Integer curPage) {
        int count =mapper.countById_1(id_1);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1OrderByPrice(id_1);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1OrderByGCommentCount(Integer id_1, Integer curPage) {
        int count =mapper.countById_1(id_1);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1OrderByGCommentCount(id_1);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1OrderByGoodsCreateDate(Integer id_1, Integer curPage) {
        int count =mapper.countById_1(id_1);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1OrderByGoodsCreateDate(id_1);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndId_2OrderByPrice(Integer id_1, Integer id_2, Integer curPage) {
        int count =mapper.countById_1AndId_2(id_1,id_2);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndId_2OrderByPrice(id_1, id_2);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndId_2OrderByGCommentCount(Integer id_1, Integer id_2, Integer curPage) {
        int count =mapper.countById_1AndId_2(id_1,id_2);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndId_2OrderByGCommentCount(id_1, id_2);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndId_2OrderByGoodsCreateDate(Integer id_1, Integer id_2, Integer curPage) {
        int count =mapper.countById_1AndId_2(id_1,id_2);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndId_2OrderByGoodsCreateDate(id_1, id_2);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndBrandIdOrderByPrice(Integer id_1, Integer curPage, String ss) {
        int count =mapper.countById_1AndBrandId(id_1,ss);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndBrandIdOrderByPrice(id_1, ss);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndBrandIdOrderByGCommentCount(Integer id_1, Integer curPage, String ss) {
        int count =mapper.countById_1AndBrandId(id_1,ss);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndBrandIdOrderByGCommentCount(id_1, ss);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndBrandIdOrderByGoodsCreateDate(Integer id_1, Integer curPage, String ss) {
        int count =mapper.countById_1AndBrandId(id_1,ss);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndBrandIdOrderByGoodsCreateDate(id_1, ss);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public String[] getClassName2() {
        return mapper.selectClassName2();
    }

    @Override
    public PageInfo<Goods> getAllGoodsByKeyOrderByAll(String Key, Integer curPage) {
        int count =mapper.selectCount(Key);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodsByKeyOrderByAll(Key);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1OrderByAll(Integer id_1, Integer curPage) {
        int count =mapper.countById_1(id_1);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1OrderByAll(id_1);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndId_2OrderByAll(Integer id_1, Integer id_2, Integer curPage) {
        int count =mapper.countById_1AndId_2(id_1,id_2);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndId_2OrderByAll(id_1, id_2);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1AndBrandIdOrderByAll(Integer id_1, Integer curPage, String ss) {
        int count =mapper.countById_1AndBrandId(id_1,ss);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodSById_1AndBrandIdOrderByAll(id_1, ss);
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public String[] getBrandIdById_1(Integer id_1) {
        return mapper.selectBrandIdById_1(id_1);
    }

    @Override
    public String[] getClassName2ById_1(Integer id_1) {
        return mapper.selectClassName2ById_1(id_1);
    }

    @Override
    public String[] getBrandIdById_1AndId_2(Integer id_1, Integer id_2) {
        return mapper.selectBrandIdById_1AndId_2(id_1, id_2);
    }

    @Override
    public Integer getId_1BygoodsId(Integer id_1) {
        return mapper.selectId_1ByGoodsId(id_1);
    }

    @Override
    public Integer getId_2BygoodsId(Integer id_2) {
        return mapper.selectId_2ByGoodsId(id_2);
    }

    @Override
    public List<Goods> getLikeGoodsById_1(Integer id_1) {
        return mapper.selectLikeGoodsLikeId_1(id_1);
    }

    @Override
    public List<Goods> getLikeGoodsById_2(Integer id_2) {
        return mapper.selectLikeGoodsLikeId_2(id_2);
    }

    @Override
    public String getClassName1Byid(Integer id_1) {
        return mapper.selectClassName1Byid(id_1);
    }

    @Override
    public String getClassName2Byid(Integer id_2) {
        return mapper.selectClassName2Byid(id_2);
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_2(Integer curPage) {
        int count =mapper.countselectAllGoodsById_2();
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodsById_2();
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllGoodsorderByTime(Integer curPage) {
        int count =mapper.countselectAllGoodsOrderByTimeDes();
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper.selectAllGoodsOrderByTimeDes();
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(12);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

}
