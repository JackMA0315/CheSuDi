package com.weiguozhao.mapper;

import com.weiguozhao.pojo.City;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CityMapper {
    List<City> findAllCity(Integer pid);
    City findCity(Integer id);
}
