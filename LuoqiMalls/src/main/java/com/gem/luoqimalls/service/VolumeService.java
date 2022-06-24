package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.MyVolume;
import com.gem.luoqimalls.pojo.Volume;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VolumeService {
    List<Volume> selectAllVolume();
    List<Volume> selectFuZhuan();
    List<Volume> selectXiangBao();
    List<Volume> selectPeiShi();
    List<MyVolume> addMyVolume(int volumeId,int userId);
    MyVolume selectMyVolune(int volumeId,int userId);
//    List<MyVolume> personSelectMyVolume(int userId);



    List<MyVolume> selectMyVolumeByUserId(int uerId);
    List<Volume> selectVolumeByVolumeId(int volumeId);
    List<Volume> mainSelectVolumeLimit3();
}
