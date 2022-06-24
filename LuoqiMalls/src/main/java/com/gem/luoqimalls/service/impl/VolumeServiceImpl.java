package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.VolumeMapper;
import com.gem.luoqimalls.pojo.MyVolume;
import com.gem.luoqimalls.pojo.Volume;
import com.gem.luoqimalls.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolumeServiceImpl implements VolumeService{
    @Autowired
    private VolumeMapper volumeMapper;

    @Override
    public List<Volume> selectAllVolume() {
        return volumeMapper.selectVolume();
    }

    @Override
    public List<Volume> selectFuZhuan() {
        return volumeMapper.selectVolumeFuZhuan();
    }

    @Override
    public List<Volume> selectXiangBao() {
        return volumeMapper.selectVolumeXiangBao();
    }

    @Override
    public List<Volume> selectPeiShi() {
        return volumeMapper.selectVolumePeiShi();
    }

    @Override
    public List<MyVolume> addMyVolume(int volumeId, int userId) {
        return volumeMapper.addMyVolume(volumeId,userId);
    }

    @Override
    public MyVolume selectMyVolune(int volumeId, int userId) {
        return volumeMapper.selectMyVolume(volumeId,userId);
    }

//    @Override
//    public List<MyVolume> personSelectMyVolume(int userId) {
//        return volumeMapper.personSelectMyVolume(userId);
//    }

    @Override
    public List<MyVolume> selectMyVolumeByUserId(int uerId) {
        return volumeMapper.selectMyVolumeByUserId(uerId);
    }

    @Override
    public List<Volume> selectVolumeByVolumeId(int volumeId) {
        return volumeMapper.selectVolumeByVolumeId(volumeId);
    }

    @Override
    public List<Volume> mainSelectVolumeLimit3() {
        return volumeMapper.mainSelectVolumeLimit3();
    }

}
