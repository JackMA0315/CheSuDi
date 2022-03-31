package com.weiguozhao.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weiguozhao.mapper.OrderMapper;
import com.weiguozhao.pojo.OrderItem;
import com.weiguozhao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Map<String, Object> getAllOrderItem(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        Map<String, Object> map = new HashMap<>();
        List<OrderItem> list = orderMapper.findALLOrderItem();
        if (list!=null){
            PageInfo info = new PageInfo(list);
            /*System.out.println(info);*/
            map.put("total",info.getTotal());
            map.put("rows",info.getList());
/*            System.out.println(info.getTotal());
            System.out.println(info.getList());*/
            return map;
        }
        return null;
    }
}
