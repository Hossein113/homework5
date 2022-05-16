package com.homework.jdbc.example.domain;

public class Radio extends ElectricalAppliances {

    private String color;

    private String size;

    private String voltageIn;

    private int channelNumber;

    private int speakerNumber;

    private String weight;


    public Radio() {
    }

    public Radio(String name, String madeIn, int price, int number, String brand, String color,
                 String size, String voltageIn, int channelNumber, int speakerNumber, String weight) {
        super(name, madeIn, price, number, brand);
        this.color = color;
        this.size = size;
        this.voltageIn = voltageIn;
        this.channelNumber = channelNumber;
        this.speakerNumber = speakerNumber;
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVoltageIn() {
        return voltageIn;
    }

    public void setVoltageIn(String voltageIn) {
        this.voltageIn = voltageIn;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public int getSpeakerNumber() {
        return speakerNumber;
    }

    public void setSpeakerNumber(int speakerNumber) {
        this.speakerNumber = speakerNumber;
    }
}
