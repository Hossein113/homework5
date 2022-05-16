package com.homework.jdbc.example.repositori;

import com.homework.jdbc.example.domain.Radio;

import java.sql.*;

public class RadioRepository {

    private Connection connection;

    private Radio[] radioList;


    public RadioRepository(Connection db) {

        this.connection = db;
    }

    public Radio insertRadio(Radio radio) throws SQLException {

        String insertQuery = "insert into radio_table (name , price , made_in , color , size , voltage_in ,channel_number," +
                " speaker_number ,weight , brand,number) values (?,?,?,?,?,?,?,?,?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, radio.getName());
        preparedStatement.setInt(2, radio.getPrice());
        preparedStatement.setString(3, radio.getMadeIn());
        preparedStatement.setString(4, radio.getColor());
        preparedStatement.setString(5, radio.getSize());
        preparedStatement.setString(6, radio.getVoltageIn());
        preparedStatement.setInt(7, radio.getChannelNumber());
        preparedStatement.setInt(8, radio.getSpeakerNumber());
        preparedStatement.setString(9, radio.getWeight());
        preparedStatement.setString(10, radio.getBrand());
        preparedStatement.setInt(11, radio.getNumber());

        preparedStatement.executeUpdate();

        radio.setId(getMaxId());
        return radio;
    }

    public int getMaxId() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select max(id) from radio_table");
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }


    public Radio[] getRadioList() {
        return radioList;
    }

    public void setRadioList(Radio[] radioList) {
        this.radioList = radioList;
    }
}

