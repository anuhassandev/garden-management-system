package com.gardenapp.management.domain;

import java.util.List;

public class Garden {

    //ATTRIBUTES
    private int id;
    private String address;
    private String type;
    private List<Flower> flowers;

    //GETTERS
    public int getId() {
        return id;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }


    //SETTERS
    public void setAddress(String address) {
        this.address = address;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
}
