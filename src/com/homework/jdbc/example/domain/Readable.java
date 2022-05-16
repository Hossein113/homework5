package com.homework.jdbc.example.domain;

public abstract class Readable extends Product {

    private int id;

    private String title;

    public Readable(String title) {
        this.title = title;
    }

    public Readable(String name, String madeIn, int price, int number, String title) {
        super(name, madeIn, price, number);
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
