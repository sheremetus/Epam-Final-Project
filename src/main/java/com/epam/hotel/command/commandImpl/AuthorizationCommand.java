package com.epam.hotel.command.commandImpl;

import com.epam.hotel.bean.User;
import com.epam.hotel.command.Command;
import com.epam.hotel.controller.JSPPageName;
import com.epam.hotel.controller.RequestParameterName;
import com.epam.hotel.dao.SQLUserDao;
import com.epam.hotel.service.ServiceException;
import com.epam.hotel.service.ServiceProvider;
import com.epam.hotel.service.UserService;

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
        String login = request.getParameter(RequestParameterName.REQ_PARAM_LOGIN);
        String password = request.getParameter(RequestParameterName.REQ_PARAM_PASSWORD);
        String role = request.getParameter(RequestParameterName.REQ_PARAM_ROLE);

        UserService userService = ServiceProvider.getInstance().getUserService();
        User user;

        try {
            if (role == null) {
                user = userService.authorization(login, password, 1);
            } else {
                user = userService.authorization(login, password, 2);
            }

            if (user != null) {
                request.setAttribute("user", user);

                request.getServletContext().getRequestDispatcher(JSPPageName.USER_AUTH_PAGE).forward(request, response);


            } else {
                pw.println("Please register!");
            }


        } catch (ServiceException e) {

        }


    }
}
