package com.epam.hotel.controller;

import com.epam.hotel.command.Command;
import com.epam.hotel.command.CommandProvider;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SessionServlet", value = "/session")
public class SessionController extends HttpServlet {

    private static final CommandProvider provider = CommandProvider.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String commandName;
        Command command;


        commandName =request.getParameter(RequestParameterName.REQ_PARAM_COMMAND_NAME);
        command = provider.getCommand(commandName);

        command.execute(request,response);



    }
}
