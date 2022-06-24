package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.DuoMaiMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.service.DuoMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuoMaiServiceImpl implements DuoMaiService{

    @Autowired
    private DuoMaiMapper duoMaiMapper;

    @Override
    public Goods selectBy67() {
        return duoMaiMapper.selectBy67();
    }

    @Override
    public Goods selectBy58() {
        return duoMaiMapper.selectBy58();
    }

    @Override
    public Goods selectBy127() {
        return duoMaiMapper.selectBy127();
    }

    @Override
    public Goods selectBy139() {
        return duoMaiMapper.selectBy139();
    }

    @Override
    public Goods selectBy150() {
        return duoMaiMapper.selectBy150();
    }

    @Override
    public Goods selectBy189() {
        return duoMaiMapper.selectBy189();
    }

    @Override
    public Goods selectBy78() {
        return duoMaiMapper.selectBy78();
    }

    @Override
    public Goods selectBy15() {
        return duoMaiMapper.selectBy15();
    }

    @Override
    public Goods selectBy46() {
        return duoMaiMapper.selectBy46();
    }
}
