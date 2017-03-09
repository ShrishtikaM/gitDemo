package com.cybage.model;

import java.io.Serializable;

/**
 * Created by Administrator on 3/9/2017.
 */
public class Student implements Serializable{
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
}
