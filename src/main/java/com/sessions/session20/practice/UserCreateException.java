package com.sessions.session20.practice;

// All custom classes that extend Exception class will be
// checked exceptions
public class UserCreateException extends Exception {
    //...
}

class UserCreateService {
    public void createUser(String name, int age) throws UserCreateException {
        if (age < 0) throw  new UserCreateException();
    }

}
