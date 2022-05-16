package com.homework.jdbc.example.domain;

public class Magazine extends Readable {

    private String pageType;

    private String pageSize;

    public Magazine(String name, String madeIn, int price, int number, String title, String pageType, String pageSize) {
        super(name, madeIn, price, number, title);
        this.pageType = pageType;
        this.pageSize = pageSize;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getSize() {
        return pageSize;
    }

    public void setSize(String size) {
        this.pageSize = size;
    }
}
