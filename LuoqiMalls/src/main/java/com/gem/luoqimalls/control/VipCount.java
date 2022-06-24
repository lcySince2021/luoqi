package com.gem.luoqimalls.control;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.gem.luoqimalls.pojo.Order;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.OrderService;
import com.gem.luoqimalls.util.AlipayConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping("/vip")
public class VipCount {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/vippay")
    public String pay() {

        return "vippay/pay";
    }

    @RequestMapping("/vipbuy")
    public String buy(HttpSession session, Order order, Model model, HttpServletResponse rep) throws AlipayApiException, IOException {
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        orderService.uservip(userId);
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
        return "vippay/payInfor";
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



}
