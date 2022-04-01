package com.weiguozhao.service.Impl;

import com.weiguozhao.mapper.CityMapper;
import com.weiguozhao.pojo.City;
import com.weiguozhao.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<City> findAllCity(Integer pid) {
        List<City> list = cityMapper.findAllCity(pid);
        if (list!=null){
            return list;
        }
        return null;
    }

    @Override
    public City getCity(Integer id) {
        City city = cityMapper.findCity(id);
        if (city!=null){
            return city;
        }
        return null;
    }
}
