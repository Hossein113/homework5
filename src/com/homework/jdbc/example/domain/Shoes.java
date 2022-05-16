package com.homework.jdbc.example.domain;

public abstract class Shoes extends Product {

    private int id;

    private int size;

    private String material;

    private String color;

    public Shoes(String name, String madeIn, int price, int number, int size, String material, String color) {
        super(name, madeIn, price, number);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
