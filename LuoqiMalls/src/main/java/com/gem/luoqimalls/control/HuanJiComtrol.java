package com.gem.luoqimalls.control;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.gem.luoqimalls.service.HuanJiService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/huanji")
//@SessionAttributes("goods")
@Controller
public class HuanJiComtrol {
    @Autowired
    private HuanJiService service;

    @RequestMapping("/huanji")
    public String huanji(Model model,HttpSession session){
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        ////人气最高(顶部)
        Goods goods=service.getGoodsByGoodsSales();
        Image image=service.getImageByGoodsId(goods.getGoodsId());
        model.addAttribute("goods",goods);
        model.addAttribute("image",image);

        //人气1-6(最高除外)
        Goods goods1=service.getGoodsByGoodsSales1();
        Image image1=service.getImageByGoodsId(goods1.getGoodsId());
        Goods goods2=service.getGoodsByGoodsSales2();
        Image image2=service.getImageByGoodsId(goods2.getGoodsId());
        Goods goods3=service.getGoodsByGoodsSales3();
        Image image3=service.getImageByGoodsId(goods3.getGoodsId());
        Goods goods4=service.getGoodsByGoodsSales4();
        Image image4=service.getImageByGoodsId(goods4.getGoodsId());
        Goods goods5=service.getGoodsByGoodsSales5();
        Image image5=service.getImageByGoodsId(goods5.getGoodsId());
        Goods goods6=service.getGoodsByGoodsSales6();
        Image image6=service.getImageByGoodsId(goods6.getGoodsId());
        model.addAttribute("goods1",goods1);
        model.addAttribute("image1",image1);
        model.addAttribute("goods2",goods2);
        model.addAttribute("image2",image2);
        model.addAttribute("goods3",goods3);
        model.addAttribute("image3",image3);
        model.addAttribute("goods4",goods4);
        model.addAttribute("image4",image4);
        model.addAttribute("goods5",goods5);
        model.addAttribute("image5",image5);
        model.addAttribute("goods6",goods6);
        model.addAttribute("image6",image6);




//    最底部带介绍(打折最高的)
        Goods goodsbottom=service.getGoodsByGoodsDiscount();
        Image imagebottom=service.getImageByGoodsId(goodsbottom.getGoodsId());
        model.addAttribute("goodsbottom",goodsbottom);
        model.addAttribute("imagebottom",imagebottom);







        return "/换季特惠/index.html";
    }
}
