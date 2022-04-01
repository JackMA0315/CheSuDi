package com.weiguozhao.mapper;

import com.weiguozhao.pojo.Order;
import com.weiguozhao.pojo.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderMapper {
    List<OrderItem> findALLOrderItem();

    int addOrder(Order order);
}
