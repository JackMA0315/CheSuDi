package com.weiguozhao.controller;

import com.weiguozhao.pojo.Car;
import com.weiguozhao.pojo.City;
import com.weiguozhao.pojo.ResponseData;
import com.weiguozhao.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;
    @RequestMapping("/price")
    public ResponseData getCarsByPrice(@RequestParam("getid") Integer getid){
        List<Car> pricecars = carService.getCarListByPrice(getid);
        ResponseData responseData = new ResponseData();
        responseData.setCode(1);
        responseData.setInfo(pricecars);
        return responseData;
    }
    @RequestMapping("/number")
    public ResponseData getCarsByNumber(@RequestParam("getid") Integer getid){
        List<Car> numbercars = carService.getCarListByNumber(getid);
        ResponseData responseData = new ResponseData();
        responseData.setCode(1);
        responseData.setInfo(numbercars);
        return responseData;
    }
    @RequestMapping("/findcar")
    public ResponseData getCar(@RequestParam("cid") Integer cid){
        Car car = carService.getCar(cid);
        ResponseData responseData = new ResponseData();
        responseData.setCode(1);
        responseData.setInfo(car);
        return responseData;
    }
}
