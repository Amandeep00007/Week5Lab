/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author amand 
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String logout = request.getParameter("login");
        if(logout != null){
            session.invalidate();
            String note = "You have sucessfully logged out";
            request.setAttribute("message", note);
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        AccountService checked = new AccountService();
        
        if(username == null || username.equals("") && password == null || password.equals("") ){
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            String note = "Enter your username and password";
            request.setAttribute("message", note);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
        user = checked.login(username, password);
        
        if(user != null){
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request, response);  
            
        }else{
            request.setAttribute("username", user);
            request.setAttribute("password", password);
            String note = "Failed authentication";
            request.setAttribute("message", note);
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
          
    }

  
}
  
