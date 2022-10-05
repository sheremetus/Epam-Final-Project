package com.epam.hotel.service.serviceImpl;

import com.epam.hotel.bean.Guest;
import com.epam.hotel.dao.DAOException;
import com.epam.hotel.dao.DaoProvider;
import com.epam.hotel.dao.GuestInfoDao;
import com.epam.hotel.pool.ConnectionPoolException;
import com.epam.hotel.service.GuestInfoService;
import com.epam.hotel.service.ServiceException;
import com.epam.hotel.service.validation.GuestInfoValidator;


public class GuestInfoServiceImpl implements GuestInfoService {

    private static final GuestInfoValidator validator = GuestInfoValidator.getInstance();
    GuestInfoDao guestInfoDao = DaoProvider.getInstance().getGuestInfoDao();

    @Override
    public void updateInfo(String name, String surname, int user_id) throws ServiceException {
        if (!validator.check(name, surname)) {
            throw new ServiceException("User Service Exception!");
        }


        try {
            guestInfoDao.addOrUpdateInfoAboutGuest(name, surname, user_id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

    }

    @Override
    public Guest find(int id) {
        Guest guest = null;
        try {
            guest = guestInfoDao.find(id);
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        }
        return guest;
    }
}

