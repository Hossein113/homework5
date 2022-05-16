package com.homework.jdbc.example.domain;

public class Book extends Readable {


    private int pagesNumber;

    private String writer;

    private String publisher;

    private int printYear;

    public Book(String name, String madeIn, int price, int number, String title, int pagesNumber, String writer, String publisher, int printYear) {
        super(name, madeIn, price, number, title);
        this.pagesNumber = pagesNumber;
        this.writer = writer;
        this.publisher = publisher;
        this.printYear = printYear;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }
}
