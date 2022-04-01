package com.weiguozhao.service;

import com.weiguozhao.pojo.City;

import java.util.List;

public interface CityService {
    List<City> findAllCity(Integer pid);

    City getCity(Integer id);
}
