package com.sessions.session20;

public class UserCreateService {

    public void createUser(String nume,int age)throws UserCreateException{
        if (age<0){
            throw new UserCreateException();
        }
    }
}
