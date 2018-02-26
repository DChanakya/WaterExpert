package com.example.apbc.waterexpert.Models;

/**
 * Created by chanakya on 26/5/17.
 */

public class ListModel {
    private String name,value,range,remark;
    public ListModel(String name, String value, String range, String remark) {
        this.name = name;
        this.value = value;
        this.range = range;
        this.remark = remark;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
