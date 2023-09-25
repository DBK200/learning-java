package com.sessions.session20;

import com.sessions.session11.abstraction.defaultMethod.A;

public class UserCreateService {
    public static void main(String[] args) {
        createUser("asa", 12);
    }


    public static void createUser(String name, int age)throws UserCreateException{
//        if (age < 0){
//            throw new UserCreateException();
//        }
        int result = age/0;
        throw new ArithmeticException();

    }
}
