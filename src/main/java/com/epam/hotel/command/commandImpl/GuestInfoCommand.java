package com.epam.hotel.command.commandImpl;

import com.epam.hotel.bean.Guest;
import com.epam.hotel.command.Command;
import com.epam.hotel.controller.RequestParameterName;
import com.epam.hotel.service.GuestInfoService;
import com.epam.hotel.service.ServiceException;
import com.epam.hotel.service.ServiceProvider;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GuestInfoCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int user_id = Integer.parseInt(request.getParameter(RequestParameterName.REQ_PARAM_USER_ID));
        String name = request.getParameter(RequestParameterName.REQ_PARAM_NAME);
        String surname = request.getParameter(RequestParameterName.REQ_PARAM_SURNAME);
        GuestInfoService guestInfoService = ServiceProvider.getInstance().getGuestInfoService();


        try {

            guestInfoService.updateInfo(name, surname, user_id);

        } catch (ServiceException e) {

            e.printStackTrace();
        }
    }
}
