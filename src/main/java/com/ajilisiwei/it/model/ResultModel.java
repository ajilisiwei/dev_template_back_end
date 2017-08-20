package com.ajilisiwei.it.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by WEI on 20/08/2017.
 */
public class ResultModel implements Serializable{
    private String error_msg;
    private Integer status;
    private List<DataModel> data;

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<DataModel> getData() {
        return data;
    }

    public void setData(List<DataModel> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[error_msg:"+error_msg+",status:"+status;
    }

}
