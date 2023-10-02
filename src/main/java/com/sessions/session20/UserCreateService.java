package com.sessions.session20;

public class UserCreateService {

    public void createUser(String nume, int age) throws UserCreatedException{
        if(age<0){
            throw new UserCreatedException();
        }
    }
}
