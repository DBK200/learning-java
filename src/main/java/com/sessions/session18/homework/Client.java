package com.sessions.session18.homework;

public class Client {
    private int age;
    public Client(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Age: " + age;
    }
}
