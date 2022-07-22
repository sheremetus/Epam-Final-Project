package com.epam.hotel.service;

import com.epam.hotel.bean.User;
import com.epam.hotel.dao.DAOException;
import com.epam.hotel.dao.DaoProvider;
import com.epam.hotel.dao.UserDao;
import com.epam.hotel.service.validation.UserDataValidator;

public class UserServiceImpl implements UserService {

    private static final UserDataValidator validator = UserDataValidator.getInstance();

    @Override
    public User authorization(String login, String password) throws ServiceException {

        if(!validator.check(login, password)){
         throw new ServiceException("User Service Exception!");
        }
        UserDao userDao = DaoProvider.getInstance().getUserDao();

        User user;
        try {
            user = userDao.getUser(login, password);
        }catch (DAOException e){
            throw  new ServiceException(e);
        }
        return user;
    }
}
