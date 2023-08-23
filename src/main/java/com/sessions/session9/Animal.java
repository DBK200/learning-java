package com.sessions.session9;

public class Animal {
    protected String name;
    protected int age;
    private String family;

    public Animal(String family, int age, String name) {
        this.family = family;
        this.age = age;
        this.name = name;
    }

    public Animal() {
//        this("wfef",2);
        System.out.println("wefwef");
        System.out.println("wfwef");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Animal(String name) {
        this.name = name;
        this.age = 2;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
