package com.shop.dao;

import com.shop.connect.Connect;
import com.shop.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gilles
 */
public class UserDAO {

    /**
     * Method addUser
     * Here we set all the fields of user
     * @param user
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     * 
     */
    public void addUser(User user) throws SQLException, ClassNotFoundException {

        try {
            
            Connect connect = new Connect();
           Connection connection = connect.getConnection();

           
            String sql = "insert into users"
                    + " (name,email,mobileNumber,security,answer,password,address,apt,city,state,codeZip)"
                    + " values(?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getMobileNumber());
            preparedStatement.setString(4, user.getSecurity());
            preparedStatement.setString(5, user.getAnswer());
            preparedStatement.setString(6, user.getPassword());
            preparedStatement.setString(7, user.getAddress());
            preparedStatement.setString(8, user.getApt());
            preparedStatement.setString(9, user.getCity());
            preparedStatement.setString(10, user.getState());
            preparedStatement.setString(11, user.getCodeZip());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

}
