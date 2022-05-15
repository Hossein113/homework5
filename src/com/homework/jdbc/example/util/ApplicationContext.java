package com.homework.jdbc.example.util;

import java.sql.Connection;
import java.sql.SQLException;

public class ApplicationContext {
    DatabaseConnected databaseConnected;
    DatabaseCreateTable databaseCreateTable;


    public ApplicationContext() throws SQLException, ClassNotFoundException {

        this.databaseConnected = new DatabaseConnected();
        Connection zarfe = databaseConnected.getConnection();

        this.databaseCreateTable = new DatabaseCreateTable(zarfe);
        //        this.databaseCreateTable = new DatabaseCreateTable(databaseConnected.getConnection());


    }

    public DatabaseConnected getDatabaseConnected() {
        return databaseConnected;
    }

    public DatabaseCreateTable getDatabaseCreateTable() {
        return databaseCreateTable;
    }
}