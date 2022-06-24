package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AdminMapper {
    @Select("select * from goods")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.AdminMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoods();
    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPic(int goodsPicId);
    @Select("select count(*) from goods")
    int countBySelectAllGoods();

    boolean updateHuoDong(Goods goods);

    boolean updateIsShelf(Integer goodsId,Integer goodsShelf);
    List<GoodsClass1> selectAllClassName1();
    List<GoodsClass2> selectAllClassName2();
    boolean insertImage(Image image);
    Integer selectGoodsPicIdBygoodsPicMaster(String goodsPicMaster);
    boolean insertGoods(Goods goods);
    @Select("select * from goods where goodsId=#{param1}")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.AdminMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    Goods selectAllByGoodsId(Integer goodsId);
    boolean updateImage(Image image);
    boolean updateGoods(Goods goods);
    @Select("select * from goods where goodsName LIKE CONCAT('%',#{param1},'%')")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.AdminMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectByKey(String key);
    @Select("select count(*) from goods where goodsName LIKE CONCAT('%',#{param1},'%')")
    int countselectByKey(String key);
    @Select("select * from user")
    List<User> selectAllUser();
    @Select("select count(*) from user")
    int countUser();
    boolean updateUserVip(Integer userId,Integer userVip);
    User selectAllUserByUserId(Integer userId);
    @Select("select * from Volume")
    @Results({
            @Result(id=true,column = "Volumeid",property = "volumeId"),
            @Result(column = "volumePicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.AdminMapper.selectPic")
            ),
            @Result(column = "volumeclass",property = "volumeClass"),
            @Result(column = "hMoney",property = "hMoney"),
            @Result(column = "hMoneys",property = "hMoneys"),
            @Result(column = "hNum",property = "hNum"),
            @Result(column = "volumeDate",property = "volumeDate"),
    })
     List<Volume> selectAllVolume();
    @Select("select count(*) from Volume")
    int countSelectVolume();
    @Select("select * from Volume where volumeid=#{param1}")
    @Results({
            @Result(id=true,column = "Volumeid",property = "volumeId"),
            @Result(column = "volumePicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.AdminMapper.selectPic")
            ),
            @Result(column = "volumeclass",property = "volumeClass"),
            @Result(column = "hMoney",property = "hMoney"),
            @Result(column = "hMoneys",property = "hMoneys"),
            @Result(column = "hNum",property = "hNum"),
            @Result(column = "volumeDate",property = "volumeDate"),
    })
    Volume selectAllVolumeById(Integer volumeId);

     boolean updateImageById(Integer id,String pic);
     boolean updateVolume(Volume volume);
     boolean deleteVolumeById(Integer id);
     @Select("select DISTINCT volumeclass  from volume where volumeclass is not null")
     String[] selectVolumeClass();
     boolean insertAllVolume(Volume volume);
     @Select("select * from address where userid=#{param1}")
     List<Address> selectAddressByUserId(Integer id);

    @Select("select goodspicid from image where goodsPicMaster=#{param1} ")
    int selectimgid(String key);
//     @Select("insert into image(goodsPicMaster,goodspic1,goodspic2,goodspic3,goodspic4)  value(#{param1},#{param1},#{param1},#{param1},#{param1})")
//     void insertimage(String key);
     @Select("insert into image(goodsPicMaster)  value(#{param1})")
     void insertimages(String key);
    @Select("insert into image(goodsPicMaster)  value(1)")
    void insertimage();
    @Select("update image set  goodsPicMaster=#{param1} where goodspicid=#{param2} ")
    void insertimage0(String key,int goodspicid);
     @Select("update image set goodspic1=#{param1} where goodspicid=#{param2} ")
     void insertimage1(String key,int goodspicid);
     @Select("update image set goodspic2=#{param1} where goodspicid=#{param2} ")
     void insertimage2(String key,int goodspicid);
     @Select("update image set goodspic3=#{param1} where goodspicid=#{param2}")
     void insertimage3(String key,int goodspicid);
     @Select("update image set goodspic4=#{param1} where goodspicid=#{param2}")
     void insertimage4(String key,int goodspicid);

    @Select("select goodspicid from image   ORDER BY goodspicid DESC LIMIT 1")
    int newpicid();

    @Select("update goods set goodspicId=#{param1} where goodsId=#{param2}")
   void  newuserpicid(int goodspicId,int goodsId);


    @Select("select * from evaluate")
    List<Evaluate> selectAllEvaluate();

    @Delete("delete from evaluate where evaluateId=#{evaluateId}")
    int deleteEvaluateByEvaluateId(int evaluateId);

    @Select("select * from evaluate where evaluateId=#{param1}")
    Evaluate selectEvaluateById(int evaluateId);

    @Update("update evaluate set reply=#{param1} where evaluateId=#{param2}")
    Integer updateReply(String reply, int evaluateId);
    @Update("update user set isJY=#{param2} where userId=#{param1}")
    boolean updateJYByUserId(Integer userId,Integer isJY);

    @Select("select * from admin where adminId=#{param1} and adminPwd=#{param2}")
    Admin selectByUnameAndPwd(String adminId, String adminPwd);
    @Select("select count(*) from admin where adminId=#{param1} and adminPwd=#{param2}")
    int selectByUnameAndPwds(String adminId, String adminPwd);


}
