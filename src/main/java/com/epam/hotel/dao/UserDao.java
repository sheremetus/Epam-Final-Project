package com.epam.hotel.dao;

import com.epam.hotel.bean.User;

public interface UserDao extends CrudDao<User> {
    void registration(String login, String password) throws DAOException;

    User getUser(int id);

    User getUser(String login, String password);

}
