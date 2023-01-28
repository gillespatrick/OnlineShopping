package com.shop.service;

import com.shop.dao.UserDAO;
import com.shop.model.User;
import java.sql.SQLException;

public class UserServices {

    private UserDAO userDAO;

    public UserServices(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    public void createUser(User user) throws SQLException, ClassNotFoundException {
       
        userDAO.addUser(user);
        
    }


}
