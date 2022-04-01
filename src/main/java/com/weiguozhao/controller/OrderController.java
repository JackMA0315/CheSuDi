package com.weiguozhao.controller;

import com.weiguozhao.pojo.Order;
import com.weiguozhao.pojo.ResponseData;
import com.weiguozhao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
 * @Auther weiguozhao
 * @Data ${Data}
 * */
import java.util.Map;

@RestController
@RequestMapping("/order")
public class

OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/all")
    public ResponseData getAllOrderInfo(@RequestParam("page") Integer page){
        Map<String, Object> map = orderService.getAllOrderItem(page, 20);
        ResponseData responseData = new ResponseData();
        responseData.setCode(1);
        responseData.setInfo(map);
        return responseData;
    }

    @RequestMapping("/add")
    public ResponseData addOrder(@RequestParam("getid") Integer getid,
                                 @RequestParam("backid") Integer backid,
                                 @RequestParam("cid") Integer cid,
                                 @RequestParam("oprice") Double total
                                 ){
        Order order = new Order();
        order.setCid(cid);
        order.setUid(5);
        order.setGetid(getid);
        order.setBackid(backid);
        order.setOprice(total);
        order.setStatus("已预订");
        boolean flag = orderService.addOrderItem(order);
        ResponseData responseData = new ResponseData();
        if (flag){
            responseData.setInfo("订单添加成功，点击查看订单列表");
        }
        return responseData;
    }

    @RequestMapping("/del")
    public ResponseData delOrder(@RequestParam("oid") Integer oid){
        ResponseData responseData = new ResponseData();
        responseData.setInfo("进入删除订单控制器,要删除的订单编号是"+oid);
        return responseData;
    }
}
