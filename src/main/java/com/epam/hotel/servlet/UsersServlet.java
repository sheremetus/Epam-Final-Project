package com.epam.hotel.servlet;

import com.epam.hotel.bean.User;
import com.epam.hotel.dao.DAOException;
import com.epam.hotel.dao.SQLUserDao;
import com.epam.hotel.pool.ConnectionPool;
import com.epam.hotel.pool.ConnectionPoolException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class UsersServlet extends HttpServlet {

    public void init(ServletConfig servletConfig) {
        try {
            super.init(servletConfig);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("hello");
        getServletContext().getRequestDispatcher("/jsp/addUser.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        String login = request.getParameter("login-up");
        String password = request.getParameter("password-up");

        try {
            SQLUserDao sqlUserDao = new SQLUserDao();

            sqlUserDao.authorization(login, password);
            response.sendRedirect("/users");
        } catch (DAOException e) {
            e.printStackTrace();
        }

    }
}