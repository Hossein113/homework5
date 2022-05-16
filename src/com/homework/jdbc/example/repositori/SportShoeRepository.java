package com.homework.jdbc.example.repositori;

import com.homework.jdbc.example.domain.SportShoe;

import java.sql.*;

public class SportShoeRepository {

    private Connection connection;

    public SportShoeRepository(Connection connection) {

        this.connection = connection;
    }

    public SportShoe insertSportShoe(SportShoe sportShoe) throws SQLException {

        String insertQuery = "insert into sportshoe_table ( name, price ,material, color ,stra_type ," +
                "sport_type ,number ) values (?,?,?,?,?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, sportShoe.getName());
        preparedStatement.setInt(2, sportShoe.getPrice());
        preparedStatement.setString(3, sportShoe.getMaterial());
        preparedStatement.setString(4, sportShoe.getColor());
        preparedStatement.setString(5, sportShoe.getStraType());
        preparedStatement.setString(6, sportShoe.getSportType());
        preparedStatement.setInt(7, sportShoe.getNumber());


        preparedStatement.executeUpdate();

        sportShoe.setId(getMaxId());
        return sportShoe;
    }

    private int getMaxId() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select max(id) from sportshoe_table");
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }

}
