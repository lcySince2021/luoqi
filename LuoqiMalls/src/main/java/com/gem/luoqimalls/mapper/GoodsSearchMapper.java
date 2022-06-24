package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsSearchMapper {

    @Select("SELECT * from goods where goodsShelf=0 and goodsName LIKE CONCAT('%',#{param1},'%') order by RAND() ")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodsByKey(String goodsNameKey);

    @Select("select COUNT(*) from goods where goodsShelf=0 and goodsName LIKE CONCAT('%',#{param1},'%')")
    int selectCount(String key);

    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPic(int goodsPicId);

    @Select("select * from goods where goodsId=#{param1}")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsMark",property = "goodsMark"),
            @Result(column = "goodsInt",property = "goodsInt"),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),
            @Result(column = "goodsSum",property = "goodsSum"),
            @Result(column = "brandId",property = "brandId"),
            @Result(column = "id_2",property = "id_2"),
            @Result(column = "speId",property = "speId"),
            @Result(column = "gCommentCount",property = "gCommentCount"),
            @Result(column = "goodsInteder",property = "goodsInteder"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
    })
    Goods selectGoodsById(int goodsId);

    @Select("select DISTINCT brandid  from goods where brandid is not null")
    String[] selectBrandId();

    @Select("select id_1 from goodsclass1 where className1=#{param1}")
    Integer selectId_1ByClassName1(String p);

    @Select("select DISTINCT brandid  from goods where brandid is not null and id_1=#{param1}")
    String[] selectBrandIdById_1(Integer id_1);

    @Select("select DISTINCT className2  from goodsclass2 where id_1=#{param1}")
    String[] selectClassName2ById_1(Integer id_1);
    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} order by RAND()")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1(Integer id_1);

    @Select("select count(*) from goods  where goodsShelf=0 and id_1=#{param1}")
    int countById_1(Integer id_1);

    @Select("select id_2 from goodsclass2 where className2=#{param1} and id_1=#{param2}")
    Integer selectId_2ByClassName2(String s,Integer id_1);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and id_2=#{param2} order by RAND()")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndId_2(Integer id_1,Integer id_2);
    @Select("select count(*) from goods where goodsShelf=0 and id_1=#{param1} and id_2=#{param2}")
    int countById_1AndId_2(Integer id_1,Integer id_2);

    @Select("select DISTINCT brandid  from goods where brandid is not null and id_1=#{param1} and id_2=#{param2}")
    String[] selectBrandIdById_1AndId_2(Integer id_1,Integer id_2);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and brandId=#{param2} order by RAND()")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndBrandId(Integer id_1,String ss);
    @Select("select count(*) from goods where goodsShelf=0 and id_1=#{param1} and brandId=#{param2}")
    int countById_1AndBrandId(Integer id_1,String ss);

    @Select("select * from goods order by RAND() LIMIT 3")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectGoodsRandom();


    @Select("SELECT * from goods where goodsShelf=0 and goodsName LIKE CONCAT('%',#{param1},'%') ORDER BY goodsPrice ASC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodsByKeyOrderByPrice(String goodsNameKey);


    @Select("SELECT * from goods where goodsShelf=0 and goodsName LIKE CONCAT('%',#{param1},'%') ORDER BY gCommentCount DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodsByKeyOrderByGCommentCount(String goodsNameKey);

    @Select("SELECT * from goods where goodsShelf=0 and goodsName LIKE CONCAT('%',#{param1},'%') ORDER BY goodsCreateDate DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodsByKeyOrderByGoodsCreateDate(String goodsNameKey);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} ORDER BY goodsPrice ASC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1OrderByPrice(Integer id_1);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} ORDER BY gCommentCount DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1OrderByGCommentCount(Integer id_1);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} ORDER BY goodsCreateDate DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1OrderByGoodsCreateDate(Integer id_1);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and id_2=#{param2} ORDER BY goodsPrice ASC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndId_2OrderByPrice(Integer id_1,Integer id_2);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and id_2=#{param2} ORDER BY gCommentCount DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndId_2OrderByGCommentCount(Integer id_1,Integer id_2);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and id_2=#{param2} ORDER BY goodsCreateDate DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndId_2OrderByGoodsCreateDate(Integer id_1,Integer id_2);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and brandId=#{param2} ORDER BY goodsPrice ASC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndBrandIdOrderByPrice(Integer id_1,String ss);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and brandId=#{param2} ORDER BY gCommentCount DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndBrandIdOrderByGCommentCount(Integer id_1,String ss);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and brandId=#{param2} ORDER BY goodsCreateDate DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndBrandIdOrderByGoodsCreateDate(Integer id_1,String ss);


    @Select("select DISTINCT className2  from goodsclass2")
    String[] selectClassName2();
    @Select("SELECT * from goods where goodsShelf=0 and goodsName LIKE CONCAT('%',#{param1},'%') ORDER BY goodsPrice ASC,goodsCreateDate DESC,gCommentCount DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodsByKeyOrderByAll(String goodsNameKey);

    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} ORDER BY goodsPrice ASC,goodsCreateDate DESC,gCommentCount DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1OrderByAll(Integer id_1);


    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and id_2=#{param2} ORDER BY goodsPrice ASC,goodsCreateDate DESC,gCommentCount DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndId_2OrderByAll(Integer id_1,Integer id_2);


    @Select("select * from goods where goodsShelf=0 and id_1=#{param1} and brandId=#{param2} ORDER BY goodsPrice ASC,goodsCreateDate DESC,gCommentCount DESC")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodSById_1AndBrandIdOrderByAll(Integer id_1,String ss);
    @Select("select id_2 from goods where goodsId=#{param1}")
    Integer selectId_2ByGoodsId(Integer goodsId);
    @Select("select id_1 from goods where goodsId=#{param1}")
    Integer selectId_1ByGoodsId(Integer goodsId);
    @Select("select * from goods where id_2=#{param1} order by RAND() LIMIT 5")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsMark",property = "goodsMark"),
            @Result(column = "goodsInt",property = "goodsInt"),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
            @Result(column = "goodsDiscount",property = "goodsDiscount"),
            @Result(column = "goodsSum",property = "goodsSum"),
            @Result(column = "brandId",property = "brandId"),
            @Result(column = "id_2",property = "id_2"),
            @Result(column = "speId",property = "speId"),
            @Result(column = "gCommentCount",property = "gCommentCount"),
            @Result(column = "goodsInteder",property = "goodsInteder"),
            @Result(column = "goodsDescribe",property = "goodsDescribe"),
    })
    List<Goods> selectLikeGoodsLikeId_2(Integer id_2);
    @Select("select * from goods where id_1=#{param1} order by RAND() LIMIT 5")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectLikeGoodsLikeId_1(Integer id_1);
    @Select("select className1 from goodsclass1 where id_1=#{param1}")
    String selectClassName1Byid(Integer id_1);
    @Select("select className2 from goodsclass2 where id_2=#{param1}")
    String selectClassName2Byid(Integer id_2);
    @Select("select * from goods where id_2=2 or id_2=7")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodsById_2();
    @Select("select count(*) from goods where id_2=2 or id_2=7")
    int countselectAllGoodsById_2();
    @Select("select * from goods ORDER BY goodsCreateDate desc")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodsPicId",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllGoodsOrderByTimeDes();
    @Select("select count(*) from goods ORDER BY goodsCreateDate desc")
    int countselectAllGoodsOrderByTimeDes();
}
