package com.weiguozhao.controller;

import com.weiguozhao.pojo.ResponseData;
import com.weiguozhao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/all")
    public ResponseData getAllOrderInfo(@RequestParam("page") Integer page){
        Map<String, Object> map = orderService.getAllOrderItem(page, 15);
        ResponseData responseData = new ResponseData();
        responseData.setCode(1);
        responseData.setInfo(map);
        return responseData;
    }

    @RequestMapping("/add")
    public ResponseData addOrder(@RequestParam("oprice") Integer oprice){
        ResponseData responseData = new ResponseData();
        responseData.setCode(1);
        responseData.setInfo(1);
        return responseData;
    }
}
