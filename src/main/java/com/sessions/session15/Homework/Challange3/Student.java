package com.sessions.session15.Homework.Challange3;


import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int studentId;
    private String email;

    public Student(String name, int age, int studentId, String email){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Student student)){
            return false;
        }
        return name.equals(student.name) && age == student.age && email.equals(student.email);
    }

    public int hashCode(){
        return Objects.hash(name, age, email);
    }
}
