package com.epam.hotel.dao;

import com.epam.hotel.bean.User;

public interface UserDao extends CrudDao<User> {
    User authorization(String login, String password) throws DAOException;
}
