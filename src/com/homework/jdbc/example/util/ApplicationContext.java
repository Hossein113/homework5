package com.homework.jdbc.example.util;

import com.homework.jdbc.example.repositori.*;

import java.sql.Connection;
import java.sql.SQLException;

public class ApplicationContext {
    private DatabaseConnected databaseConnected;
    private DatabaseCreateTable databaseCreateTable;
    private RadioRepository radioRepository;
    private DataInit dataInit;
    private TelevisionRepository televisionRepository;
    private SportShoeRepository sportShoeRepository;
    private OfficalshoeRepository officalshoeRepository;
    private BookRepository bookRepository;
    private MagazineRepository magazineRepository;


    public BookRepository getBookRepository() {
        if (bookRepository == null) {
            bookRepository = new BookRepository(databaseConnected.getConnection());
        }
        return bookRepository;
    }

    public MagazineRepository getMagazineRepository() {
        if (magazineRepository == null) {
            magazineRepository = new MagazineRepository(databaseConnected.getConnection());
        }
        return magazineRepository;
    }

    public OfficalshoeRepository getOfficalshoeRepository() {
        if (officalshoeRepository == null) {
            officalshoeRepository = new OfficalshoeRepository(databaseConnected.getConnection());
        }
        return officalshoeRepository;
    }

    public DatabaseCreateTable getDatabaseCreateTable() {
        return databaseCreateTable;
    }

    public DataInit getDataInit() {
        dataInit = new DataInit(getRadioRepository(), getTelevisionRepository(),
                getSportShoeRepository(), getOfficalshoeRepository(),
                getBookRepository(), getMagazineRepository());
        return dataInit;
    }

    public RadioRepository getRadioRepository() {
        if (radioRepository == null)
            this.radioRepository = new RadioRepository(databaseConnected.getConnection());
        return radioRepository;
    }

    public SportShoeRepository getSportShoeRepository() {
        this.sportShoeRepository = new SportShoeRepository(databaseConnected.getConnection());
        return sportShoeRepository;
    }

    public TelevisionRepository getTelevisionRepository() {
        if (televisionRepository == null)
            this.televisionRepository = new TelevisionRepository(databaseConnected.getConnection());
        return televisionRepository;
    }

    public ApplicationContext() throws SQLException, ClassNotFoundException {

        this.databaseConnected = new DatabaseConnected();
        Connection zarfe = databaseConnected.getConnection();

        this.databaseCreateTable = new DatabaseCreateTable(zarfe);
        //        this.databaseCreateTable = new DatabaseCreateTable(databaseConnected.getConnection());


    }


    public DatabaseConnected getDatabaseConnected() {


        return databaseConnected;
    }


}