package com.gem.luoqimalls.control;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gem.luoqimalls.pojo.Collect;
import com.gem.luoqimalls.pojo.Myfoot;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.CollectService;
import com.gem.luoqimalls.service.FootService;
import com.github.pagehelper.PageInfo;
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
@RequestMapping("/foot")
public class FootControl {

    @Autowired
    private FootService footService;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    Date footdate=new Date();

//增加足迹，若已经浏览过，则更新时间
@ResponseBody
    @RequestMapping("/insertfoot")
    public Map<String,Integer> footinsert(HttpSession session, int goodsId, Model model){

    Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
    maps.put("goods", 1);
        Myfoot myfoot=footService.footselect(userId,goodsId);
    System.out.println(footdate);
        if(myfoot!=null)
        {

            System.out.println("更新");
            Integer i=footService.footupdate(userId,goodsId,footdate);
            return maps;
        }
else
        {
            Integer j=footService.footinsert(userId,goodsId,footdate);
                    System.out.println("添加成功");
            return  maps;
        }

    }


    @RequestMapping("/getfoot")
    public String getfoot(int userId, Model model){
        List<Myfoot> myfoots=footService.getfoot(userId);

        model.addAttribute("myfoots",myfoots);
//        System.out.println(glist);
        return "/person/foot";
//
    }


    @RequestMapping("/bottom")
    private  String bottom(){


        return "/bottom/index";
    }







}
