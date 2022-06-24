package com.gem.luoqimalls.pojo;

import java.util.Date;
import java.util.List;

public class User {
    private int userId;//id
    private String userAccount;//账号
    private String userPwd;//密码
    private String userBir;//生日
    private Date userCreatTime;//创建时间
    private String userSex;//性别
    private String userName;//姓名
    private String userEmall;//邮件
    private String userNick;//昵称
    private int userVip;//是否VIP
    private String userTel;//电话
    private int userPws;//支付密码
    private double userMoney;//余额
    private int userinit;//我的积分
    private Image image;
    private int goodsPicId;
    private int isJY;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userBir='" + userBir + '\'' +
                ", userCreatTime=" + userCreatTime +
                ", userSex='" + userSex + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmall='" + userEmall + '\'' +
                ", userNick='" + userNick + '\'' +
                ", userVip=" + userVip +
                ", userTel='" + userTel + '\'' +
                ", userPws=" + userPws +
                ", userMoney=" + userMoney +
                ", userinit=" + userinit +
                ", image=" + image +
                ", goodsPicId=" + goodsPicId +
                ", isJY=" + isJY +
                ", orderList=" + orderList +
                '}';
    }

    public int getIsJY() {
        return isJY;
    }

    public void setIsJY(int isJY) {
        this.isJY = isJY;
    }

    public User(int userId, String userAccount, String userPwd, String userBir, Date userCreatTime, String userSex, String userName, String userEmall, String userNick, int userVip, String userTel, int userPws, double userMoney, int userinit, Image image, int goodsPicId, List<Order> orderList) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPwd = userPwd;
        this.userBir = userBir;
        this.userCreatTime = userCreatTime;
        this.userSex = userSex;
        this.userName = userName;
        this.userEmall = userEmall;
        this.userNick = userNick;
        this.userVip = userVip;
        this.userTel = userTel;
        this.userPws = userPws;
        this.userMoney = userMoney;
        this.userinit = userinit;
        this.image = image;
        this.goodsPicId = goodsPicId;
        this.orderList = orderList;
    }

    public int getGoodsPicId() {
        return goodsPicId;
    }

    public void setGoodsPicId(int goodsPicId) {
        this.goodsPicId = goodsPicId;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    private List<Order> orderList;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public User(String userAccount, String userPwd, Date userCreatTime) {
        this.userAccount = userAccount;
        this.userPwd = userPwd;
        this.userCreatTime = new Date();
    }

    public int getUserinit() {
        return userinit;
    }

    public void setUserinit(int userinit) {
        this.userinit = userinit;
    }

    public User(int userId, String userAccount, String userPwd, String userBir, Date userCreatTime, String userSex, String userName, String userEmall, String userNick, int userVip, String userTel, int userPws, double userMoney, int userinit) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPwd = userPwd;
        this.userBir = userBir;
        this.userCreatTime = userCreatTime;
        this.userSex = userSex;
        this.userName = userName;
        this.userEmall = userEmall;
        this.userNick = userNick;
        this.userVip = userVip;
        this.userTel = userTel;
        this.userPws = userPws;
        this.userMoney = userMoney;
        this.userinit = userinit;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserBir() {
        return userBir;
    }

    public void setUserBir(String userBir) {
        this.userBir = userBir;
    }

    public Date getUserCreatTime() {
        return userCreatTime;
    }

    public void setUserCreatTime(Date userCreatTime) {
        this.userCreatTime = userCreatTime;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmall() {
        return userEmall;
    }

    public void setUserEmall(String userEmall) {
        this.userEmall = userEmall;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public int getUserVip() {
        return userVip;
    }

    public void setUserVip(int userVip) {
        this.userVip = userVip;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public int getUserPws() {
        return userPws;
    }

    public void setUserPws(int userPws) {
        this.userPws = userPws;
    }

    public double getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(double userMoney) {
        this.userMoney = userMoney;
    }

    public User() {
    }

    public User(int userId, String userAccount, String userPwd, String userBir, Date userCreatTime, String userSex, String userName, String userEmall, String userNick, int userVip, String userTel, int userPws, double userMoney) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPwd = userPwd;
        this.userBir = userBir;
        this.userCreatTime = new Date();
        this.userSex = userSex;
        this.userName = userName;
        this.userEmall = userEmall;
        this.userNick = userNick;
        this.userVip = userVip;
        this.userTel = userTel;
        this.userPws = userPws;
        this.userMoney = userMoney;
    }

}