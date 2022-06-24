package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.Goods;
import com.gem.luoqimalls.pojo.GoodsSearch;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.gem.luoqimalls.service.GoodsSearchService1;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/goods1")
@Controller
public class GoodsSearchControl1 {
    @Autowired
    private GoodsSearchService1 searchService1;
    @Autowired
    private GoodsSearchService searchService;

    @RequestMapping("/search")
    public String search(String b, String zl, String price, Integer curPage, Model model,String key){
        Double minPrice=null;
        Double maxPrice=null;
        if(price.equals("100以下")){
            minPrice=0.0;
            maxPrice=100.0;
        }
        if (price.equals("100-200")){
            minPrice=100.0;
            maxPrice=200.0;
        }
        if(price.equals("200以上")) {
            minPrice=200.0;
            maxPrice=1000.0;
        }
        String bb=searchService1.getBrandId(b);
        Integer id_2=searchService1.getId_2ByBrandId(zl);
        GoodsSearch goodsSearch=new GoodsSearch(bb,id_2,minPrice,maxPrice,key);
        String[] biandId=searchService.getBrandId();
        String[] className2=searchService.getClassName2();
        List<Goods> rgood=searchService.getGoodsRandom();
        PageInfo<Goods> glist=searchService1.getAllGoods(goodsSearch,curPage);
        model.addAttribute("biandId",biandId);
        model.addAttribute("className2",className2);
        model.addAttribute("rgood",rgood);
        model.addAttribute("glist",glist);
        model.addAttribute("k",key);
        model.addAttribute("b",b);
        model.addAttribute("zl",zl);
        model.addAttribute("price",price);
        return "/home/search4";
    }
    @RequestMapping("/search1")
    public String search1(String b, String zl, String price, Integer curPage, Model model,String key){
        Double minPrice=null;
        Double maxPrice=null;
        if(price.equals("100以下")){
            minPrice=0.0;
            maxPrice=100.0;
        }
        if (price.equals("100-200")){
            minPrice=100.0;
            maxPrice=200.0;
        }
        if(price.equals("200以上")) {
            minPrice=200.0;
            maxPrice=1000.0;
        }
        String bb=searchService1.getBrandId(b);
        Integer id_2=searchService1.getId_2ByBrandId(zl);
        GoodsSearch goodsSearch=new GoodsSearch(bb,id_2,minPrice,maxPrice,key);
        String[] biandId=searchService.getBrandId();
        String[] className2=searchService.getClassName2();
        List<Goods> rgood=searchService.getGoodsRandom();
        PageInfo<Goods> glist=searchService1.getAllGoodsOrderByAll(goodsSearch,curPage);
        model.addAttribute("biandId",biandId);
        model.addAttribute("className2",className2);
        model.addAttribute("rgood",rgood);
        model.addAttribute("glist",glist);
        model.addAttribute("k",key);
        model.addAttribute("b",b);
        model.addAttribute("zl",zl);
        model.addAttribute("price",price);
        return "/home/search4";
    }
    @RequestMapping("/search2")
    public String search2(String b, String zl, String price, Integer curPage, Model model,String key){
        Double minPrice=null;
        Double maxPrice=null;
        if(price.equals("100以下")){
            minPrice=0.0;
            maxPrice=100.0;
        }
        if (price.equals("100-200")){
            minPrice=100.0;
            maxPrice=200.0;
        }
        if(price.equals("200以上")) {
            minPrice=200.0;
            maxPrice=1000.0;
        }
        String bb=searchService1.getBrandId(b);
        Integer id_2=searchService1.getId_2ByBrandId(zl);
        GoodsSearch goodsSearch=new GoodsSearch(bb,id_2,minPrice,maxPrice,key);
        String[] biandId=searchService.getBrandId();
        String[] className2=searchService.getClassName2();
        List<Goods> rgood=searchService.getGoodsRandom();
        PageInfo<Goods> glist=searchService1.getAllGoodsOrderByGoodsPrice(goodsSearch,curPage);
        model.addAttribute("biandId",biandId);
        model.addAttribute("className2",className2);
        model.addAttribute("rgood",rgood);
        model.addAttribute("glist",glist);
        model.addAttribute("k",key);
        model.addAttribute("b",b);
        model.addAttribute("zl",zl);
        model.addAttribute("price",price);
        return "/home/search4";
    }
    @RequestMapping("/search3")
    public String search3(String b, String zl, String price, Integer curPage, Model model,String key){
        Double minPrice=null;
        Double maxPrice=null;
        if(price.equals("100以下")){
            minPrice=0.0;
            maxPrice=100.0;
        }
        if (price.equals("100-200")){
            minPrice=100.0;
            maxPrice=200.0;
        }
        if(price.equals("200以上")) {
            minPrice=200.0;
            maxPrice=1000.0;
        }
        String bb=searchService1.getBrandId(b);
        Integer id_2=searchService1.getId_2ByBrandId(zl);
        GoodsSearch goodsSearch=new GoodsSearch(bb,id_2,minPrice,maxPrice,key);
        String[] biandId=searchService.getBrandId();
        String[] className2=searchService.getClassName2();
        List<Goods> rgood=searchService.getGoodsRandom();
        PageInfo<Goods> glist=searchService1.getAllGoodsOrderBygGoodsComment(goodsSearch,curPage);
        model.addAttribute("biandId",biandId);
        model.addAttribute("className2",className2);
        model.addAttribute("rgood",rgood);
        model.addAttribute("glist",glist);
        model.addAttribute("k",key);
        model.addAttribute("b",b);
        model.addAttribute("zl",zl);
        model.addAttribute("price",price);
        return "/home/search4";
    }
    @RequestMapping("/search4")
    public String search4(String b, String zl, String price, Integer curPage, Model model,String key){
        Double minPrice=null;
        Double maxPrice=null;
        if(price.equals("100以下")){
            minPrice=0.0;
            maxPrice=100.0;
        }
        if (price.equals("100-200")){
            minPrice=100.0;
            maxPrice=200.0;
        }
        if(price.equals("200以上")) {
            minPrice=200.0;
            maxPrice=1000.0;
        }
        String bb=searchService1.getBrandId(b);
        Integer id_2=searchService1.getId_2ByBrandId(zl);
        GoodsSearch goodsSearch=new GoodsSearch(bb,id_2,minPrice,maxPrice,key);
        String[] biandId=searchService.getBrandId();
        String[] className2=searchService.getClassName2();
        List<Goods> rgood=searchService.getGoodsRandom();
        PageInfo<Goods> glist=searchService1.getAllGoodsOrderByGoodsCreateDate(goodsSearch,curPage);
        model.addAttribute("biandId",biandId);
        model.addAttribute("className2",className2);
        model.addAttribute("rgood",rgood);
        model.addAttribute("glist",glist);
        model.addAttribute("k",key);
        model.addAttribute("b",b);
        model.addAttribute("zl",zl);
        model.addAttribute("price",price);
        return "/home/search4";
    }

