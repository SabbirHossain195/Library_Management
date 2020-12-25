package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class ApiClient {
    private static Connection connection=null;
    public static java.sql.Connection getInstance() throws SQLException, ClassNotFoundException{
        if(connection==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
        }
        return connection;
    }
    public static void close() {
    }
}
