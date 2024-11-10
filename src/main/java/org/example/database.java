package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

    private static String url = "jdbc:mysql://localhost:3306/test";
    private static String user = "root";
    private static String password = "AKANKSHA@SQL";

    private database() {
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

}
