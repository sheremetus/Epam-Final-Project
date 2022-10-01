package com.epam.hotel.service;

import com.epam.hotel.service.serviceImpl.GuestInfoServiceImpl;
import com.epam.hotel.service.serviceImpl.UserServiceImpl;

public class ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();

    private UserService userService = new UserServiceImpl();
    private GuestInfoService guestInfoService = new GuestInfoServiceImpl();

    private ServiceProvider() {
    }

    private ServiceProvider(UserService userService, GuestInfoService guestInfoService) {
        this.userService = userService;
        this.guestInfoService = guestInfoService;
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public GuestInfoService getGuestInfoService() {
        return guestInfoService;
    }


}
