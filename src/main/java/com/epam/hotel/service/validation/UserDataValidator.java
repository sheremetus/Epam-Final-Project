package com.epam.hotel.service.validation;

public class UserDataValidator {

    private static final UserDataValidator instance = new UserDataValidator();

    private UserDataValidator(){}


    public boolean check(String login, String password){
        return true;
    }

    public static UserDataValidator getInstance(){
        return instance;
    }
}
