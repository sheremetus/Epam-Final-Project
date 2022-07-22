package com.epam.hotel.service;

import com.epam.hotel.dao.DaoProvider;
import com.epam.hotel.dao.SQLUserDao;
import com.epam.hotel.dao.UserDao;

public class ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();

    private UserService userService = new UserServiceImpl();

    private ServiceProvider() {
    }

    private ServiceProvider(UserService userService) {
        this.userService = userService;
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }


}
