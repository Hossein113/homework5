package com.homework.jdbc.example.repositori;

import com.homework.jdbc.example.domain.Book;

import java.sql.*;

public class BookRepository {

    private Connection connection;

    public BookRepository(Connection db) {

        this.connection = db;

    }

    public Book insertBook(Book book) throws SQLException {

        String insertQuery = "insert into book_table (name,price,made_in,title,pages_number,writer," +
                "publisher,print_year,number) values (?,?,?,?,?,?,?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, book.getName());
        preparedStatement.setInt(2, book.getPrice());
        preparedStatement.setString(3, book.getMadeIn());
        preparedStatement.setString(4, book.getTitle());
        preparedStatement.setInt(5, book.getPagesNumber());
        preparedStatement.setString(6, book.getWriter());
        preparedStatement.setString(7, book.getPublisher());
        preparedStatement.setInt(8, book.getPrintYear());
        preparedStatement.setInt(9, book.getNumber());

        preparedStatement.executeUpdate();

        book.setId(getMaxId());
        return book;
    }

    public int getMaxId() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select max(id) from book_table");
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }


}
