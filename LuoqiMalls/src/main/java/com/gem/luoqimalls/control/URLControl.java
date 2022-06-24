package com.gem.luoqimalls.control;
import com.gem.luoqimalls.pojo.Volume;
import com.gem.luoqimalls.service.VolumeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

@RequestMapping("url")
@Controller
public class URLControl {
    @Autowired
    private VolumeService volumeService;


    @RequestMapping("miaosha")
    public String miaosha(){
        return "/秒杀/秒杀";
    }
    @RequestMapping("duomai")
    public String duomai(){
        return "/多优惠/index";
    }
    @RequestMapping("huanji")
    public String huanji(){
        return "/换季特惠/index";
    }
    @RequestMapping("jifen")
    public String jifen(){
        return "/积分/jifenduihuan";
    }
    @RequestMapping("youhuiquan")
    public String youhuiquan(){
        return "/优惠券/优惠券";
    }
    @RequestMapping("huiyuanhuikuan")
    public String huiyuanhuikuan(){
        return "/会员付款/index";
    }
    @RequestMapping("remai1")
    public String remai1(){
        return "/样式/index";
    }
    @RequestMapping("coupon")
    public String coupon(){
        return "/person/coupon";
    }
    @RequestMapping("dibu")
    public String dibu(){
        return "/底部/down";
    }




}
