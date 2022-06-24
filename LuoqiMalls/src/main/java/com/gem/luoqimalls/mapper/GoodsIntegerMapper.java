package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import com.gem.luoqimalls.pojo.Markbuy;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsIntegerMapper {

    @Select("select * from goods  where goodsShelf=0 and goodsInteger=0")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodspicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllIntegerGoods();
    @Select("select COUNT(*) from goods where goodsShelf=0 and goodsInteger=0")
    int selectIntegerCount();
    @Select("select * from goods  where goodsShelf=0 and goodsInteger=0 and goodsName LIKE CONCAT('%',#{param1},'%') ")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodspicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllIntegerGoodsforName(String name);

    @Select("select * from goods  where goodsShelf=0 and goodsInteger=0 and goodsName LIKE CONCAT('%',#{param1},'%')and  goodsint BETWEEN #{param2} AND #{param3}")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodspicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectAllIntegerGoodsforAll(String  name,int num1,int num2);
    @Select("select COUNT(*)from goods  where goodsShelf=0 and goodsInteger=0 and goodsName LIKE CONCAT('%',#{param1},'%') \n" +
            "and  goodsint BETWEEN #{param2} AND #{param3}")
    int selectIntegerCountByAll(String  name,int num1,int num2);


    @Select("select * from image where goodsPicId=#{param1}")
    Image selectPic(int goodsPicId);








    @Select("    select * from goods  where goodsShelf=0 and goodsInteger=0 and goodsName LIKE CONCAT('%',#{param1},'%')")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodspicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectonlyname(String  name);
    @Select("select count(*) from goods  where goodsShelf=0 and goodsInteger=0 and goodsName LIKE CONCAT('%',#{param1},'%')")
    int selectnumonlyname(String  name);

    @Select("        select * from goods  where goodsShelf=0 and goodsInteger=0 and goodsint BETWEEN #{param1} AND #{param2}")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodspicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectonlynum(int num1,int num2);

    @Select(" select count(*) from goods  where goodsShelf=0 and goodsInteger=0 and goodsint BETWEEN #{param1} AND #{param2}")
    int selectnumonlynum(int num1,int num2);



    @Select("   select * from goods  where goodsShelf=0 and goodsInteger=0 and  goodsint>#{param1}")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodspicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectonlynum1(int num1);

    @Select("   select count(*) from goods  where goodsShelf=0 and goodsInteger=0 and  goodsint>#{param1}")
    int selectnumonlynum1(int num1);

    @Select("   select * from goods  where goodsShelf=0 and goodsInteger=0 and  goodsint<#{param1}")
    @Results({
            @Result(id = true,column = "goodsId",property = "goodsId"),
            //一对一关系
            @Result(column = "goodspicid",property = "image",
                    one=@One(select = "com.gem.luoqimalls.mapper.GoodsSearchMapper.selectPic")
            ),
            @Result(column = "goodsName",property = "goodsName"),
            @Result(column = "goodsPrice",property = "goodsPrice"),
            @Result(column = "goodsSales",property = "goodsSales"),
    })
    List<Goods> selectonlynum2(int num2);

    @Select("   select count(*) from goods  where goodsShelf=0 and goodsInteger=0 and  goodsint<#{param1}")
    int selectnumonlynum2(int num2);

//用户积分减少
@Select("update user set userinit=userinit-{param1} where userid={param2}")
void  userinitupdate(int goodsinit,int userid);
//    商品进入订单表内的待发货
//  添加订单（待发货）

    @Select("insert into `order` (userId,orderstate,orderNum) value(#{param1},'待发货',#{param2})")
    void inserttoorder(int userId,int orderNum);

    //    查找订到编号
    @Select("select orderId from `order` where orderNum=#{param1}")
    int selecttoorder(int orderNum);

    //    添加订单详情表
    @Select("insert into orderdetails (orderId,goodsId,ordergoodsnum) value(#{param1},#{param2},#{param3})")
    void inserttoorderdetail(int orderId,int goodsId,int ordergoodsnum);


//    void selectmarkbuy(int orderId,int goodsId,int ordergoodsnum);

    @Select("select * from markbuy where userId=#{param1}")
    @Results({
            @Result(id = true,column = "markId",property = "markId"),
            @Result(column = "userId",property = "userId"),
            //一对一关系
            @Result(column = "goodsId",property = "goods",
                    one=@One(select = "com.gem.luoqimalls.mapper.CartMapper.sselectcartgoods")
            ),
            @Result(column = "num",property = "num"),
            @Result(column = "markdate",property = "markdate"),
            @Result(column = "marks",property = "marks"),
    })
    List<Markbuy> selectmarkbuy(int userId);






}
