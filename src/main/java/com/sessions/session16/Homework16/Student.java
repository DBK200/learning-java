package com.sessions.session16.Homework16;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int studentId;
    private String email;

    public Student(String name, int age, int studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    public boolean equals(Object object){
        if(object==null)
            return false;
        if (object==this)
            return true;
        if (!(object instanceof Student))
            return false;

        Student student=(Student) object;
        return name.equals(student.name)&&age==student.age&&email.equals(student.email);
    }
    public int hashCode(){
        return Objects.hash(name, age,email);
    }
}
