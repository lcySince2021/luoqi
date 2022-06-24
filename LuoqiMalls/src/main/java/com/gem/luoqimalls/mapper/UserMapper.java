package com.gem.luoqimalls.mapper;


import com.gem.luoqimalls.pojo.Image;
import com.gem.luoqimalls.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.boot.web.servlet.server.Session;

public interface UserMapper {
//    注解
@Select("select * from image where goodsPicId=#{param1}")
Image selectPic(int goodsPicId);
//登录
    @Select("select count(*) from user where userAccount=#{param1} and userPwd=#{param2}")
   int selectByUnameAndPwds(String useaccount, String pwd);
    @Select("select * from user where userAccount=#{param1} and userPwd=#{param2}")
    @Results({
            @Result(id=true,column = "userId",property = "userId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.UserMapper.selectPic")
            ),
            @Result(column = "userAccount",property = "userAccount"),
            @Result(column = "userPwd",property = "userPwd"),
            @Result(column = "userBir",property = "userBir"),
            @Result(column = "userCreatTime",property = "userCreatTime"),
            @Result(column = "userSex",property = "userSex"),
            @Result(column = "userName",property = "userName"),
            @Result(column = "userEmall",property = "userEmall"),
            @Result(column = "userNick",property = "userNick"),
            @Result(column = "userVip",property = "userVip"),
            @Result(column = "userTel",property = "userTel"),
            @Result(column = "userMoney",property = "userMoney"),
            @Result(column = "userPws",property = "userPws"),
            @Result(column = "userinit",property = "userinit"),
    })
   User selectByUnameAndPwd(String useaccount, String pwd);
//注册
@Select("insert into user(userAccount,userPwd,userTel,userVip) value(#{param1},#{param2},#{param3},#{param4})")
Integer insertUser(String useaccount,String pwd,String userTel,Integer userVip);

    @Select("select * from user where userId=#{param1}")
    User selectUserInformation(int userId);



    //修改个人信息
    @Update("update user set userNick=#{userNick},userName=#{userName},userSex=#{userSex},userBir=#{userBir},userTel=#{userTel},userEmall=#{userEmall} where userId=#{userId}")
    int updateUserInformation(User user);
    //验证账号是否已存在
    @Select("select * from user where userAccount=#{userAccount}")
    User ifExist(String userAccount);
    @Select("select count(*) from cart where userId=#{param1}")
    int usercartnum(int userId);
    @Select("select userId from user  where userAccount=#{param1} and userPwd=#{param2}")
    int getuserId(String userAccount,String userPwd);


    @Select("insert into image(goodsPicMaster)  value(#{param1})")
    void insertimage(String key);
    @Select("select goodsPicId from image where goodsPicMaster=#{param1} ")
    int selectimgid(String key);
    @Select("update user set goodsPicId=#{param1}  where userId=#{param2} ")
    void updateuser(int goodsPicId,int userId);

    @Select("select * from user where userId=#{param1} ")
    @Results({
            @Result(id=true,column = "userId",property = "userId"),
            @Result(column = "goodsPicId",property = "image",
                    one = @One(select = "com.gem.luoqimalls.mapper.UserMapper.selectPic")
            ),
            @Result(column = "userAccount",property = "userAccount"),
            @Result(column = "userPwd",property = "userPwd"),
            @Result(column = "userBir",property = "userBir"),
            @Result(column = "userCreatTime",property = "userCreatTime"),
            @Result(column = "userSex",property = "userSex"),
            @Result(column = "userName",property = "userName"),
            @Result(column = "userEmall",property = "userEmall"),
            @Result(column = "userNick",property = "userNick"),
            @Result(column = "userVip",property = "userVip"),
            @Result(column = "userTel",property = "userTel"),
            @Result(column = "userMoney",property = "userMoney"),
            @Result(column = "userPws",property = "userPws"),
            @Result(column = "userinit",property = "userinit"),
    })
    User userId(int userId);



    @Select("select * from user where userAccount=#{param1}")
    User userregister(String userAccount);
}
