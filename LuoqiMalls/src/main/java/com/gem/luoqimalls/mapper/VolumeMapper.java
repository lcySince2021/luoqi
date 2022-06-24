package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Image;
import com.gem.luoqimalls.pojo.MyVolume;
import com.gem.luoqimalls.pojo.Volume;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VolumeMapper {

//    添加到我的优惠券
    @Select(" insert into myvolume(volumeId,userId) value (#{param1},#{param2})")
    List<MyVolume> addMyVolume(int volumeId, int userId);

//    查询是否有该优惠券
    @Select("select * from myvolume where volumeId=#{param1} and userId=#{param2}")
    MyVolume selectMyVolume(int volumeId, int userId);

////    查询我拥有的优惠券
//    @Select("select * volume where volumeId=#{param1}")
//    Volume personMyVolume(int volumeId);
//
//    //查询我拥有的优惠券的信息
//    @Select("select * from myVolume where userId=#{param1}")
//    @Results({
//            @Result(id=true,column = "myVolumeId",property = "myVolumeId"),
//            @Result(column = "volumeId",property = "volume",
//                    one = @One(select = "com.gem.luoqimalls.mapper.VolumeMapper.personMyVolume")
//            ),
//            @Result(column = "volumeClassId",property = "volumeClassId"),
//            @Result(column = "hMoney",property = "hMoney"),
//            @Result(column = "hMoneys",property = "hMoneys"),
//            @Result(column = "hNum",property = "hNum"),
//            @Result(column = "volumeDate",property = "volumeDate"),
//    })
//    List<MyVolume> personSelectMyVolume(int userId);

    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPic(int goodsPicId);

    //查询全部
    @Select("select * from volume where hMoneys order by RAND() LIMIT 6")
    @Results({
            @Result(id=true,column = "volumeId",property = "volumeId"),
            @Result(column = "volumePicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.VolumeMapper.selectPic")
            ),
    })
    List<Volume> selectVolume();

    //查询服装
    @Select("select * from volume where hMoneys BETWEEN 0 and 99 order by RAND() LIMIT 6")
    @Results({
            @Result(id=true,column = "volumeId",property = "volumeId"),
            @Result(column = "volumePicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.VolumeMapper.selectPic")
            ),
    })
    List<Volume> selectVolumeFuZhuan();

    //查询箱包
    @Select("select * from volume where hMoneys BETWEEN 100 and 999 order by RAND() LIMIT 6")
    @Results({
            @Result(id=true,column = "volumeId",property = "volumeId"),
            @Result(column = "volumePicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.VolumeMapper.selectPic")
            ),
    })
    List<Volume> selectVolumeXiangBao();

    //查询配饰
    @Select("select * from volume where hMoneys > 1000 order by RAND() LIMIT 6")
    @Results({
            @Result(id=true,column = "volumeId",property = "volumeId"),
            @Result(column = "volumePicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.VolumeMapper.selectPic")
            ),
    })
    List<Volume> selectVolumePeiShi();

    @Select("select * from myVolume where userId=#{userId}")
    List<MyVolume> selectMyVolumeByUserId(int uerId);
    @Select("select * from volume where volumeId=#{volumeId}")
    List<Volume> selectVolumeByVolumeId(int volumeId);

    @Select("select * from volume order by RAND() LIMIT 3")
    List<Volume> mainSelectVolumeLimit3();

}
