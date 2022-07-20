package com.epam.hotel.command.commandImpl;

import com.epam.hotel.bean.User;
import com.epam.hotel.command.Command;
import com.epam.hotel.dao.SQLUserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AuthorizationCommand implements Command {
   private SQLUserDao sqlUserDao = new SQLUserDao();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter pw = response.getWriter();
        String login = request.getParameter("login-in");
        String password = request.getParameter("password-in");
        User user;
        if ( (user = sqlUserDao.getUser(login, password)) != null) {
            request.setAttribute("Login", login);
            request.getServletContext().getRequestDispatcher("/jsp/guestSession.jsp").forward(request,response);


        }
        else{
            pw.println("Please register!");
        }
    }
}
