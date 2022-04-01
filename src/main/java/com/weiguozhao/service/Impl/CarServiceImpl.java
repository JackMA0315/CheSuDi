package com.weiguozhao.service.Impl;

import com.weiguozhao.mapper.CarMapper;
import com.weiguozhao.pojo.Car;
import com.weiguozhao.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;
    @Override
    public List<Car> getCarListByPrice(Integer id) {
        List<Car> allCarsByPrice = carMapper.getAllCarsByPrice(id);
        return allCarsByPrice;
    }

    @Override
    public List<Car> getCarListByNumber(Integer id) {
        List<Car> allCarsByNumber = carMapper.getAllCarsByNumber(id);
        return allCarsByNumber;
    }

    @Override
    public Car getCar(Integer cid) {
        Car car = carMapper.getCar(cid);
        return car;
    }
}
