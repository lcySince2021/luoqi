package com.gem.luoqimalls.control;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gem.luoqimalls.pojo.*;
import com.gem.luoqimalls.service.CartService;
import com.gem.luoqimalls.service.OrderService;
import com.gem.luoqimalls.service.PingJiaService;
import com.gem.luoqimalls.util.AlipayConfig;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

@Controller
@RequestMapping("/order")
public class OrderControl {
    @Autowired
    private OrderService orderService;

    @Autowired
    private PingJiaService service;
    @RequestMapping("/order")
    public  String WaitOrder(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        List<Order> orderList=orderService.selectOrderByUserId(userId);
        for (Order order:orderList){
            int orderId=order.getOrderId();
//            List<Integer> ordermark=orderService.goodsinit(orderId);
//            for(Integer i:ordermark)
//            {
//                orderService.ordermarkupdate(i,orderId);
//            }

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
        return  "/person/order";
    }


    @RequestMapping("/waitPayOrder")
    public  String WaitPayOrder(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        List<Order> orderList=orderService.selectWaitPayOrderByUserId(userId);
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
        return  "/person/waitpayorder";
    }
    @RequestMapping("/waitSendGoodsOrder")
    public  String WaitSendGoodsOrder(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        List<Order> orderList=orderService.selectWaitSendGoodsOrderByUserId(userId);
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
        return  "/person/waitsendgoodsorder";
    }



    @RequestMapping("/waitGetGoodsOrder")
    public  String WaitGetGoodsOrder(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        List<Order> orderList=orderService.selectWaitGetGoodsOrderByUserId(userId);
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
        return  "/person/waitgetgoodsorder";
    }


    @RequestMapping("/waitCommentOrder")
    public  String WaitCommentOrder(HttpSession session, Model model){
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        List<Order> orderList=orderService.selectWaitCommentOrderByUserId(userId);
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
        Integer isJY=orderService.getIsJY(userId);
        model.addAttribute("isJY",isJY);

        System.out.println(orderList);
        model.addAttribute("list",orderList);
        return  "/person/waitcommentorder";
    }


    @RequestMapping("/pay")
    public String pay(HttpSession session, int orderId, double endmoneys, Model model) {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int addressid=orderService.selectaddressId(userId,orderId);
        Address address=orderService.getaddress(addressid);
        model.addAttribute("address",address);
        model.addAttribute("orderId",orderId);
        model.addAttribute("endmoneys",endmoneys);

        return "/pay/pay";
    }

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    Date goodsbuydate=new Date();

    @RequestMapping("/buy")
    public String buy(HttpSession session,int orderId,Order order, Model model, HttpServletResponse rep) throws AlipayApiException, IOException {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        orderService.goodsbuy(userId,orderId,goodsbuydate);
        orderService.orderset(orderId);
        orderService.goodsupdate(orderId);
        List<Integer> sums=orderService.goodsinit(orderId);
        for(Integer sum:sums) {
            int sumx=sum;
            orderService.userinit(sumx, userId);
        }
        List<Integer> goodsmark=orderService.ordermarkgoodsid(orderId);
        for(Integer goodsmarks:goodsmark) {
            int marks=goodsmarks;
            int marknum=orderService.ordermarkgoodsnum(orderId,marks);
                    int markmark=orderService.ordermarkgoodsmark(marks);
                    int summark=marknum*markmark;
                    orderService.insertmarkbuy(userId,marks,marknum,goodsbuydate,summark);
        }


        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = new String(String.valueOf(order.getOid()).getBytes("ISO-8859-1"), "UTF-8");
        //付款金额，必填
        String total_amount = new String(String.valueOf(order.getMoney()).getBytes("ISO-8859-1"), "UTF-8");
        //订单名称，必填
        String subject = new String(order.getOname().getBytes("ISO-8859-1"), "UTF-8");
        //商品描述，可空
        String body = new String(order.getDetail().getBytes("ISO-8859-1"), "UTF-8");

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();

        System.out.println(result);

        model.addAttribute("result", result);
        return "/pay/payInfor";
    }


    @RequestMapping("/return")
    public String ReturnUrl(HttpServletRequest request, HttpServletResponse response) throws AlipayApiException, UnsupportedEncodingException {
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

        if (signVerified) {
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

            request.setAttribute("out_trade_no", out_trade_no);
            request.setAttribute("trade_no", trade_no);
            request.setAttribute("total_amount", total_amount);
//            数据库查询订单
            Order order =new Order("20181030134927631","测试",0.01f,"");
            if (order == null) {
                signVerified = false;
                request.setAttribute("signVerified", signVerified);
                request.setAttribute("reason", "商户订单号不存在");
                System.out.println("系统订单：" + out_trade_no + "不存在。");
            } else {
                if (order.getMoney()!=Float.parseFloat(total_amount)) {
                    signVerified = false;
                    request.setAttribute("signVerified", signVerified);
                    request.setAttribute("reason", "付款金额不对");
                    return "html/return_url";
                }
                if (order.getStatus() == 1) {
                    //判断当前订单是否已处理，避免重复处理
                    System.out.println("系统订单：" + out_trade_no + "无需重复处理。");
                } else {
                    order.setStatus(1);
                    //修改订单状态为已支付,修改订单状态,并写业务
                    System.out.println("系统订单：" + out_trade_no + "成功支付。");
                }
            }
        } else {
            request.setAttribute("reason", "验签失败");
        }
        request.setAttribute("signVerified", signVerified);
        return "forward:/user/main";

    }

    @ResponseBody
    @RequestMapping("/insertorder")
    public Map<String,Integer> insertorder(HttpSession session, int[] arrId, int[] arrnum, Model model){
        int[] arrIds=arrId;
        int[] arrnumz=arrnum;
        int[] arrnums;
   int goodsnum;
        System.out.println("ww");
        System.out.println(arrIds);
        System.out.println("ws");

//        System.out.println(arrIds);
//        System.out.println(arrnums);
        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int x=1+(int)(Math.random()*100000);
        orderService.orderinsertto(userId,x);
        int id=orderService.orderselectto(x);
//        System.out.println(arrIds.length);
        for(int j=0;j<arrIds.length;j++){
            System.out.println(arrIds[j]);
            goodsnum=orderService.cartgoodsnum(userId,arrIds[j]);
            orderService.orderdetailinsertto(id,arrIds[j],goodsnum);
            orderService.ofcartdelete(userId,arrIds[j]);
        }
//        System.out.println("ww");
//        for(int i=0;i<arrIds.length;i++) {
//
//        }
//
//            int pp= cartnum.get(i);
//            System.out.println(pp);
//
//                  orderService.ofcartdelete(userId,pp);
//
//        }
        maps.put("orders", x);

        return  maps;
    }

    @RequestMapping("/delorder")
    public String getfoot(int orderId, Model model){
        orderService.orderdel(orderId);

        return "forward:/order/order";
//
    }







    @ResponseBody
    @RequestMapping("/insertordergoods")
    public Map<String,Integer> insertordergoods(HttpSession session, int  goodsId, int num, Model model){

        int[] arrnums;
        int goodsnum;
        System.out.println("ww");

        System.out.println("ws");

        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int x=1+(int)(Math.random()*100000);
        orderService.orderinsertto(userId,x);
//        订单id
        int id=orderService.orderselectto(x);
//
            orderService.orderdetailinsertto(id,goodsId,num);


        maps.put("orders", x);

        return  maps;
    }


    @ResponseBody
    @RequestMapping("/insermarkgoods")
    public Map<String,Integer> insermarkgoods(int orderId,HttpSession session,  Model model){

        System.out.println("ww");

        System.out.println("ws");

        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int address=orderService.mraddressid(userId);
        List<Integer> goodsmark=orderService.ordermarkgoodsid(orderId);
        for(Integer goodsmarks:goodsmark) {
            int marks=goodsmarks;
            int marknum=orderService.ordermarkgoodsnum(orderId,marks);
            int markmark=orderService.ordermarkgoodsint(marks);
            int summark=marknum*markmark;
            int summarks=summark*(-1);
            orderService.insertmarkbuy(userId,marks,marknum,goodsbuydate,summarks);
            orderService.thismarkorder(address,summark,goodsbuydate,orderId);
            orderService.usermarkupdate(summark,userId);

        }



        maps.put("orders", 123);

        return  maps;
    }

    @RequestMapping("shouhuo")
    public String shouhuo(Integer orderId){
        boolean b=service.updateStateShouHuo(orderId);
        return "forward:/order/waitGetGoodsOrder";
    }


    @ResponseBody
    @RequestMapping("/thismarkgoods")
    public Map<String,Integer> thismarkgoods(HttpSession session, int  goodsId, int num, Model model){


        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int x=1+(int)(Math.random()*100000);
        orderService.orderinsertto(userId,x);
//        订单id
        int id=orderService.orderselectto(x);
//
        orderService.orderdetailinsertto(id,goodsId,num);


        maps.put("orders", x);

        return  maps;
    }


    @ResponseBody
    @RequestMapping("/huiinsertordergoods")
    public Map<String,Integer> huiinsertordergoods(HttpSession session, int  goodsId, int num, Model model,int wws){

        int[] arrnums;
        int goodsnum;
        System.out.println("ww");

        System.out.println("ws");

        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        int x=1+(int)(Math.random()*100000);
        orderService.orderinsertto(userId,x);
//        订单id
        int id=orderService.orderselectto(x);
//
        orderService.orderdetailinsertto(id,goodsId,num);


        maps.put("orders", x);
        maps.put("hui", wws);

        return  maps;
    }









}
