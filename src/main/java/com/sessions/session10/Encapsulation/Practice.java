package com.sessions.session10.Encapsulation;

public class Practice
{
    public static void main(String[] args)
    {
        UserProfileR user=new UserProfileR();
        System.out.println(user.getFirstName());
        user.setFirstName("Alex");
        System.out.println(user.getFirstName());//are valoarea Alex



    }
}
