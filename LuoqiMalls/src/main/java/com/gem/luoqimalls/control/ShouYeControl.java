package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import com.gem.luoqimalls.pojo.Volume;
import com.gem.luoqimalls.service.HuanJiService;
import com.gem.luoqimalls.service.ShouYeSearchService;
import com.gem.luoqimalls.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shouye")
public class ShouYeControl {
    @Autowired
    private VolumeService volumeService;

    @Autowired
    private HuanJiService service;

    @Autowired
    private ShouYeSearchService shouYeSearchService;

    @RequestMapping("remai")
    public String remai(Model model){

//        发现好货
        List<Goods> selectVolume4=shouYeSearchService.selectGoodsLimit4();
//        List<String> volume=selectVolume4[0];
        model.addAttribute("selectVolume4",selectVolume4);
//        System.out.println(selectVolume4);

//        优惠券跳转
        List<Volume> mainvolume3=volumeService.mainSelectVolumeLimit3();
        model.addAttribute("mainvolume3",mainvolume3);

//        热卖榜
        Goods goods1=service.getGoodsByGoodsSales1();
        Image image1=service.getImageByGoodsId(goods1.getGoodsId());
        Goods goods2=service.getGoodsByGoodsSales2();
        Image image2=service.getImageByGoodsId(goods2.getGoodsId());
        Goods goods3=service.getGoodsByGoodsSales3();
        Image image3=service.getImageByGoodsId(goods3.getGoodsId());
        model.addAttribute("goods1",goods1);
        model.addAttribute("image1",image1);
        model.addAttribute("goods2",goods2);
        model.addAttribute("image2",image2);
        model.addAttribute("goods3",goods3);
        model.addAttribute("image3",image3);
        return "/w1/index";
    }

}
