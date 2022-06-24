package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.CollectMapper;
import com.gem.luoqimalls.mapper.FootMapper;
import com.gem.luoqimalls.pojo.Collect;
import com.gem.luoqimalls.pojo.Myfoot;
import com.gem.luoqimalls.service.CollectService;
import com.gem.luoqimalls.service.FootService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FootServieImpl implements FootService{
    @Autowired
    private FootMapper footMapper;

    @Override
    public Integer footinsert(int userId, int goodsId, Date footdate) {
        return footMapper.insertFoot(userId,goodsId,footdate);
    }

    @Override
    public Myfoot footselect(int userId, int goodsId) {
        return footMapper.selectFoot(userId,goodsId);
    }

    @Override
    public Integer footupdate(int userId, int goodsId, Date footdate) {
        return footMapper.updateFoot(userId,goodsId,footdate);
    }

    @Override
    public List<Myfoot> getfoot(int userId) {
        return footMapper.footget(userId);
    }
}
