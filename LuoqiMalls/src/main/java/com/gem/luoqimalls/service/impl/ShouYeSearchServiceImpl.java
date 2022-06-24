package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.ShouYeSearchMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.service.ShouYeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShouYeSearchServiceImpl implements ShouYeSearchService{
    @Autowired
    private ShouYeSearchMapper shouYeSearchMapper;

    @Override
    public List<Goods> selectGoodsLimit4() {
        return shouYeSearchMapper.selectGoodsLimit4();
    }
}
