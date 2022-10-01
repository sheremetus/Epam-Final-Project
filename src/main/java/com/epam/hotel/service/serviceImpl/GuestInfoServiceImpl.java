package com.epam.hotel.service.serviceImpl;

import com.epam.hotel.bean.Guest;
import com.epam.hotel.dao.DAOException;
import com.epam.hotel.dao.DaoProvider;
import com.epam.hotel.dao.GuestInfoDao;
import com.epam.hotel.service.GuestInfoService;
import com.epam.hotel.service.ServiceException;
import com.epam.hotel.service.validation.GuestInfoValidator;
import com.epam.hotel.service.validation.UserDataValidator;

public class GuestInfoServiceImpl implements GuestInfoService {

    private static final GuestInfoValidator validator = GuestInfoValidator.getInstance();

    @Override
    public void updateInfo(String name, String surname, int user_id) throws ServiceException {
        if (!validator.check(name, surname)) {
            throw new ServiceException("User Service Exception!");
        }
        GuestInfoDao guestInfoDao = DaoProvider.getInstance().getGuestInfoDao();

        try {
            guestInfoDao.addOrUpdateInfoAboutGuest(name, surname, user_id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

    }
}

