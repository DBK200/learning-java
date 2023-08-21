package com.sessions.session12.HomeworkAV.challenge1.example1;

public class Student extends User implements Person {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getEmail(){
        return "test@gmail.com";
    }
}
