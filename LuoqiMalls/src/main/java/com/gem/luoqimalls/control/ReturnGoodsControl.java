package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.OrderService;
import com.gem.luoqimalls.service.ReturnGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("returnGoods")
@Controller
public class ReturnGoodsControl {
    @Autowired
    private ReturnGoodsService returnGoodsService;
    @Autowired
    private OrderService orderService;


    @RequestMapping("/returngoods")
    private  String returnGoods(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        System.out.println(user);
        int userId=user.getUserId();
        System.out.println(userId);
        String orderState="待评价";
        List<Order> orderList=returnGoodsService.selectOrderListWhereWaitCommentByUserId(userId,orderState);
        System.out.println(orderList);
        for (Order order:orderList){
            int orderId=order.getOrderId();
            List<Integer> ordermark=orderService.goodsinit(orderId);
            for(Integer i:ordermark)
            {
                orderService.ordermarkupdate(i,orderId);
            }

            List<OrderDetails> orderDetailsList=orderService.selectOrderDetailsByOrderId(orderId);
            double a=0;
            for (OrderDetails orderDetails:orderDetailsList){
                int goodsId=orderDetails.getGoodsId();
                Goods goods=orderService.selectGoodsByGoodsId(goodsId);
                orderDetails.setGoods(goods);
                a=a+orderDetails.getOrderDetailsMoney();
                int goodsPicId=goods.getGoodsPicId();
                Image image=orderService.selectImageByGoodsPicId(goodsPicId);
                goods.setImage(image);
            }
            System.out.println(a);
            order.setOrderMoney(a);
            order.setOrderDetailsList(orderDetailsList);
        }
        System.out.println(orderList);
        model.addAttribute("list",orderList);
        return "/person/returngoods";
    }



    @RequestMapping("/waitreturngoods")
    private  String updateOrderStateByorderId(int orderId){
        String orderState="退货待确认";
        int a=returnGoodsService.updateOrderStateByOrderId(orderState,orderId);
        return "forward:/returnGoods/showwaitreturngoodslist";
    }


    @RequestMapping("/cancelreturngoods")
    private String cancelReturnGoods(int orderId){
        String orderState="待评价";
        int a=returnGoodsService.updateOrderStateByOrderId(orderState,orderId);
        return "forward:/returnGoods/showwaitreturngoodslist";
    }


    @RequestMapping("/showwaitreturngoodslist")
    private String showWaitReturnGoodsList(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        String orderState="退货待确认";
        List<Order> orderList=returnGoodsService.selectOrderListWhereWaitCommentByUserId(userId,orderState);
        System.out.println(orderList);
        for (Order order:orderList){
            int orderId=order.getOrderId();
            List<Integer> ordermark=orderService.goodsinit(orderId);
            for(Integer i:ordermark)
            {
                orderService.ordermarkupdate(i,orderId);
            }

            List<OrderDetails> orderDetailsList=orderService.selectOrderDetailsByOrderId(orderId);
            double a=0;
            for (OrderDetails orderDetails:orderDetailsList){
                int goodsId=orderDetails.getGoodsId();
                Goods goods=orderService.selectGoodsByGoodsId(goodsId);
                orderDetails.setGoods(goods);
                a=a+orderDetails.getOrderDetailsMoney();
                int goodsPicId=goods.getGoodsPicId();
                Image image=orderService.selectImageByGoodsPicId(goodsPicId);
                goods.setImage(image);
            }
            System.out.println(a);
            order.setOrderMoney(a);
            order.setOrderDetailsList(orderDetailsList);
        }
        System.out.println(orderList);
        model.addAttribute("list",orderList);
        return "/person/waitreturngoods";
    }


    @RequestMapping("/showendreturngoods")
    private String showEndReturnGoods(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        String orderState="退货完成";
        List<Order> orderList=returnGoodsService.selectOrderListWhereWaitCommentByUserId(userId,orderState);
        System.out.println(orderList);
        for (Order order:orderList){
            int orderId=order.getOrderId();
            List<Integer> ordermark=orderService.goodsinit(orderId);
            for(Integer i:ordermark)
            {
                orderService.ordermarkupdate(i,orderId);
            }

            List<OrderDetails> orderDetailsList=orderService.selectOrderDetailsByOrderId(orderId);
            double a=0;
            for (OrderDetails orderDetails:orderDetailsList){
                int goodsId=orderDetails.getGoodsId();
                Goods goods=orderService.selectGoodsByGoodsId(goodsId);
                orderDetails.setGoods(goods);
                a=a+orderDetails.getOrderDetailsMoney();
                int goodsPicId=goods.getGoodsPicId();
                Image image=orderService.selectImageByGoodsPicId(goodsPicId);
                goods.setImage(image);
            }
            System.out.println(a);
            order.setOrderMoney(a);
            order.setOrderDetailsList(orderDetailsList);
        }
        System.out.println(orderList);
        model.addAttribute("list",orderList);

        return "/person/showendreturngoods";
    }


}
