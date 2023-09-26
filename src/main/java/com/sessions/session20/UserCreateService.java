package com.sessions.session20;

public class UserCreateService
{
    public void createUser(int age,String nume) throws UserCreateExceptionR
    {
        if(age<0)
        {
            throw new UserCreateExceptionR();
        }
        //...
    }
}
