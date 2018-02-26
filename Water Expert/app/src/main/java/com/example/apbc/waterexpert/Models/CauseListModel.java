package com.example.apbc.waterexpert.Models;

/**
 * Created by chanakya on 26/5/17.
 */

public class CauseListModel {
    private String name,selectePosition;

    public CauseListModel(String name, String selectePosition) {
        this.name = name;
        this.selectePosition = selectePosition;
    }

    public String getSelectePosition() {
        return selectePosition;
    }

    public void setSelectePosition(String selectePosition) {
        this.selectePosition = selectePosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
