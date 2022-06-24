package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.DuoMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/duomai")
public class DuoMaiControl {
    @Autowired
    private DuoMaiService duoMaiService;

    @RequestMapping("/duomai")
    public String duomai(Model model,HttpSession session){
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        Goods selectBy67=duoMaiService.selectBy67();
        Goods selectBy58=duoMaiService.selectBy58();
        Goods selectBy127=duoMaiService.selectBy127();
        Goods selectBy139=duoMaiService.selectBy139();
        Goods selectBy150=duoMaiService.selectBy150();
        Goods selectBy189=duoMaiService.selectBy189();
        Goods selectBy78=duoMaiService.selectBy78();
        Goods selectBy15=duoMaiService.selectBy15();
        Goods selectBy46=duoMaiService.selectBy46();
        model.addAttribute("selectBy67",selectBy67);
        model.addAttribute("selectBy58",selectBy58);
        model.addAttribute("selectBy127",selectBy127);
        model.addAttribute("selectBy139",selectBy139);
        model.addAttribute("selectBy150",selectBy150);
        model.addAttribute("selectBy189",selectBy189);
        model.addAttribute("selectBy78",selectBy78);
        model.addAttribute("selectBy15",selectBy15);
        model.addAttribute("selectBy46",selectBy46);
        return "/多优惠/index";
    }
}
