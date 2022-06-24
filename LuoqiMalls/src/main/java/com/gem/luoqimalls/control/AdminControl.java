package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.AdminService;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.gem.luoqimalls.service.OrderService;
import com.github.pagehelper.PageInfo;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@RequestMapping("/admin")
@Controller
public class AdminControl {
    @Autowired
    private AdminService adminService;
    @Autowired
    private GoodsSearchService searchService;
    @Autowired
    private OrderService orderService;
    @RequestMapping("/index")
    public String admin(){
        return "/admin/index";
    }
    @RequestMapping("/product")
    public String productList(Integer curPage, Model model){
        PageInfo<Goods> pageInfo=adminService.getAllGoods(curPage);
        model.addAttribute("curPage",curPage);
        model.addAttribute("pageInfo",pageInfo);
        return "/admin/product-list";
    }
    @RequestMapping("/update")
    public String update(Integer goodsId,Integer goodsInteder,Integer isMiaoSha,Integer isYouHui,Integer curPage,Model model){
        Goods goods=new Goods(goodsId,goodsInteder,isMiaoSha,isYouHui);
        boolean b=adminService.updateHuoDong(goods);
        if(b){
            PageInfo<Goods> pageInfo=adminService.getAllGoods(curPage);
            model.addAttribute("curPage",curPage);
            model.addAttribute("pageInfo",pageInfo);
        }
        return "/admin/product-list";
    }
    @RequestMapping("/ifShelf")
    public String ifShelf(Integer goodsId,Integer goodsShelf,Integer curPage,Model model){
        boolean b=adminService.updateIsShelf(goodsId,goodsShelf);
        if(b){
            PageInfo<Goods> pageInfo=adminService.getAllGoods(curPage);
            model.addAttribute("curPage",curPage);
            model.addAttribute("pageInfo",pageInfo);
        }
        return "/admin/product-list";
    }
    @RequestMapping("/addGoods")
    public String addGoods(Model model){
        String[] brandId=searchService.getBrandId();
        List<GoodsClass1> goodsClass1s=adminService.getAllGoodsClass1();
        List<GoodsClass2> goodsClass2s=adminService.getAllGoodsClass2();
        model.addAttribute("brandId",brandId);
        model.addAttribute("goodsClass1s",goodsClass1s);
        model.addAttribute("goodsClass2s",goodsClass2s);

        String accessKey = "tUb23lcz6dvTsC1WorrhhLCKiwxCtPHDIIq7kror";
        String secretKey = "CtwU8BU1wF4_d2XsJFTUPD50WiwbGk6cd5T_IKj6";
        String bucket = "luoqi-image";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket, null);
        System.out.println(upToken);
        model.addAttribute("upToken",upToken);
       adminService.insertimage();

