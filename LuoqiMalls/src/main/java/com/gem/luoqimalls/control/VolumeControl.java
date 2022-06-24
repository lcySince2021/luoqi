package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.MyVolume;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.pojo.Volume;
import com.gem.luoqimalls.service.VolumeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/volume")
@Controller
public class VolumeControl {
    @Autowired
    private VolumeService volumeService;

    @ResponseBody
    @RequestMapping("/addvolume")
    public Map<String,Integer> addvolume(HttpSession session,int volumeId,Model model){
        Map<String,Integer> map=new HashMap<String,Integer>();
        System.out.println(volumeId);
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        System.out.println(1);
        MyVolume myVolume=volumeService.selectMyVolune(volumeId,userId);
        System.out.println(myVolume);
        if(myVolume!=null)
        {
            map.put("name",1);
            System.out.println(map);
            System.out.println("无法领取更多优惠");
            return map;
        }else {
            map.put("name",0);
            System.out.println(1);
            List<MyVolume> myVolume1=volumeService.addMyVolume(volumeId,userId);
            System.out.println("成功领取该优惠券");
            return map;
        }
    }

    //查询用户自己的优惠券
    @RequestMapping("/personselectvolume")
    public String personselectvolume(HttpSession session, Model model){
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        List<MyVolume> myVolumeList=volumeService.selectMyVolumeByUserId(userId);
        for (MyVolume myVolume:myVolumeList){
            int volumeId=myVolume.getVolumeId();
            List<Volume> volumeList= volumeService.selectVolumeByVolumeId(volumeId);
            myVolume.setVolumeList(volumeList);
            System.out.println(volumeList);
//            model.addAttribute("volumeList",volumeList);
        }
        model.addAttribute("myVolumeList",myVolumeList);
        System.out.println(myVolumeList);

        return "person/coupon";
    }


    @RequestMapping("/youhui")
    public String youhui(Model model,HttpSession session){
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
//        全部优惠
        List<Volume> volumes= volumeService.selectAllVolume();
        model.addAttribute("volume",volumes);

//        服装优惠
        List<Volume> fuzhuang= volumeService.selectFuZhuan();
        model.addAttribute("fuzhuang",fuzhuang);

//        箱包优惠
        List<Volume> xiangbao= volumeService.selectXiangBao();
        model.addAttribute("xiangbao",xiangbao);

//        配饰优惠
        List<Volume> peishi= volumeService.selectPeiShi();
        model.addAttribute("peishi",peishi);

        return "/优惠券/优惠券";
    }
}
