package com.gem.luoqimalls.service;


import com.gem.luoqimalls.pojo.User;

public interface UserService {

     boolean logins(String useaccount, String pwd);
     User login(String useaccount, String pwd);
     Integer userinsert(String useaccount,String pwd,String userTel,Integer userVip);

     User selectUserInformation(int userId);

     //修改个人信息
     int updateUserInformation(User user);


     User ifExist(String userAccount);
     int usercartnum(int userId);
     int getuserId(String userAccount,String userPwd);


     void insertimage(String key);
     int selectimgid(String key);
     void updateuser(int goodsPicId,int userId);

     User userId(int userId);
     User userregister(String userAccount);

}
