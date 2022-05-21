package com.homework.jdbc.example.domain;

public abstract class Readable extends Product {


    private String title;

    public Readable(String name, int price, int number, String title) {
        this.title = title;
    }

    public Readable(String name, String madeIn, int price, int number, String title) {
        super(name, madeIn, price, number);
        this.title = title;
    }

    public Readable() {
        this.title = title;
    }

    public Readable(int id, String name, String madeIn, int price, int number, int id1, String title) {
        super(id, name, madeIn, price, number);

        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Readable{" +
                "title='" + title + '\'' +
                "} " + super.toString();
    }
}

