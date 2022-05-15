package com.homework.jdbc.example.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCreateTable {

    public Connection connection;

    private String schemaName = "jdbc_prodoct";


    DatabaseCreateTable(Connection aa) {


        this.connection = aa;

    }


    public void init() throws SQLException {
        initTable();


    }

    private void initTable() throws SQLException {
        createSchema();
        createTableProducts();
        createTableElectricalAppliances();
        createTableRadio();
        createTableTelevision();
        createTableShoes();
        createTableSportShoe();
        createTableOfficalShoe();
        createTableOReadable();
        createTableBook();
        createTableMagazine();
    }

    private void createSchema() throws SQLException {
        String quri = " create schema if not exists " + schemaName;

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

        statement = connection.createStatement();
        statement.executeUpdate("use " + schemaName);
    }

    private void createTableProducts() throws SQLException {

        String quri = "create table if not exists product_table " +
                "(" +
                "id int not null auto_increment," +
                "Name varchar(255)," +
                "price varchar(255)," +
                "madeIn varchar(255)," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableElectricalAppliances() throws SQLException {

        String quri = "create table if not exists electricalAppliances_table " +
                "(" +
                "id int not null auto_increment," +
                "brand varchar(255)," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableRadio() throws SQLException {

        String quri = "create table if not exists radio_table " +
                "(" +
                "id int not null auto_increment," +
                "color varchar(255)," +
                "size varchar(255)," +
                "voltageIn varchar(255)," +
                "channelNumber int ," +
                "speakerNumber int ," +
                "weight varchar (255)," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableTelevision() throws SQLException {

        String quri = "create table if not exists television_table " +
                "(" +
                "id int not null auto_increment," +
                "color varchar(255)," +
                "inchSize varchar(255)," +
                "voltageIn varchar(255)," +
                "channelNumber int ," +
                "speakerNumber int ," +
                "weight varchar (255)," +
                "imageType varchar (255)," +
                "primary key (id)" +
                ")";


        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableShoes() throws SQLException {

        String quri = "create table if not exists shoes_table " +
                "(" +
                "id int not null auto_increment," +
                "inchSize int ," +
                "materiam varchar(255)," +
                "color varchar(255)," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableSportShoe() throws SQLException {

        String quri = "create table if not exists sportShoe_table " +
                "(" +
                "id int not null auto_increment," +
                "shoeStraType varchar(255)," +
                "sportType varchar(255)," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableOfficalShoe() throws SQLException {

        String quri = "create table if not exists OfficalShoe_table " +
                "(" +
                "id int not null auto_increment," +
                "followingLayerType varchar(255)," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableOReadable() throws SQLException {

        String quri = "create table if not exists readable_table " +
                "(" +
                "id int not null auto_increment," +
                "title varchar(255)," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableBook() throws SQLException {

        String quri = "create table if not exists book_table " +
                "(" +
                "id int not null auto_increment," +
                "pagesNumber int," +
                "writer varchar(255)," +
                "publisher varchar(255)," +
                "printYear int," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }

    private void createTableMagazine() throws SQLException {

        String quri = "create table if not exists magazine_table " +
                "(" +
                "id int not null auto_increment," +
                "pageType varchar(255)," +
                "pageSize varchar(255)," +
                "primary key (id)" +
                ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(quri);

    }
}

