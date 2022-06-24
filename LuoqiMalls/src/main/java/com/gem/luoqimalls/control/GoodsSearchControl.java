package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.Evaluate;
import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.gem.luoqimalls.service.PingJiaService;
import com.gem.luoqimalls.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/goods")
@Controller
public class GoodsSearchControl {
    @Autowired
    private GoodsSearchService searchService;
    @Autowired
    private PingJiaService service;
    @Autowired
    private UserService userService;

    @RequestMapping("/search")
    public String search(String key, Model model, Integer curPage,HttpSession session) {
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        PageInfo<Goods> glist = searchService.getAllGoodsByKey(key, curPage);
        System.out.println(glist);
        String[] biandId = searchService.getBrandId();
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2();
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("k", key);
        model.addAttribute("biandId", biandId);
//        System.out.println(glist);
        return "/home/search";

    }
    @RequestMapping("/huodong")
    public String huodong(Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        PageInfo<Goods> glist = searchService.getAllGoodsById_2(curPage);
        String[] biandId = searchService.getBrandId();
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2();
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("biandId", biandId);
//        System.out.println(glist);
        return "/home/search8";

    }
    @RequestMapping("/huodong1")
    public String huodong1(Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        PageInfo<Goods> glist = searchService.getAllGoodsorderByTime(curPage);
        String[] biandId = searchService.getBrandId();
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2();
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("biandId", biandId);
//        System.out.println(glist);
        return "/home/search8";

    }

    @RequestMapping("/heart")
    public String heart() {
        return "/home/heart";
    }

    @RequestMapping("/heart1")
    public String heart1() {
        return "/home/heart1";
    }


    @RequestMapping("/good")
    public String good(int goodsId, Model model,Integer curPage,HttpSession session) {
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        User user= (User) session.getAttribute("user");
                                                                                                                                               int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Goods good = searchService.getGoodsById(goodsId);
        Integer id_1=searchService.getId_1BygoodsId(goodsId);
        Integer id_2=searchService.getId_2BygoodsId(goodsId);
        List<Goods> goods=searchService.getLikeGoodsById_1(id_1);
        List<Goods> goodsList=searchService.getLikeGoodsById_2(id_2);
        String className1=searchService.getClassName1Byid(id_1);
        String claasName2=searchService.getClassName2Byid(id_2);
        PageInfo<Evaluate> evaluatePageInfo=service.getAllEvaluateByGoodsId(goodsId,curPage);
        PageInfo<Evaluate> evaluatePageInfo1=service.getAllGoodsEvaluateByGoodsId(goodsId,curPage);
        PageInfo<Evaluate> evaluatePageInfo2=service.getAllBadEvaluateByGoodsId(goodsId,curPage);
        model.addAttribute("evaluatePageInfo",evaluatePageInfo);
        model.addAttribute("evaluatePageInfo1",evaluatePageInfo1);
        model.addAttribute("evaluatePageInfo2",evaluatePageInfo2);
        model.addAttribute("className1",className1);
        model.addAttribute("className2",claasName2);
        model.addAttribute("goods",goods);
        model.addAttribute("goodsList",goodsList);
        model.addAttribute("good", good);
        return "/home/introduction";

    }

    @RequestMapping("/initgood")
    public String initgood(int goodsId, Model model,Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Goods good = searchService.getGoodsById(goodsId);
        Integer id_1=searchService.getId_1BygoodsId(goodsId);
        Integer id_2=searchService.getId_2BygoodsId(goodsId);
        List<Goods> goods=searchService.getLikeGoodsById_1(id_1);
        List<Goods> goodsList=searchService.getLikeGoodsById_2(id_2);
        String className1=searchService.getClassName1Byid(id_1);
        String claasName2=searchService.getClassName2Byid(id_2);
        PageInfo<Evaluate> evaluatePageInfo=service.getAllEvaluateByGoodsId(goodsId,curPage);
        PageInfo<Evaluate> evaluatePageInfo1=service.getAllGoodsEvaluateByGoodsId(goodsId,curPage);
        PageInfo<Evaluate> evaluatePageInfo2=service.getAllBadEvaluateByGoodsId(goodsId,curPage);
        model.addAttribute("evaluatePageInfo",evaluatePageInfo);
        model.addAttribute("evaluatePageInfo1",evaluatePageInfo1);
        model.addAttribute("evaluatePageInfo2",evaluatePageInfo2);
        model.addAttribute("className1",className1);
        model.addAttribute("className2",claasName2);
        model.addAttribute("goods",goods);
        model.addAttribute("goodsList",goodsList);
        model.addAttribute("good", good);


        return "/home/initgood";

    }

