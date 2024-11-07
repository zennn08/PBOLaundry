/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aqul.pbolaundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Database {
    private static Connection conn;
    public static Connection Connect() throws SQLException {
        if (conn == null) {
            String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/db_laundry";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(jdbcUrl, username, password);
        }
        return conn;
    }
}
