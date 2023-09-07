package com.sessions.homework13plus.h13.OOP2.Encapsulation;

public class Person {

    //Encapsulation:
    //Create a class Person with private attributes such as name, age, and address. Implement methods such as
    //getName(), getAge(), and getAddress() that return the values of these attributes. Implement setter methods
    //such as setName(), setAge(), and setAddress() that allow you to modify these attributes safely and securely,
    //while maintaining proper data encapsulation.
    private String name, adress;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
