package com.sessions.session12.homework.OOP;

import com.sun.source.doctree.ReferenceTree;

public class User
{
    String name;
    int age;
    int phoneNumber;
    String occupation;
    String email;
    User()
    {

    }
    User (String name,int age,int phoneNumber,String occupation,String email)
    {
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.occupation=occupation;
        this.email=email;
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    int getPhoneNumber()
    {
        return phoneNumber;
    }
    String getOccupation()
    {
        return occupation;
    }
    String getEmail()
    {
        return email;
    }
}
