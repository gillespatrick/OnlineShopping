package com.shop.controller.users;

import com.shop.dao.UserDAO;
import com.shop.model.User;
import com.shop.service.UserServices;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gilles
 */
@WebServlet(name = "registration", urlPatterns = {"/registration"})
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/users/signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            insert(request, response);
            request.setAttribute("message", "The new user is created successfully !");
            this.getServletContext().getRequestDispatcher("/WEB-INF/users/signin.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    protected void insert(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobileNumber = request.getParameter("mobilenumber");
        String security = request.getParameter("security");
        String answer = request.getParameter("answer");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String apt = request.getParameter("apt");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String codeZip = request.getParameter("codeZip");

        User user;
        user = new User(name, email, mobileNumber, security, answer, password, address, apt, city, state, codeZip);
        UserDAO userDAO = new UserDAO();
        userDAO.addUser(user);

    }

}
