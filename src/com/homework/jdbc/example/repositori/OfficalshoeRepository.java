package com.homework.jdbc.example.repositori;

import com.homework.jdbc.example.domain.OfficalShoe;

import java.sql.*;

public class OfficalshoeRepository {

    Connection connection;

    public OfficalshoeRepository(Connection connection) {

        this.connection = connection;
    }

    public OfficalShoe insertOfficalShoe(OfficalShoe oficalShoe) throws SQLException {

        String insertQuery = "insert into officalshoe_table( name, price,material,color" +
                ",following_layer_type,number) values (?,?,?,?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, oficalShoe.getName());
        preparedStatement.setInt(2, oficalShoe.getPrice());
        preparedStatement.setString(3, oficalShoe.getMaterial());
        preparedStatement.setString(4, oficalShoe.getColor());
        preparedStatement.setString(5, oficalShoe.getFollowingLayerType());
        preparedStatement.setInt(6, oficalShoe.getNumber());
        preparedStatement.executeUpdate();
        oficalShoe.setId(getMaxId());
        return oficalShoe;
    }

    private int getMaxId() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select max(id) from officalshoe_table");
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }

}

