package com.homework.jdbc.example.domain;

public class SportShoe extends Shoes {

    private String StraType;

    private String sportType;

    public SportShoe(String name, String madeIn, int price, int number, int size, String material, String color, String straType, String sportType) {
        super(name, madeIn, price, number, size, material, color);
        StraType = straType;
        this.sportType = sportType;
    }

    public SportShoe(String name, int price, int number, int size, String color, String sportType) {
        super(name, price, number, size, color);
        this.sportType = sportType;
    }

    public String getStraType() {
        return StraType;
    }

    public void setStraType(String straType) {
        this.StraType = straType;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    @Override
    public String toString() {
        return "SportShoe{" +
                "StraType='" + StraType + '\'' +
                ", sportType='" + sportType + '\'' +
                "} " + super.toString();
    }
}
