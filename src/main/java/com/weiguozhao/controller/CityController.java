package com.weiguozhao.controller;

import com.weiguozhao.pojo.City;
import com.weiguozhao.pojo.CityVo;
import com.weiguozhao.pojo.ResponseData;
import com.weiguozhao.service.CityService;
import com.weiguozhao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping("/select")
    public ResponseData selectAllCityList(@RequestParam("pid") Integer pid){
        List<City> list = cityService.findAllCity(pid);
        ResponseData responseData = new ResponseData();
        responseData.setCode(1);
        responseData.setInfo(list);
        return responseData;
    }

    @RequestMapping("/citys")
    public ResponseData getCitys(@RequestParam("getid") Integer getid,@RequestParam("backid") Integer backid){
        City getcity = cityService.getCity(getid);
        City backcity = cityService.getCity(backid);
        CityVo cityVo = new CityVo();
        cityVo.setGetCity(getcity);
        cityVo.setBackCity(backcity);
        ResponseData responseData = new ResponseData();
        responseData.setCode(1);
        responseData.setInfo(cityVo);
        return responseData;
    }
}
