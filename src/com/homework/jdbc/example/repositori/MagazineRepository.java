package com.homework.jdbc.example.repositori;

import com.homework.jdbc.example.domain.Magazine;

import java.sql.*;

public class MagazineRepository {

    private Connection connection;

    public MagazineRepository(Connection db) {
        this.connection = db;
    }


    public Magazine insertMagazine(Magazine magazine) throws SQLException {

        String insertQuery = "insert into magazine_table (name , price , made_in ,title, page_type , page_size , number) " +
                "values (?,?,?,?,?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, magazine.getName());
        preparedStatement.setInt(2, magazine.getPrice());
        preparedStatement.setString(3, magazine.getMadeIn());
        preparedStatement.setString(4, magazine.getTitle());
        preparedStatement.setString(5, magazine.getPageType());
        preparedStatement.setString(6, magazine.getSize());
        preparedStatement.setInt(7, magazine.getNumber());


        preparedStatement.executeUpdate();

        magazine.setId(getMaxId());
        return magazine;
    }

    public int getMaxId() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select max(id) from magazine_table");
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }

}
