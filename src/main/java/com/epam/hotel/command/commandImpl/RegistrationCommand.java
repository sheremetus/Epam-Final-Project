package com.epam.hotel.command.commandImpl;

import com.epam.hotel.command.Command;
import com.epam.hotel.dao.DAOException;
import com.epam.hotel.dao.SQLUserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        try {
            SQLUserDao sqlUserDao = new SQLUserDao();

            sqlUserDao.registration(login, password);
            response.sendRedirect("/");
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}
