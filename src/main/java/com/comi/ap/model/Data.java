package com.comi.ap.model;

import java.util.Date;

public class Data {
    private Integer id;
    private String name;
    private Date date;

    public Data() {
    }

    public Data(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}