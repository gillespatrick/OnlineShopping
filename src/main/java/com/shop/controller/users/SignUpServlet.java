/*
 * Allow to Display Sign Up Page
 */
package com.shop.controller.users;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class SignUpServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        this.getServletContext().getRequestDispatcher("/WEB-INF/users/signup.jsp").forward(request, response);
        
        
        //ou encore nous pouvons faire comme si dessous
        //String url = "/WEB-INF/signup.jsp";
        //this.getServletContext().getRequestDispatcher(url).forward(request, response);
    }  
   
}
