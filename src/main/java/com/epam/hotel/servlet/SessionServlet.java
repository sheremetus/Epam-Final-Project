package com.epam.hotel.servlet;

import com.epam.hotel.bean.User;
import com.epam.hotel.dao.SQLUserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet", value = "/session")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SQLUserDao sqlUserDao = new SQLUserDao();
        PrintWriter pw = response.getWriter();
        String login = request.getParameter("login-in");
        String password = request.getParameter("password-in");
        User user;
        if ( (user = sqlUserDao.getUser(login, password)) != null) {
            request.setAttribute("Login", login);
            getServletContext().getRequestDispatcher("/jsp/guestSession.jsp").forward(request,response);


        }
        else{
            pw.println("Please register!");
        }

    }
}
