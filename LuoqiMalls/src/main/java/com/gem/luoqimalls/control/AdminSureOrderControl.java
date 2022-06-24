package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.AdminSureOrderService;
import com.gem.luoqimalls.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/adminSure")
public class AdminSureOrderControl {
    @Autowired
    private AdminSureOrderService adminSureOrderService;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/adminSure")
    private String showAdminSureOrder(Model model){
        String orderState="待发货";

        List<Order> orderList=adminSureOrderService.selectAllWaitSendGoodsOrder(orderState);
        for (Order order:orderList){
            System.out.println(order.getOrderId());
            Address address=adminSureOrderService.selectAddressByAddressId(order.getAddressId());
            System.out.println(address);
            User user=adminSureOrderService.selectUserByUserId(order.getUserId());
            System.out.println(user);
            address.setUser(user);
            order.setAddress(address);
            int orderId=order.getOrderId();
            List<OrderDetails> orderDetailsList=orderService.selectOrderDetailsByOrderId(orderId);
            double a=0;
            for (OrderDetails orderDetails:orderDetailsList){
                int goodsId=orderDetails.getGoodsId();
                Goods goods=orderService.selectGoodsByGoodsId(goodsId);
                orderDetails.setGoods(goods);
                a=a+orderDetails.getOrderDetailsMoney();
            }
            System.out.println(a);
            order.setOrderMoney(a);
            order.setOrderDetailsList(orderDetailsList);
        }
        System.out.println(orderList);
        model.addAttribute("list",orderList);
        return "admin/admin-role";
    }



    @RequestMapping("/updateState")
    private String updateOrderState(HttpServletRequest request){
        int orderId= Integer.parseInt(request.getParameter("orderId"));
        System.out.println(orderId);
        String orderState="待收货";
        adminSureOrderService.updateAdminSureSendGoodsByOrderId(orderState,orderId);


        return  "forward:/adminSure/adminSure";
    }



    @RequestMapping("/showadminsurereturngoods")
    private String showAdminReturnGoods(Model model){
        String orderState="退货待确认";
        List<Order> orderList=adminSureOrderService.selectReturnGoods(orderState);
        for (Order order:orderList){
            System.out.println(order.getOrderId());
            Address address=adminSureOrderService.selectAddressByAddressId(order.getAddressId());
            System.out.println(address);
            User user=adminSureOrderService.selectUserByUserId(order.getUserId());
            System.out.println(user);
            address.setUser(user);
            order.setAddress(address);
            int orderId=order.getOrderId();
            List<OrderDetails> orderDetailsList=orderService.selectOrderDetailsByOrderId(orderId);
            double a=0;
            for (OrderDetails orderDetails:orderDetailsList){
                int goodsId=orderDetails.getGoodsId();
                Goods goods=orderService.selectGoodsByGoodsId(goodsId);
                orderDetails.setGoods(goods);
                a=a+orderDetails.getOrderDetailsMoney();
            }
            System.out.println(a);
            order.setOrderMoney(a);
            order.setOrderDetailsList(orderDetailsList);
        }
        System.out.println(orderList);
        model.addAttribute("list",orderList);


        return "/admin/adminsurereturngoods";
    }


    @RequestMapping("/adminsurereturngoods")
    private String adminSureReturnGoods(HttpServletRequest request){
        int orderId= Integer.parseInt(request.getParameter("orderId"));
        System.out.println(orderId);
        String orderState="退货完成";
        adminSureOrderService.updateAdminSureSendGoodsByOrderId(orderState,orderId);


        return  "forward:/adminSure/showadminsurereturngoods";


    }



}
