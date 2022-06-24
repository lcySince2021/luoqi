package com.gem.luoqimalls.control;

import com.gem.luoqimalls.mapper.MiaoShaMapper;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.Image;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.pojo.Volume;
import com.gem.luoqimalls.service.MiaoShaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("miaosha")
@Controller
public class MiaoShaControl {
    @Autowired
    private MiaoShaService miaoShaService;

    @RequestMapping("/miaosha")
    public String youhui(Model model,HttpSession session){
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
//        List<Goods> goods=miaoShaService.selectMiaoSha();
//        model.addAttribute("goods",goods);
        //男装
        List<Goods> nanzhuang=miaoShaService.selectGoodsAndImages();
        model.addAttribute("nanzhuang",nanzhuang);
        //女装
        List<Goods> nvzhuang=miaoShaService.selectGoodsAndImagesNvZhuang();
        model.addAttribute("nvzhuang",nvzhuang);
        //鞋
        List<Goods> xie=miaoShaService.selectGoodsAndImagesXie();
        model.addAttribute("xie",xie);
        //童装
        List<Goods> tongzhuang=miaoShaService.selectGoodsAndImagesTongZhuang();
        model.addAttribute("tongzhuang",tongzhuang);
        //箱包
        List<Goods> xiangbao=miaoShaService.selectGoodsAndImagesXiangBao();
        model.addAttribute("xiangbao",xiangbao);
        //睡衣
        List<Goods> shuiyi=miaoShaService.selectGoodsAndImagesShuiYi();
        model.addAttribute("shuiyi",shuiyi);
        //配饰
        List<Goods> peishi=miaoShaService.selectGoodsAndImagesPeiShi();
        model.addAttribute("peishi",peishi);
//        try{
//            if (goods.size()!=0) {
//                int goodsId = 0;
//                for (int i = 0; i < goods.size(); i++) {
//                    Goods goods1 = goods.get(i);
//                    goodsId = goods1.getGoodsId();
//                    System.out.println(goodsId);
//                    List<Image> images=miaoShaService.selectImageByGoodsId(goodsId);
//                    model.addAttribute("image",images);
//                    System.out.println(images);
//                }
//            }else {
//            }
//        }catch (Exception ec){
//        }
//        List<Image> images=miaoShaService.selectImageByGoodsId();
//        System.out.println(images);
//        model.addAttribute("goods",goods);
//        model.addAttribute("image",images);
//        List<Volume> volumes= volumeService.selectAllVolume();
//        model.addAttribute("volume",volumes);
        return "/秒杀/秒杀";
    }
}
