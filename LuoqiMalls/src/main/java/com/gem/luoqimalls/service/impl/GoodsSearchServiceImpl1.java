package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.GoodsSearchMapper1;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.GoodsSearch;
import com.gem.luoqimalls.service.GoodsSearchService1;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsSearchServiceImpl1 implements GoodsSearchService1{
    @Autowired
    private GoodsSearchMapper1 mapper1;
    @Override
    public PageInfo<Goods> getAllGoods(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countSelectAllGoods(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoods(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsOrderByAll(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countSelectAllGoods(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsOrderByAll(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsOrderByGoodsPrice(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countSelectAllGoods(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsOrderByGoodsPrice(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsOrderBygGoodsComment(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countSelectAllGoods(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsOrderByGCommentCount(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsOrderByGoodsCreateDate(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countSelectAllGoods(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsOrderByGoodsCreateDate(goodsSearch);
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
    public Integer getId_2ByBrandId(String zl) {
        return mapper1.selectId_2ByClassName2(zl);
    }

    @Override
    public String getBrandId(String b) {
        return mapper1.selectBrangId(b);
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1(goodsSearch);
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
    public Integer getId_2ByClassName2AndId_1(String className2, Integer id_1) {
        return mapper1.selectId_2ByClassName2AndId_1(className2, id_1);
    }

    @Override
    public PageInfo<Goods> getAllGoodsById_1OrderByAll(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1OrderByAll(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1OrderByGoodsPrice(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1OrderByGoodsPrice(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1OrderBygGoodsComment(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1OrderByGCommentCount(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1OrderByGoodsCreateDate(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsOrderByGoodsCreateDate(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndId_2(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndId_2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndId_2(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndId_2OrderByAll(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndId_2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndId_2OrderByAll(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndId_2OrderByGoodsPrice(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndId_2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndId_2OrderByGoodsPrice(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndId_2OrderBygGoodsComment(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndId_2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndId_2OrderByGCommentCount(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndId_2OrderByGoodsCreateDate(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndId_2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndId_2OrderByGoodsCreateDate(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndClassName2(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndClassName2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndClassName2(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndClassName2OrderByAll(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndClassName2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndClassName2OrderByAll(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndClassName2OrderByGoodsPrice(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndClassName2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndClassName2OrderByGoodsPrice(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndClassName2OrderBygGoodsComment(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndClassName2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndClassName2OrderByGCommentCount(goodsSearch);
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
    public PageInfo<Goods> getAllGoodsById_1AndClassName2OrderByGoodsCreateDate(GoodsSearch goodsSearch, Integer curPage) {
        int count =mapper1.countselectAllGoodsById_1AndClassName2(goodsSearch);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=mapper1.selectAllGoodsById_1AndClassName2OrderByGoodsCreateDate(goodsSearch);
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
