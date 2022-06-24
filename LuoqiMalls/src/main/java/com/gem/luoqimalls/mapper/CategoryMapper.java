package com.gem.luoqimalls.mapper;


import com.gem.luoqimalls.pojo.Catory;
import org.apache.ibatis.annotations.Select;

public interface CategoryMapper {

//     查询所有的商品
//    根据类别号查询类别名  一对一的关系

    @Select("select * from catory where id=#{param1}")
    Catory selectCatory(int id);//根据类别号查询类别


}