    @RequestMapping("/search1")
    public String search1(String p, Model model, Integer curPage,HttpSession session) {
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1(id_1, curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1(id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("brandId", brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        return "/home/search1";
    }

    @RequestMapping("/search2")
    public String search2(String p, String s, Integer curPage, Model model,HttpSession session) {
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService.getId_2ByClassName2(s, id_1);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndId_2(id_1, id_2, curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1AndId_2(id_1,id_2);
        model.addAttribute("biandId",brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("s", s);
        return "/home/search2";
    }

    @RequestMapping("/search3")
    public String search3(String p, String ss, Integer curPage, Model model,HttpSession session) {
        if((User) session.getAttribute("user")==null)
        { int ww=25;
            model.addAttribute("ww", ww);
            return "/home/login";
        }
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndBrandId(id_1, curPage, ss);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        return "/home/search3";
    }

    @RequestMapping("/search4")
    public String search4(String key, Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        PageInfo<Goods> glist = searchService.getAllGoodsByKeyOrderByPrice(key, curPage);
        System.out.println(glist);
        String[] biandId = searchService.getBrandId();
        List<Goods> goods = searchService.getGoodsRandom();
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("k", key);
        model.addAttribute("biandId", biandId);
//        System.out.println(glist);
        return "/home/search";
    }
    @RequestMapping("/search5")
    public String search5(String key, Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        PageInfo<Goods> glist = searchService.getAllGoodsByKeyOrderByGCommentCount(key, curPage);
        System.out.println(glist);
        String[] biandId = searchService.getBrandId();
        List<Goods> goods = searchService.getGoodsRandom();
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("k", key);
        model.addAttribute("biandId", biandId);
//        System.out.println(glist);
        return "/home/search";
    }
    @RequestMapping("/search6")
    public String search6(String key, Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        PageInfo<Goods> glist = searchService.getAllGoodsByKeyOrderByGoodsCreateDate(key, curPage);
        System.out.println(glist);
        String[] biandId = searchService.getBrandId();
        List<Goods> goods = searchService.getGoodsRandom();
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("k", key);
        model.addAttribute("biandId", biandId);
//        System.out.println(glist);
        return "/home/search";
    }

    @RequestMapping("/search7")
    public String search7(String p, Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1OrderByPrice(id_1,curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1(id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("brandId", brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        return "/home/search1";
    }
    @RequestMapping("/search8")
    public String search8(String p, Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1OrderByGCommentCount(id_1,curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1(id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("brandId", brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        return "/home/search1";
    }
    @RequestMapping("/search9")
    public String search9(String p, Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1OrderByGoodsCreateDate(id_1,curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1(id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("brandId", brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        return "/home/search1";
    }

    @RequestMapping("/search10")
    public String search10(String p, String s, Integer curPage, Model model,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService.getId_2ByClassName2(s, id_1);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndId_2OrderByPrice(id_1,id_2,curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1AndId_2(id_1,id_2);
        model.addAttribute("biandId",brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("s", s);
        return "/home/search2";
    }
    @RequestMapping("/search11")
    public String search11(String p, String s, Integer curPage, Model model,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService.getId_2ByClassName2(s, id_1);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndId_2OrderByGCommentCount(id_1,id_2,curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1AndId_2(id_1,id_2);
        model.addAttribute("biandId",brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("s", s);
        return "/home/search2";
    }
    @RequestMapping("/search12")
    public String search12(String p, String s, Integer curPage, Model model,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService.getId_2ByClassName2(s, id_1);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndId_2OrderByGoodsCreateDate(id_1,id_2,curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1AndId_2(id_1,id_2);
        model.addAttribute("biandId",brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("s", s);
        return "/home/search2";
    }

    @RequestMapping("/search13")
    public String search13(String p, String ss, Integer curPage, Model model,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndBrandIdOrderByPrice(id_1,curPage,ss);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        return "/home/search3";
    }
    @RequestMapping("/search14")
    public String search14(String p, String ss, Integer curPage, Model model,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndBrandIdOrderByGCommentCount(id_1,curPage,ss);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        return "/home/search3";
    }
    @RequestMapping("/search15")
    public String search15(String p, String ss, Integer curPage, Model model,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndBrandIdOrderByGoodsCreateDate(id_1,curPage,ss);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        return "/home/search3";
    }


    @RequestMapping("/search16")
    public String search16(String key, Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        PageInfo<Goods> glist = searchService.getAllGoodsByKeyOrderByAll(key,curPage);
        System.out.println(glist);
        String[] biandId = searchService.getBrandId();
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2();
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("k", key);
        model.addAttribute("biandId", biandId);
        return "/home/search";

    }

    @RequestMapping("/search18")
    public String search18(String p, String s, Integer curPage, Model model,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService.getId_2ByClassName2(s, id_1);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndId_2OrderByAll(id_1,id_2,curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1AndId_2(id_1,id_2);
        model.addAttribute("biandId",brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("s", s);
        return "/home/search2";
    }

    @RequestMapping("/search17")
    public String search17(String p, Model model, Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1OrderByAll(id_1,curPage);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] brandId=searchService.getBrandIdById_1(id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("brandId", brandId);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        return "/home/search1";
    }

    @RequestMapping("/search19")
    public String search19(String p, String ss, Integer curPage, Model model,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Integer id_1 = searchService.getId_1ByClassName1(p);
        PageInfo<Goods> glist = searchService.getAllGoodsById_1AndBrandIdOrderByAll(id_1,curPage,ss);
        List<Goods> goods = searchService.getGoodsRandom();
        String[] className2=searchService.getClassName2ById_1(id_1);
        model.addAttribute("className2",className2);
        model.addAttribute("rgoods", goods);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        return "/home/search3";
    }



    @RequestMapping("/youhuigood")
    public String youhuigood(int goodsId, Model model,Integer curPage,HttpSession session) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int usercartnum=userService.usercartnum(userId);

        model.addAttribute("usercartnum",usercartnum);
        Goods good = searchService.getGoodsById(goodsId);
        Integer id_1=searchService.getId_1BygoodsId(goodsId);
        Integer id_2=searchService.getId_2BygoodsId(goodsId);
        List<Goods> goods=searchService.getLikeGoodsById_1(id_1);
        List<Goods> goodsList=searchService.getLikeGoodsById_2(id_2);
        String className1=searchService.getClassName1Byid(id_1);
        String claasName2=searchService.getClassName2Byid(id_2);
        PageInfo<Evaluate> evaluatePageInfo=service.getAllEvaluateByGoodsId(goodsId,curPage);
        PageInfo<Evaluate> evaluatePageInfo1=service.getAllGoodsEvaluateByGoodsId(goodsId,curPage);
        PageInfo<Evaluate> evaluatePageInfo2=service.getAllBadEvaluateByGoodsId(goodsId,curPage);
        model.addAttribute("evaluatePageInfo",evaluatePageInfo);
        model.addAttribute("evaluatePageInfo1",evaluatePageInfo1);
        model.addAttribute("evaluatePageInfo2",evaluatePageInfo2);
        model.addAttribute("className1",className1);
        model.addAttribute("className2",claasName2);
        model.addAttribute("goods",goods);
        model.addAttribute("goodsList",goodsList);
        model.addAttribute("good", good);
        return "/home/introductions";

    }
















}
