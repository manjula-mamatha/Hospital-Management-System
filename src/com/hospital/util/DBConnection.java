package com.hospital.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/hospitaldb";
    private static final String USER = "root";
    private static final String PASSWORD = "Rakshitha@123";

    public static Connection getConnection() throws SQLException {

        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        if (con != null) {
            System.out.println("Database Connected Successfully");
        }

        return con;
    }
}
