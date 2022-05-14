package com.homework.jdbc.example.domain;

public class Radio extends ElectricalAppliances {

    private String color ;

    private String size;

    private int voltageIn ;

    private int channelNumber;

    private int speakerNumber;

    private int weight;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getVoltageIn() {
        return voltageIn;
    }

    public void setVoltageIn(int voltageIn) {
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
