package com.gem.luoqimalls.control;
import com.gem.luoqimalls.mapper.GoodsIntegerMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Markbuy;
import com.gem.luoqimalls.pojo.Myfoot;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.GoodsIntegerService;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.gem.luoqimalls.service.MarkService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/maskgoods")
@Controller
public class GoodsIntegerControl {
    @Autowired
    private GoodsIntegerService integerService;
    @Autowired
    private MarkService markService;
    @RequestMapping("/integersearch")
    public String search( Model model,Integer curPage,HttpSession session){
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        PageInfo<Goods> integerlist=integerService.getAllIntegerGoods(curPage);
        model.addAttribute("integerlist",integerlist);
//        model.addAttribute("k",key);
        return "/积分/jifenduihuan";

    }
    @RequestMapping("/integersearchByAll")
    public String searchByAll(String name,Integer num1,Integer num2, Model model,Integer curPage){
        if(name!=null&&num1!=null&&num2!=null){
            int num11=num1;
            int num12=num2;
        PageInfo<Goods> integerlist=integerService.getAllIntegerGoodsbyAll(name,num11,num12,curPage);
            model.addAttribute("integerlist",integerlist);
            return "/积分/jifenduihuan";
    }
        if(name!=null&&num1==null&&num2==null){
            PageInfo<Goods> integerlist=integerService.selectonlyname(name,curPage);
            model.addAttribute("integerlist",integerlist);
            return "/积分/jifenduihuan";
        }
        if(name==null&&num1!=null&&num2!=null){
            int num11=num1;
            int num12=num2;
            PageInfo<Goods> integerlist=integerService.selectonlynum(num11,num12,curPage);
            model.addAttribute("integerlist",integerlist);
            return "/积分/jifenduihuan";
        }
        if(name==null&&num1!=null&&num2==null){
            int num11=num1;

            PageInfo<Goods> integerlist=integerService.selectonlynum1(num11,curPage);
            model.addAttribute("integerlist",integerlist);
            return "/积分/jifenduihuan";
        }
        if(name==null&&num1==null&&num2!=null){

            int num12=num2;
            PageInfo<Goods> integerlist=integerService.selectonlynum2(num12,curPage);
            model.addAttribute("integerlist",integerlist);
            return "/积分/jifenduihuan";
        }





        return "/积分/jifenduihuan";

    }


    @ResponseBody
    @RequestMapping("/markbuy")
    public Map<String,Integer> numup(HttpSession session, int goodsId, Model model){
        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        System.out.println(userId);
        System.out.println(goodsId);
        maps.put("insertcart", 1);
//        Integer i=cartService.cartupdate(userId,goodsId);
        return  maps;
    }

    @RequestMapping("/markhavebuy")
    public String markbuy(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        List<Markbuy> markbuy=markService.selectmarkbuy(userId);
        System.out.println(markbuy);
        for(Markbuy s:markbuy)
        {
            s.getGoodsId();
            s.getGoods();
        }
        model.addAttribute("markbuys",markbuy);

//        System.out.println(glist);
        return "/积分/jifenmingxi";
//
    }



}
