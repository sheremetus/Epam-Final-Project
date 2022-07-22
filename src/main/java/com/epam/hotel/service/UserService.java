package com.epam.hotel.service;

import com.epam.hotel.bean.User;

public interface UserService {

    User authorization(String login, String password) throws ServiceException;

}
