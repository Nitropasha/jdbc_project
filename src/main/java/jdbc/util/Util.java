package jdbc.util;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static Connection getConnection() {
        String dbURL = "jdbc:mysql://localhost:3306/mydbtest";
        String dbUser = "root";
        String dbPass = "goldrain";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL, dbUser, dbPass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;

    }
}
