package com.homework.jdbc.example.domain;

public class Television extends ElectricalAppliances {

    private int id ;

    private int weight ;

    private String color ;

    private int voltageIn ;

    private int manyChannal;

    private int manySpeaker;

    private int inchSize;

    private String ImageType;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVoltageIn() {
        return voltageIn;
    }

    public void setVoltageIn(int voltageIn) {
        this.voltageIn = voltageIn;
    }

    public int getManyChannal() {
        return manyChannal;
    }

    public void setManyChannal(int manyChannal) {
        this.manyChannal = manyChannal;
    }

    public int getManySpeaker() {
        return manySpeaker;
    }

    public void setManySpeaker(int manySpeaker) {
        this.manySpeaker = manySpeaker;
    }

    public int getInchSize() {
        return inchSize;
    }

    public void setInchSize(int inchSize) {
        this.inchSize = inchSize;
    }

    public String getImageType() {
        return ImageType;
    }

    public void setImageType(String imageType) {
        ImageType = imageType;
    }
}
