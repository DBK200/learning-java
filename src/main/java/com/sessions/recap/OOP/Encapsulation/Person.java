package com.sessions.recap.OOP.Encapsulation;

public class Person {

//    Create a class Person with private attributes such as name, age, and address.
//    Implement methods such as getName(), getAge(), and getAddress() that return the
//    values of these attributes. Implement setter methods such as setName(), setAge(),
//    and setAddress() that allow you to modify these attributes safely and securely, while
//    maintaining proper data encapsulation.

    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
