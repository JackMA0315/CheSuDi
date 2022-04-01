package com.weiguozhao.service;

import com.weiguozhao.pojo.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarListByPrice(Integer id);

    List<Car> getCarListByNumber(Integer id);

    Car getCar(Integer cid);
}
