package com.gardenapp.management.domain;

public class Flower {

    // ATTRIBUTES
    private String name;
    private String country;
    private String petals;
    private int varieties;

    //GETTERS
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getPetals() {
        return petals;
    }

    public int getVarieties() {
        return varieties;
    }

    //SETTERS
    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetals(String petals) {
        this.petals = petals;
    }

    public void setVarieties(int varieties) {
        this.varieties = varieties;
    }



}
