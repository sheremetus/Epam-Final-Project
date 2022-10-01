package com.epam.hotel.dao;

import com.epam.hotel.bean.Guest;

public interface GuestInfoDao extends CrudDao<Guest> {
    public void addOrUpdateInfoAboutGuest(String name, String surname,int user_id) throws DAOException;
}
