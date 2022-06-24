package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.UserMapper;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServieImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean logins(String uname, String pwd) {
        boolean b=userMapper.selectByUnameAndPwds(uname,pwd)>0 ? true:false;
        return b;
    }

    @Override
    public User login(String useaccount, String pwd) {
        return userMapper.selectByUnameAndPwd(useaccount,pwd);
    }

    @Override
    public Integer userinsert(String useaccount, String pwd,String userTel,Integer userVip) {
        return userMapper.insertUser(useaccount,pwd,userTel,userVip);
    }


    @Override
    public int updateUserInformation(User user) {
        return userMapper.updateUserInformation(user);
    }

    @Override
    public User ifExist(String userAccount) {
        return userMapper.ifExist(userAccount);
    }

    @Override
    public int usercartnum(int userId) {
        return userMapper.usercartnum(userId);
    }

    @Override
    public int getuserId(String userAccount, String userPwd) {
        return userMapper.getuserId(userAccount,userPwd);
    }

    @Override
    public void insertimage(String key) {
        userMapper.insertimage(key);
    }

    @Override
    public int selectimgid(String key) {
        return userMapper.selectimgid(key);
    }

    @Override
    public void updateuser(int goodsPicId, int userId) {
        userMapper.updateuser(goodsPicId,userId);
    }

    @Override
    public User userId(int userId) {
        return userMapper.userId(userId);
    }

    @Override
    public User userregister(String userAccount) {
        return userMapper.userregister(userAccount);
    }

    @Override
    public User selectUserInformation(int userId) {
        return userMapper.selectUserInformation(userId);
    }
}
