package com.epam.hotel.service.validation;

public class GuestInfoValidator {
    //Singleton
    private static final GuestInfoValidator instance = new GuestInfoValidator();

    private GuestInfoValidator() {
    }


    public boolean check(String name, String surname) {
        return true;
    }

    public static GuestInfoValidator getInstance() {
        return instance;
    }
}
