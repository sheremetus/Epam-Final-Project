package com.epam.hotel.dao;

import com.epam.hotel.dao.SQLDao.SQLGuestInfoDao;
import com.epam.hotel.dao.SQLDao.SQLUserDao;

public class DaoProvider {

    private static final DaoProvider instance = new DaoProvider();
    private final UserDao userDao = new SQLUserDao();

    private final GuestInfoDao guestInfoDao = new SQLGuestInfoDao();

    public static DaoProvider getInstance() {
        return instance;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public GuestInfoDao getGuestInfoDao() {
        return guestInfoDao;
    }

}
