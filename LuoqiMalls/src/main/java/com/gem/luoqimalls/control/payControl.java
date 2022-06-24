package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.CartService;
import com.gem.luoqimalls.service.GoodsSearchService;
import com.gem.luoqimalls.service.OrderService;
import com.gem.luoqimalls.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pay")
public class payControl {
    @Autowired
    private PayService payService;
    @Autowired
    private OrderService orderService;
// 根据userid地址
//根据订单编号看对应订单
@RequestMapping("/pay")
public String pay(int orderNum, HttpSession session,Model model){
    System.out.println(orderNum);
    User user= (User) session.getAttribute("user");
    int userId=user.getUserId();
    int orderid=payService.userIdselectByid(orderNum);
    List<Integer> vomids=payService.selectvolumeid(userId);

    System.out.println(orderid);
//    所对编号的订单
    List<OrderDetails> orderDetailsList=payService.selectOrderDetailsByOrderId(orderid);
    Address address=payService.selectAddressByUserId(userId);
    List<Address> addressList=payService.selectAllAddressByUserId(userId);
    List<Volume> volumes=new ArrayList<>();
    getId sums=new getId();
    double sum=0;
   for(OrderDetails orders:orderDetailsList)
   {
       sum+=orders.getAllGoodsLastPrice();
   }
   sums.setSum(sum);
    System.out.println(233);
    System.out.println(vomids);
    for(Integer vs:vomids)
    {
        int v=vs;
        System.out.println(1);
        System.out.println(v);

        Volume volume=payService.selectvolume(v);
        System.out.println(volume);
        System.out.println(2);
        System.out.println(sum);
        if(volume.gethMoneys()<sum)
        {
          volumes.add(volume);
        }
    }
    model.addAttribute("volumes",volumes);
    model.addAttribute("address",address);
    model.addAttribute("sums",sums);

    model.addAttribute("addressList",addressList);
    model.addAttribute("orderDetailsList",orderDetailsList);
//    model.addAttribute("cartnum",cartnum);
//    System.out.println(cartnum);
    return "/home/pay";
}



    @ResponseBody
    @RequestMapping("/paymoney")
    public Map<String,Integer> paymoney(HttpSession session, int volumeId,int orderId, Model model){
        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        System.out.println(orderId);
        System.out.println(volumeId);
        Address address=payService.selectAddressByUserId(userId);
        payService.deletevolume(userId,volumeId);
        System.out.println(address.getAddressId());
        payService.ordersetaddress(address.getAddressId(),userId,orderId,volumeId);
        Order orders=payService.OrderByOrderId(orderId);
        maps.put("orderIds", orderId);
        return  maps;


    }



    @RequestMapping("/pays")
    public String pays(int orderNum, HttpSession session,Model model){
        System.out.println(orderNum);
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int orderid=payService.userIdselectByid(orderNum);

        List<OrderDetails> orderDetailsList=payService.selectOrderDetailsByOrderId(orderid);
        Address address=payService.selectAddressByUserId(userId);
        List<Address> addressList=payService.selectAllAddressByUserId(userId);
//        数量
        int ordernum=payService.thisordernum(orderid);
//        商品id
        int ordergoodsid=payService.thisgoodsid(orderid);
        //商品积分
        int ordergoodsint=payService.thisgoodsint(ordergoodsid);
      int sums=ordernum*ordergoodsint;




        model.addAttribute("address",address);
        model.addAttribute("sums",sums);

        model.addAttribute("addressList",addressList);
        model.addAttribute("orderDetailsList",orderDetailsList);
//    model.addAttribute("cartnum",cartnum);
//    System.out.println(cartnum);
        return "/home/pays";
    }


    @RequestMapping("/huipay")
    public String huipay(int orderNum, HttpSession session,Model model){
        System.out.println(orderNum);
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int orderid=payService.userIdselectByid(orderNum);
        List<Integer> vomids=payService.selectvolumeid(userId);

        System.out.println(orderid);
//    所对编号的订单
        List<OrderDetails> orderDetailsList=payService.selectOrderDetailsByOrderId(orderid);
        Address address=payService.selectAddressByUserId(userId);
        List<Address> addressList=payService.selectAllAddressByUserId(userId);
        List<Volume> volumes=new ArrayList<>();
        getId sums=new getId();
        double sum=0;
        for(OrderDetails orders:orderDetailsList)
        {
            sum+=orders.getAllGoodsLastPrice();
        }
        double sumx=sum*0.8;
        sums.setSum(sumx);
        System.out.println(233);
        System.out.println(vomids);
        for(Integer vs:vomids)
        {
            int v=vs;
            System.out.println(1);
            System.out.println(v);

            Volume volume=payService.selectvolume(v);
            System.out.println(volume);
            System.out.println(2);
            System.out.println(sum);
            if(volume.gethMoneys()<sum)
            {
                volumes.add(volume);
            }
        }
        model.addAttribute("volumes",volumes);
        model.addAttribute("address",address);
        model.addAttribute("sums",sums);

        model.addAttribute("addressList",addressList);
        model.addAttribute("orderDetailsList",orderDetailsList);
//    model.addAttribute("cartnum",cartnum);
//    System.out.println(cartnum);
        return "/home/pay";
    }






}
