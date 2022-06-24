package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.BillService;
import com.gem.luoqimalls.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/bill")
public class BillControl {
    @Autowired
    private BillService billService;
    @Autowired
    private OrderService orderService;

    @RequestMapping("bill")
    public  String showBill(){






        return "/person/bill";
    }


    @RequestMapping("/billlist")
    public String billlist(String orderState, HttpSession session, Model model){
        orderState="待付款";
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        List<Order> orderList=billService.selectOrderExpectWaitPay(orderState,userId);
        for (Order order:orderList){
            int orderId=order.getOrderId();
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


        return "/person/billlist";
    }
}
