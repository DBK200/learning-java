package com.sessions.session9;

public class Animal {

    private String name;
    private int age;
    private String family;

    public Animal(){}
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal(String name, int age, String family){
        this.name = name;
        this.age = age;
        this.family = family;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setFamily(String family){
        this.family = family;
    }

    public String getFamily() {
        return family;
    }
}
