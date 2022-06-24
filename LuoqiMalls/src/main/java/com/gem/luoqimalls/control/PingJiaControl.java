package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.Evaluate;
import com.gem.luoqimalls.pojo.OrderDetails;
import com.gem.luoqimalls.service.PingJiaService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/pingjia")
public class PingJiaControl {
    @Autowired
private PingJiaService service;
    @RequestMapping("/pingjia")
    public String pingjia(Integer orderId, Model model){
        List<OrderDetails> orderDetails=service.getAllOrderDetails(orderId);
        if(orderDetails.size()!=0){
            int userNum=service.getOrderNumInCommentByOrderId(orderId);
            int userId=service.getUserIdByOrderId(orderId);
            model.addAttribute("userNum",userNum);
            model.addAttribute("userId",userId);
            model.addAttribute("orderDetails",orderDetails);
            return "/person/pingjia";
        }
        else {
            boolean b=service.updateStateByOrderId(orderId);
            System.out.println(111);
            return "forward:/order/waitCommentOrder";
        }
    }
    @RequestMapping("updatePingjia")
    public String updatePingjia(Integer isGoods,String evaluateText,Integer goodsId,Integer userId,Integer orderId,Model model){
        Integer orderDetailId=service.getorderDetailIdByOrderIdAndGoodsId(orderId,goodsId);
        boolean b1=service.updateIsEvaluateToZero(orderDetailId);
        Date date=new Date();
        Evaluate evaluate=new Evaluate(evaluateText,goodsId,userId,isGoods,date);
        boolean a=service.addEvaluate(evaluate);
        model.addAttribute("orderId",orderId);
            return "forward:/pingjia/pingjia";
    }
    @RequestMapping("/comment")
    public String comment(Integer userId,Model model,Integer curPage){
        PageInfo<Evaluate> pageInfo=service.getAllEvaluateByUserId(userId,curPage);
        PageInfo<Evaluate> pageInfo1=service.getAllEvaluateByUserIdReplyIsNull(userId,curPage);
        System.out.println(pageInfo);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("pageInfo1",pageInfo1);
        model.addAttribute("userId",userId);
        return "/person/comment";
    }
    @RequestMapping("updatepingjia")
    public String updatepingjia(Integer evaluateId,Integer userId,String review,Model model){
        boolean b=service.updateReview(review,evaluateId);
        model.addAttribute("userId",userId);
        return "forward:/pingjia/comment";
    }
}