    @RequestMapping("/search5")
    public String search5(String b, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1(id_1);
        String[] className2 = searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search5";
    }
    @RequestMapping("/search6")
    public String search6(String b, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1(id_1);
        String[] className2 = searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1OrderByAll(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search5";
    }
    @RequestMapping("/search7")
    public String search7(String b, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1(id_1);
        String[] className2 = searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1OrderByGoodsPrice(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search5";
    }
    @RequestMapping("/search8")
    public String search8(String b, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1(id_1);
        String[] className2 = searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1OrderBygGoodsComment(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search5";
    }
    @RequestMapping("/search9")
    public String search9(String b, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1(id_1);
        String[] className2 = searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1OrderByGoodsCreateDate(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search5";
    }
    @RequestMapping("/search10")
    public String search10(String b, String s, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(s, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1AndId_2(id_1,id_2);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndId_2(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("s", s);
        model.addAttribute("price", price);
        return "/home/search6";
    }

    @RequestMapping("/search11")
    public String search11(String b, String s, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(s, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1AndId_2(id_1,id_2);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndId_2OrderByAll(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("s", s);
        model.addAttribute("price", price);
        return "/home/search6";
    }
    @RequestMapping("/search12")
    public String search12(String b, String s, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(s, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1AndId_2(id_1,id_2);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndId_2OrderByGoodsPrice(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("s", s);
        model.addAttribute("price", price);
        return "/home/search6";
    }
    @RequestMapping("/search13")
    public String search13(String b, String s, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(s, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1AndId_2(id_1,id_2);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndId_2OrderBygGoodsComment(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("s", s);
        model.addAttribute("price", price);
        return "/home/search6";
    }
    @RequestMapping("/search14")
    public String search14(String b, String s, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        String bb = searchService1.getBrandId(b);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(s, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(bb, id_2, minPrice, maxPrice, id_1);
        String[] biandId = searchService.getBrandIdById_1AndId_2(id_1,id_2);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndId_2OrderByGoodsCreateDate(goodsSearch, curPage);
        model.addAttribute("biandId", biandId);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("b", b);
        model.addAttribute("s", s);
        model.addAttribute("price", price);
        return "/home/search6";
    }

    @RequestMapping("/search15")
    public String search15(String ss, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(ss, id_2, minPrice, maxPrice, id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndClassName2(goodsSearch, curPage);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search7";
    }

    @RequestMapping("/search16")
    public String search16(String ss, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(ss, id_2, minPrice, maxPrice, id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndClassName2OrderByAll(goodsSearch, curPage);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search7";
    }
    @RequestMapping("/search17")
    public String search17(String ss, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(ss, id_2, minPrice, maxPrice, id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndClassName2OrderByGoodsPrice(goodsSearch, curPage);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search7";
    }
    @RequestMapping("/search18")
    public String search18(String ss, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(ss, id_2, minPrice, maxPrice, id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndClassName2OrderBygGoodsComment(goodsSearch, curPage);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search7";
    }
    @RequestMapping("/search19")
    public String search19(String ss, String zl, String price, Integer curPage, Model model,String p) {
        Double minPrice = null;
        Double maxPrice = null;
        if (price.equals("100以下")) {
            minPrice = 0.0;
            maxPrice = 100.0;
        }
        if (price.equals("100-200")) {
            minPrice = 100.0;
            maxPrice = 200.0;
        }
        if (price.equals("200以上")) {
            minPrice = 200.0;
            maxPrice = 1000.0;
        }
        Integer id_1 = searchService.getId_1ByClassName1(p);
        Integer id_2 = searchService1.getId_2ByClassName2AndId_1(zl, id_1);
        GoodsSearch goodsSearch = new GoodsSearch(ss, id_2, minPrice, maxPrice, id_1);
        String[] className2=searchService.getClassName2ById_1(id_1);
        List<Goods> rgood = searchService.getGoodsRandom();
        PageInfo<Goods> glist = searchService1.getAllGoodsById_1AndClassName2OrderByGoodsCreateDate(goodsSearch, curPage);
        model.addAttribute("className2", className2);
        model.addAttribute("rgood", rgood);
        model.addAttribute("glist", glist);
        model.addAttribute("p", p);
        model.addAttribute("ss", ss);
        model.addAttribute("zl", zl);
        model.addAttribute("price", price);
        return "/home/search7";
    }

}
