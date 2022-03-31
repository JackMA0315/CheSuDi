package com.weiguozhao.service;

import java.util.Map;

public interface OrderService {
    Map<String,Object> getAllOrderItem(Integer page,Integer limit);
}
