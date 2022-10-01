package com.epam.hotel.command.commandImpl;

import com.epam.hotel.command.Command;
import com.epam.hotel.controller.JSPPageName;
import com.epam.hotel.dao.DAOException;
import com.epam.hotel.dao.SQLDao.SQLUserDao;

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
//Делаем перенаправление на главную страницу
            request.getServletContext().getRequestDispatcher(JSPPageName.USER_AUTH_PAGE).forward(request, response);


        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}
