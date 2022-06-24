package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.CartService;
import com.gem.luoqimalls.service.CollectService;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/collect")
public class CollectControl {

    @Autowired
    private CollectService collectService;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    Date collectDate=new Date();

    @ResponseBody
    @RequestMapping("/insertcollect")
    public Map<String,Integer> collectinsert(HttpSession session, int goodsId, Model model){
        Map<String, Integer> map=new HashMap<String, Integer>();
        System.out.println(goodsId);
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        System.out.println(1);
        Collect collect=collectService.collectselect(userId,goodsId);
        System.out.println(collect);
        if(collect!=null)
        {
            map.put("name", 1);
            System.out.println(map);
            System.out.println("已存在");
//            Integer j=collectService.delcollect(userId,goodsId);
//            JSONObject json =JSONObject.fromObject(map);
            return map;
//            return  "forward:/goods/good";
        }
else
        {
            map.put("name", 0);
            System.out.println(1);
            Integer i=collectService.collectinsert(userId,goodsId,collectDate);
            System.out.println("添加成功");

            return map;
//            return  "forward:/goods/good";
        }

    }


    @RequestMapping("/collectsearch")
    public String search(int userId, Model model,Integer curPage){
        PageInfo<Collect> collectlist=collectService.getCollectgoods(userId,curPage);
        System.out.println(collectlist);
        model.addAttribute("collectlist",collectlist);
        model.addAttribute("userId",userId);
//        System.out.println(glist);
        return "/person/collection";
//
    }




    @ResponseBody
    @RequestMapping("/delcollect")
    public Map<String,Integer> collectdel(HttpSession session, int goodsId, Model model){

        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        maps.put("delcollect", 1);
        Integer myfoot=collectService.delcollect(userId,goodsId);

       return maps;

    }





}
