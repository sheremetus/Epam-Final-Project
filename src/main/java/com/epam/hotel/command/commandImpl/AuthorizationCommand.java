package com.epam.hotel.command.commandImpl;

import com.epam.hotel.bean.Guest;
import com.epam.hotel.bean.User;
import com.epam.hotel.command.Command;
import com.epam.hotel.controller.JSPPageName;
import com.epam.hotel.controller.RequestParameterName;
import com.epam.hotel.dao.SQLDao.SQLUserDao;
import com.epam.hotel.service.GuestInfoService;
import com.epam.hotel.service.ServiceException;
import com.epam.hotel.service.ServiceProvider;
import com.epam.hotel.service.UserService;
import com.epam.hotel.service.serviceImpl.GuestInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthorizationCommand implements Command {
    private SQLUserDao sqlUserDao = new SQLUserDao();


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession session = request.getSession();

        String login = request.getParameter(RequestParameterName.REQ_PARAM_LOGIN);
        String password = request.getParameter(RequestParameterName.REQ_PARAM_PASSWORD);
        String role = request.getParameter(RequestParameterName.REQ_PARAM_ROLE);

        UserService userService = ServiceProvider.getInstance().getUserService();
        GuestInfoService guestInfoService = ServiceProvider.getInstance().getGuestInfoService();
        User user;
        Guest guest;
        try {
            if (role == null) {
                user = userService.authorization(login, password, 1);
            } else {
                user = userService.authorization(login, password, 2);
            }

            if (user != null) {
                session.setAttribute("user", user);
                guest = guestInfoService.find(user.getId());

                if (guest != null) {
                    session.setAttribute("guest", guest);
                }

                request.getServletContext().getRequestDispatcher(JSPPageName.USER_AUTH_PAGE).forward(request, response);


            } else {
                session.setAttribute("user", "noSuchUser");
                request.getRequestDispatcher(JSPPageName.REGISTRATION_FIELDS).forward(request, response);

            }


        } catch (ServiceException e) {

        }


    }
}
