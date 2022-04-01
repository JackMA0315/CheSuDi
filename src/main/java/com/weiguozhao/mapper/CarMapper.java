package com.weiguozhao.mapper;

import com.weiguozhao.pojo.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarMapper {
    List<Car> getAllCarsByPrice(Integer id);
    List<Car> getAllCarsByNumber(Integer id);

    Car getCar(Integer cid);
}
