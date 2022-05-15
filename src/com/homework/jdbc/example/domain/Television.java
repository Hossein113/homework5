package com.homework.jdbc.example.domain;

public class Television extends ElectricalAppliances {

    private int id;


    private String color;
    private int inchSize;
    private int voltageIn;
    private int channalNumber;
    private int speakerNumber;
    private int weight;


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
        return channalNumber;
    }

    public void setManyChannal(int manyChannal) {
        this.channalNumber = manyChannal;
    }

    public int getManySpeaker() {
        return speakerNumber;
    }

    public void setManySpeaker(int manySpeaker) {
        this.speakerNumber = manySpeaker;
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