        return "/admin/product-add";
    }
    @RequestMapping("/add")
    public String add(Image image,Goods goods){


        int picId = adminService.newpicid();
        System.out.println(picId);

          Integer goodsMark=goods.getGoodsMark();
          Integer goodsInt=goods.getGoodsInt();
          String goodsName=goods.getGoodsName();
          Double goodsPrice=goods.getGoodsPrice();
          Double goodsDiscount=goods.getGoodsDiscount();
          Integer goodsSum=goods.getGoodsSum();
          String brandId=goods.getBrandId();
          Integer goodsShelf=goods.getGoodsShelf();
          Integer id_2=goods.getId_2();
          Integer speId=goods.getSpeId();
          Integer goodsInteder=goods.getGoodsInteder();
          String goodsDescribe=goods.getGoodsDescribe();
          Integer isMiaoSha=goods.getIsMiaoSha();
          Integer isYouHui=goods.getIsYouHui();
          Integer id_1=goods.getId_1();

        Date goodsCreateDate=new Date();
          Goods goods1=new Goods(goodsMark,goodsInt,goodsName,picId,goodsPrice,goodsDiscount,goodsSum,brandId,goodsCreateDate,goodsShelf,id_2,speId,goodsInteder,goodsDescribe,isMiaoSha,isYouHui,id_1);
          boolean b=adminService.addAllGoods(goods1);
          return "forward:/admin/product";
    }
    @RequestMapping("/updateGoods")
    public String updateGoods(Integer goodsId,Integer curPage,Model model){
        Goods goods=adminService.getAllGoodsByGoodsId(goodsId);
        model.addAttribute("goods",goods);
        model.addAttribute("curPage",curPage);

        String accessKey = "tUb23lcz6dvTsC1WorrhhLCKiwxCtPHDIIq7kror";
        String secretKey = "CtwU8BU1wF4_d2XsJFTUPD50WiwbGk6cd5T_IKj6";
        String bucket = "luoqi-image";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket, null);
        System.out.println(upToken);
        model.addAttribute("upToken",upToken);



        return "/admin/product-update";
    }
    @RequestMapping("/updateGoodsList")
    public String updateGoodsList(Image image,Goods goods,Integer curPage,Model model, MultipartFile file, MultipartFile file1, MultipartFile file2, MultipartFile file3, MultipartFile file4){
        int picId = adminService.newpicid();
        System.out.println(picId);
        Integer goodsMark=goods.getGoodsMark();
        Integer goodsInt=goods.getGoodsInt();
        Double goodsPrice=goods.getGoodsPrice();
        Double goodsDiscount=goods.getGoodsDiscount();
        Integer goodsSums=goods.getGoodsSum();
        int goodsSum=goodsSums;
        String goodsDescribe=goods.getGoodsDescribe();
        Integer goodsId=goods.getGoodsId();
        int goodsIds=goodsId;
        System.out.println(goodsIds);
//        Integer goodsPicId=goods.getGoodsPicId();

        Goods goods1=new Goods(goodsId,goodsMark,goodsInt,picId,goodsPrice,goodsDiscount,goodsSum,goodsDescribe);

        boolean b=adminService.updateGoods(goods1);
        PageInfo<Goods> pageInfo=adminService.getAllGoods(curPage);
        adminService.newuserpicid(picId,goodsIds);
        model.addAttribute("curPage",curPage);
        model.addAttribute("pageInfo",pageInfo);
        return "/admin/product-list";
    }
    @RequestMapping("/selectByKey")
    public String select(String key,Integer curPage,Model model){
        PageInfo<Goods> pageInfo=adminService.getGoodsByKey(curPage,key);
        model.addAttribute("curPage",curPage);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("key",key);
        return "/admin/product-list1";

    }
    @RequestMapping("/member-list")
    public String memberlist(Integer curPage,Model model){
      PageInfo<User> userPageInfo=adminService.getAllUser(curPage);
      model.addAttribute("userPageInfo",userPageInfo);
        return "/admin/member-list";
    }
    @RequestMapping("/userVipUpdate")
    public String userVipUpdate(Integer useId,Integer userVip,Integer curPage,Model model){
        boolean b=adminService.updateUserVip(useId,userVip);
        PageInfo<User> userPageInfo=adminService.getAllUser(curPage);
        model.addAttribute("userPageInfo",userPageInfo);
        return "/admin/member-list";
    }
    @RequestMapping("/chazhao")
    public String chazhao(Integer userId,Model model){
        User user=adminService.getAllUserById(userId);
        List<Address> addressList=adminService.getAllAddress(userId);
        model.addAttribute("addressList",addressList);
        model.addAttribute("user",user);
        return "/admin/user-detial";
    }
    @RequestMapping("/youhuiquan")
    public String youhuiquan(Integer curPage,Model model){
        PageInfo<Volume> pageInfo=adminService.getAllVolume(curPage);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("curPage",curPage);
        return "/admin/youhuiquan-list";
    }
    @RequestMapping("updateVolume")
    public String updateVolume(Integer volumeId,Integer curPage,Model model){
        Volume volume=adminService.getVolumeById(volumeId);
        model.addAttribute("volume",volume);
        model.addAttribute("curPage",curPage);
        return "/admin/youhuiquan-update";
    }
    @RequestMapping("updateVolumeList")
    public String updateVolumeList(String goodsPicMaster,Volume volume,Integer curPage,Model model){
        String volumeClass=volume.getVolumeClass();
        Double hMoney=volume.gethMoney();
        Double hMoneys=volume.gethMoneys();
        Double hNum=volume.gethNum();
        Date volumeDate=volume.getVolumeDate();
        Integer volumePicId=volume.getVolumePicId();
        Integer volumeId=volume.getVolumeId();
        Volume volume1=new Volume(volumeId,volumeClass,hMoney,hMoneys,hNum,volumeDate);
        boolean b=adminService.updateImageById(volumePicId,goodsPicMaster);
        boolean v=adminService.updateVolume(volume1);
        PageInfo<Volume> pageInfo=adminService.getAllVolume(curPage);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("curPage",curPage);
        return "/admin/youhuiquan-list";
    }
    @RequestMapping("delVolume")
    public String delVolume(Integer volumeId,Integer curPage,Model model){
        boolean b=adminService.delVolumeById(volumeId);
        PageInfo<Volume> pageInfo=adminService.getAllVolume(curPage);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("curPage",curPage);
        return "/admin/youhuiquan-list";
    }
    @RequestMapping("addVolumes")
    public String addVolumes(Model model){
        String[] volumeClass=adminService.getvolumeclass();
        for (String ss:volumeClass){
            System.out.println(ss);
        }

        String accessKey = "tUb23lcz6dvTsC1WorrhhLCKiwxCtPHDIIq7kror";
        String secretKey = "CtwU8BU1wF4_d2XsJFTUPD50WiwbGk6cd5T_IKj6";
        String bucket = "luoqi-image";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket, null);
        System.out.println(upToken);
        model.addAttribute("upToken",upToken);

        model.addAttribute("volumeClass",volumeClass);
        return "/admin/youhuiquan-add";
    }
    @RequestMapping("addvol")
    public String addvol(Volume volume,Model model,String goodsPicMaster,Integer curPage){
        System.out.println(goodsPicMaster);
        String volumeClass=volume.getVolumeClass();
        System.out.println(volumeClass);
        Double hMoney=volume.gethMoney();
        Double hMoneys=volume.gethMoneys();
        Double hNum=volume.gethNum();
        Date volumeDate=volume.getVolumeDate();
//        Integer picId=adminService.getGoodsPicIdByGoodsPicMaster(goodsPicMaster);
        int picIds = adminService.newpicid();
        Integer picId=picIds;
        Volume volume1=new Volume(volumeClass,hMoney,hMoneys,hNum,volumeDate,picId);

        boolean b=adminService.addVolume(volume1);
        PageInfo<Volume> pageInfo=adminService.getAllVolume(curPage);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("curPage",curPage);
        return "/admin/youhuiquan-list";
    }


    @ResponseBody
    @RequestMapping("/admin1")
    public Map<String,Integer> insert(HttpSession session,String key, Model model){
        int picId = adminService.newpicid();
            Map<String, Integer> maps=new HashMap<String, Integer>();
            String keys="http://ph8kqk6vv.bkt.clouddn.com/"+key.toString();
        adminService.insertimage0(keys,picId);
        System.out.println(keys);

        return  maps;

    }

    @ResponseBody
    @RequestMapping("/youhuifile")
    public Map<String,Integer> youhuifile(HttpSession session,String key, Model model){

        Map<String, Integer> maps=new HashMap<String, Integer>();
        String keys="http://ph8kqk6vv.bkt.clouddn.com/"+key.toString();
        adminService.insertimages(keys);
        System.out.println(keys);

        return  maps;

    }
    @ResponseBody
    @RequestMapping("/admin2")
    public Map<String,Integer> admin2(HttpSession session,String key, Model model){
        int picId = adminService.newpicid();
        Map<String, Integer> maps=new HashMap<String, Integer>();
        String keys="http://ph8kqk6vv.bkt.clouddn.com/"+key.toString();
        adminService.insertimage1(keys,picId);
        System.out.println(keys);


        return  maps;

    }

    @ResponseBody
    @RequestMapping("/admin3")
    public Map<String,Integer> admin3(HttpSession session,String key, Model model){
        int picId = adminService.newpicid();
        Map<String, Integer> maps=new HashMap<String, Integer>();
        String keys="http://ph8kqk6vv.bkt.clouddn.com/"+key.toString();
        adminService.insertimage2(keys,picId);
        System.out.println(keys);


        return  maps;

    }

    @ResponseBody
    @RequestMapping("/admin4")
    public Map<String,Integer> admin4(HttpSession session,String key, Model model){
        int picId = adminService.newpicid();
        Map<String, Integer> maps=new HashMap<String, Integer>();
        String keys="http://ph8kqk6vv.bkt.clouddn.com/"+key.toString();
        adminService.insertimage3(keys,picId);
        System.out.println(keys);


        return  maps;

    }

    @ResponseBody
    @RequestMapping("/admin5")
    public Map<String,Integer> admin5(HttpSession session,String key, Model model){
        int picId = adminService.newpicid();
        Map<String, Integer> maps=new HashMap<String, Integer>();
        String keys="http://ph8kqk6vv.bkt.clouddn.com/"+key.toString();
        adminService.insertimage4(keys,picId);
        System.out.println(keys);


        return  maps;

    }


    @RequestMapping("comment")
    public String comment(Model model){

        List<Evaluate> evaluateList=adminService.selectAllEvaluate();

        for (Evaluate evaluate:evaluateList){
            int goodsId=evaluate.getGoodsId();
//            System.out.println(goodsId);
            Goods goods=orderService.selectGoodsByGoodsId(goodsId);
//            System.out.println(goods);
            evaluate.setGoods(goods);
        }
//        System.out.println(evaluateList);
        model.addAttribute("evaluateList",evaluateList);



        return "/admin/comment";
    }

    @RequestMapping("deleteEvaluate")
    public String deleteEvaluate(HttpServletRequest request){

        System.out.println(request.getParameter("evaluateId"));
        int evaluateId= Integer.parseInt(request.getParameter("evaluateId"));
        adminService.deleteEvaluateByEvaluateId(evaluateId);
        return "forward:/admin/comment";
    }


    @RequestMapping("adminreply")
    public  String adminReply(String evaluateId,Model model){

        int id= Integer.parseInt(evaluateId);
        System.out.println(id);
        Evaluate evaluate=adminService.selectEvaluateById(id);
        System.out.println(evaluate);
        model.addAttribute("evaluate",evaluate);

        return  "/admin/adminreply";
    }

    @RequestMapping("replyuser")
    private String replyUserComment(HttpServletRequest request){

        int evaluateId= Integer.parseInt(request.getParameter("evaluateId"));
        System.out.println(evaluateId);
        String reply=request.getParameter("reply");
        System.out.println(reply);
        adminService.updateReply(reply,evaluateId);


        return "forward:/admin/comment";
    }


    @RequestMapping("jinyan")
    public String jinyan(Integer userId,Integer isJY,Integer curPage,Model model){
        boolean b=adminService.updateJYByUserId(userId,isJY);
        if(b) {
            PageInfo<User> userPageInfo = adminService.getAllUser(curPage);
            model.addAttribute("userPageInfo", userPageInfo);
            model.addAttribute("curPage", curPage);
        }
        return "/admin/member-list";
    }



    @RequestMapping("/adminlogin")
    public String login(String adminId, String adminPwd, Model model) {
        Admin admin=adminService.selectAdmin(adminId,adminPwd);
        if (admin!=null){
            //放到session域,正确的
            model.addAttribute("admin",admin);
            System.out.println("登录成功");
            return  "forward:/admin/index";
        }else {
            //用户名密码错误回显
            System.out.println("登录失败");
            return "/home/login";
        }

    }





}
