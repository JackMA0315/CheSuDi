package com.weiguozhao.service;

import com.weiguozhao.pojo.Order;

import java.util.Map;

public interface OrderService {
    Map<String,Object> getAllOrderItem(Integer page,Integer limit);

    boolean addOrderItem(Order order);
}
