package com.ajilisiwei.it.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by WEI on 20/08/2017.
 */
public class DataModel implements Serializable{
    private Integer type;
    private Integer city_id;
    private String city_name;
    private List<Float> data;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public List<Float> getData() {
        return data;
    }

    public void setData(List<Float> data) {
        this.data = data;
    }
}
