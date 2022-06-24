package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.GoodsIntegerMapper;
import com.gem.luoqimalls.mapper.GoodsSearchMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.service.GoodsIntegerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsIntegerServiceImpl implements GoodsIntegerService {
    @Autowired
    private GoodsIntegerMapper integerMapper;
    @Override
    public PageInfo<Goods> getAllIntegerGoods(Integer curPage) {
        int count =integerMapper.selectIntegerCount();
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,16);
        List<Goods> goods=integerMapper.selectAllIntegerGoods();
        PageInfo<Goods> pageInfo=new PageInfo<>(goods);
        //当前页
        pageInfo.setPageNum(curPage);
        //每页显示的条数
        pageInfo.setPageSize(16);
        //总条数
        pageInfo.setTotal(count);
        return  pageInfo;
    }

    @Override
    public PageInfo<Goods> getAllIntegerGoodsbyName(String name, Integer curPage) {
        return null;
    }

    @Override
    public PageInfo<Goods> getAllIntegerGoodsbyAll(String name, int num1, int num2, Integer curPage) {
        int count =integerMapper.selectIntegerCountByAll(name,num1,num2);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=integerMapper.selectAllIntegerGoodsforAll(name,num1,num2);
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
    public PageInfo<Goods> selectonlyname(String name, Integer curPage) {
        int count =integerMapper.selectnumonlyname(name);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=integerMapper.selectonlyname(name);
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
    public PageInfo<Goods> selectonlynum(int num1, int num2, Integer curPage) {
        int count =integerMapper.selectnumonlynum(num1,num2);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=integerMapper.selectonlynum(num1,num2);
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
    public PageInfo<Goods> selectonlynum1(int num1, Integer curPage) {
        int count =integerMapper.selectnumonlynum1(num1);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=integerMapper.selectonlynum1(num1);
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
    public PageInfo<Goods> selectonlynum2(int num2, Integer curPage) {
        int count =integerMapper.selectnumonlynum2(num2);
//          拦截添加分页
        if(curPage==null){
            curPage=1;
        }
        PageHelper.startPage(curPage,12);
        List<Goods> goods=integerMapper.selectonlynum2(num2);
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
