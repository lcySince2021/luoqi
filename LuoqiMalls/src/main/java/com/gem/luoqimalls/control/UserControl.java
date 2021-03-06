package com.gem.luoqimalls.control;

import com.gem.luoqimalls.httpApiDemo.AccountInfo;
import com.gem.luoqimalls.httpApiDemo.IndustrySMS;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.UserService;
import com.gem.luoqimalls.service.GoodsService;
import com.google.gson.Gson;
import com.qiniu.util.Auth;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.xml.ws.Response;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.gem.luoqimalls.httpApiDemo.AccountInfo;
import com.gem.luoqimalls.httpApiDemo.IndustrySMS;
import com.gem.luoqimalls.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserControl {

    @Autowired
    private UserService userService;

    @Autowired
    private GoodsService goodsService;

//    @ResponseBody
    @RequestMapping("/login")
    public String login(String useraccount, String userpwd,String rember, Model model,HttpServletResponse response) {
        User userAll=userService.login(useraccount,userpwd);
        int pp=9527;
         if (userAll!=null){
             //??????session???,?????????
             int userId=userService.getuserId(useraccount,userpwd);
             int usercartnum=userService.usercartnum(userId);

             model.addAttribute("user",userAll);
             model.addAttribute("usercartnum",usercartnum);
             System.out.println("????????????");
             if ("1".equals(rember)) { //"1"??????????????????????????????
             /*String cookieUserName = Utils.encrypt(name);
             String cookiePwd = Utils.encrypt(passWord);
             String loginInfo = cookieUserName+","+cookiePwd;*/
                 String loginInfo = useraccount + "#" + userpwd;
                 Cookie userCookie = new Cookie("loginInfo", loginInfo);

//                userCookie.setMaxAge(30 * 24 * 60 * 60);   //????????????????????? 30*24*60*60
                 userCookie.setMaxAge(600);   //????????????????????? 30*24*60*60
                 userCookie.setPath("/");
                 response.addCookie(userCookie);
             }

                 return  "forward:/user/main";


         }else {
             //???????????????????????????
//            model.addAttribute("user1",user);
             model.addAttribute("pp",pp);
             System.out.println("????????????");
             return "/home/login";
         }

//        boolean b=userService.logins(useraccount,userpwd);
//        model.addAttribute("user",userAll);
//        System.out.println(b);
//       return b;
    }

    @RequestMapping("/loginout")
    public String loginOut(SessionStatus sessionStatus) {  //SpringMVC ???????????????????????????,?????????????????? ,???????????????????????????


        sessionStatus.setComplete();//???session??????
        //??????

        return "/home/home";
    }


    @RequestMapping("/main")
    public String main(Model model,HttpSession session){
//        List<Goods> goods=goodsService.getAllGoods();
//        model.addAttribute("glist",goods);
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);
        String useraccount=user.getUserAccount();
        String userpwd=user.getUserPwd();
        User userAll=userService.login(useraccount,userpwd);
        model.addAttribute("user",userAll);
        model.addAttribute("usercartnum",usercartnum);
        return "/home/home";
    }

    @RequestMapping("/updatepre")
    public String updatepre(int gid,Model model){
       Goods goods= goodsService.getGoodsById(gid);
        model.addAttribute("goods",goods);
        return "/html/update";
    }

    @RequestMapping("/update")
    public String update(Goods goods, MultipartFile file, HttpServletRequest request) throws IOException {
//        ?????????????????????
        if(file!=null||file.getOriginalFilename()!=null||!file.getOriginalFilename().trim().equals("")){
            //        ?????????????????????
            String name=file.getOriginalFilename();
            //     ???d:???????????????(????????????,??????uuid????????????)
            String ip=request.getHeader("Host").split(":")[0];
            String newFile1="D:/upload/"+ip;
            String newFile="D:/upload/"+ip+"/"+ UUID.randomUUID().toString().replace("-","")+""+name;
            File file11=new File(newFile1);
            file11.mkdirs();//??????????????? ip

            File file1=new File(newFile);
            file1.createNewFile();//????????????

            //????????????
            file.transferTo(file1);
//            goods.setPic("upload/"+ip+"/"+ UUID.randomUUID().toString().replace("-","")+""+name);
        }

        goodsService.updateGoods(goods);

       return "forward:/user/main";
    }

    @RequestMapping("/userchange")
    public String userchange(Model model){
        String accessKey = "tUb23lcz6dvTsC1WorrhhLCKiwxCtPHDIIq7kror";
        String secretKey = "CtwU8BU1wF4_d2XsJFTUPD50WiwbGk6cd5T_IKj6";
        String bucket = "luoqi-image";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket, null);
        System.out.println(1);
        System.out.println(upToken);
        model.addAttribute("upToken",upToken);

        return "/person/informationchange";
    }


    //??????????????????
    @RequestMapping("/showInformation")
    public String showInformation(HttpSession session,Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        User userAll=userService.userId(userId);
        model.addAttribute("user",userAll);
        return "/person/information";
    }
    @RequestMapping("/changeInformation")
    public String changeInformation(){

        return "/person/informationchange";
    }

    @ResponseBody
    @RequestMapping("/userheart")
    public Map<String,Integer> userheart(HttpSession session,String key, Model model){
        System.out.println(123);
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        Map<String, Integer> maps=new HashMap<String, Integer>();
        String keys="http://ph8kqk6vv.bkt.clouddn.com/"+key.toString();
        System.out.println(keys);
        userService.insertimage(keys);
        int num=userService.selectimgid(keys);
        System.out.println("??????");
        System.out.println(num);
        System.out.println("??????");
        System.out.println(userId);
        userService.updateuser(num,userId);
        System.out.println(keys);

        return  maps;

    }


    //??????????????????
    @RequestMapping("/information")
    public String information(HttpSession session, HttpServletRequest request,Model model,SessionStatus sessionStatus){

        User user= (User) session.getAttribute("user");
        String userNick=request.getParameter("userNick");
        String userName=request.getParameter("userName");
//        int usersId= Integer.parseInt(request.getParameter("userId"));
        String userSex=request.getParameter("userSex");
        String userBir=request.getParameter("userBir");
        //Integer userTel = request.getParameter("userTel") != null && !request.getParameter("userTel").equals("") ? Integer.parseInt(request.getParameter("userTel")) : null;
        String userTel=request.getParameter("userTel");
        String userEmall=request.getParameter("userEmall");
        User user3 = (User) session.getAttribute("user");
        int userId=user3.getUserId();
        System.out.println(userId);
        User user1=new User();
        user1.setUserId(userId);
        System.out.println();
        user1.setUserNick(userNick);
        user1.setUserName(userName);
        user1.setUserSex(userSex);
        user1.setUserBir(userBir);
        user1.setUserTel(userTel);
        user1.setUserEmall(userEmall);
        userService.updateUserInformation(user1);

        int c=userService.updateUserInformation(user1);
        if (c==1){
            System.out.println("yes");
        }else {
            System.out.println("none");
        }
        System.out.println(userId);
        User  users=userService.selectUserInformation(userId);

//        sessionStatus.setComplete();
        model.addAttribute("user",users);
        System.out.println(users);
        return "forward:/user/showInformation";
    }

    @RequestMapping("/getYanMa")
    public String getYanMa(String phone, HttpServletRequest request){

        int num= (int)((Math.random()*9+1)*100000);//6???????????????

//        ????????????,????????????????????? ??????"????????????????????????????????????23456?????????2??????????????????????????????????????????????????????????????????"

        /*String Content="????????????????????????????????????"+num+"?????????2??????????????????????????????????????????????????????????????????";*/
        String Content="????????????????????????????????????"+num+"?????????2??????????????????????????????????????????????????????????????????";
        request.setAttribute("yan",num);

        AccountInfo.execute();
        IndustrySMS industrySMS=new IndustrySMS(phone,Content);
        String resJson=industrySMS.execute();

        return resJson;


    }


    @RequestMapping("/miaoRegister")
    public String login(HttpServletRequest request, HttpServletResponse response,Integer userVip,Model model) throws IOException {

        String userAccount=request.getParameter("uname");
        String userPwd=request.getParameter("pwd");
        String userTel=request.getParameter("phone");
        User userAll=userService.userregister(userAccount);
        int pp=9527;
        if (userAll!=null){
            model.addAttribute("pp",pp);
            System.out.println("????????????");
            return "/home/register";
        }
        else{


        System.out.println(userAccount);
        System.out.println(userPwd);
        userVip=1;
        userService.userinsert(userAccount,userPwd,userTel,userVip);
        System.out.println("sucess");

        return "forward:/user/login";
    }


    }
   @ResponseBody
    @RequestMapping("/ifExist")
    public Map<String,Integer> ifExist(String userAccount){
        System.out.println(userAccount);
        Map<String,Integer> map=new HashMap<>();
        User user=userService.ifExist(userAccount);
        System.out.println(user);
        System.out.println(user==null);
        if (user==null){
            map.put("a",1);
            System.out.println(1);

        }else{
            map.put("a",2);
            System.out.println(2);
        }
       System.out.println(map);
       return map;

    }



}
