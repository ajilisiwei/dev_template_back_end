package com.ajilisiwei.it.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class Water implements Serializable {
    /**
     * 降雨量/蒸发量编号
     */
    private Integer id;

    /**
     * 城市id
     */
    private Integer cityId;

    /**
     * 降雨量：1/蒸发量：2
     */
    private Integer type;

    /**
     * 描述
     */
    private String description;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 月份
     */
    private Integer month;

    /**
     * 总量
     */
    private Float count;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }
}