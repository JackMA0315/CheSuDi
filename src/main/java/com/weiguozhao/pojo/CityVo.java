package com.weiguozhao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityVo {
    private City getCity;
    private City backCity;

    public City getGetCity() {
        return getCity;
    }

    public void setGetCity(City getCity) {
        this.getCity = getCity;
    }

    public City getBackCity() {
        return backCity;
    }

    public void setBackCity(City backCity) {
        this.backCity = backCity;
    }
}
