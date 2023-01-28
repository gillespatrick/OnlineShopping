package com.shop.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {


    private String url = "jdbc:mariadb://localhost:3306/onlineShop?useSSL =false";
    private String user = "gilles";
    private String password = "gillespatr9ck";

    public Connection getConnection() throws ClassNotFoundException {

        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return connection;
    }
}
