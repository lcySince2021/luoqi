package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.Cart;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.CartService;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.gem.luoqimalls.service.GoodsService;
import com.gem.luoqimalls.service.UserService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/cart")
public class CartControl {

    @Autowired
    private CartService cartService;
    @Autowired
    private GoodsSearchService searchService;


    @ResponseBody
    @RequestMapping("/insertcart")
    public Map<String,Integer> insert(HttpSession session, int goodsId, Model model){
        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        maps.put("insertcart", 1);
        Cart cart=cartService.cartselect(userId,goodsId);
        if(cart!=null)
        {
            Integer i=cartService.cartupdate(userId,goodsId);
            System.out.println("修改成功");

        }
else
        {
            Integer i=cartService.cartinsert(userId,goodsId);
            System.out.println("添加成功");

        }
        return  maps;

    }

    @RequestMapping("/search")
    public String search(int userId, Model model,Integer curPage){
        List<Cart> cartnum=cartService.getcartnum(userId);
//        PageInfo<Goods> cartlist=cartService.getcartgoods(userId,curPage);
//        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartnum",cartnum);
        System.out.println(cartnum);
        return "/home/shopcart";
    }

    @RequestMapping("/deletecart")
    public String delcart(int userId,int goodsId, Model model)
    {
Integer p=cartService.deletecart(userId,goodsId);
        System.out.println(214);
        return "forward:/cart/search";
    }



    @ResponseBody
    @RequestMapping("/numup")
    public Map<String,Integer> numup(HttpSession session, int goodsId, Model model){
        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        System.out.println(userId);
        System.out.println(goodsId);
        maps.put("insertcart", 1);
        Integer i=cartService.cartupdate(userId,goodsId);
        return  maps;
    }
    @ResponseBody
    @RequestMapping("/numdown")
    public Map<String,Integer> numdown(HttpSession session, int goodsId, Model model){
        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");

        int userId=user.getUserId();
        Integer x=cartService.numselect(userId,goodsId);
        if(x>=2)
        {
        maps.put("orders", 1);
        Integer i=cartService.cartupdatedown(userId,goodsId);
        }
        return  maps;
    }








}
