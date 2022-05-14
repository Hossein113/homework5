package com.homework.jdbc.example.domain;

public abstract class ElectricalAppliances extends Product {

    private String brand ;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
