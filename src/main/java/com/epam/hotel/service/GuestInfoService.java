package com.epam.hotel.service;

import com.epam.hotel.bean.Guest;

public interface GuestInfoService {
    void updateInfo(String name, String surname,int user_id) throws ServiceException;
}
