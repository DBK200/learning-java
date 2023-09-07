package com.sessions.homework13plus.h14;

import java.util.HashSet;
import java.util.Set;

public class Student {
    String name, email;
    int age, studentId;

    public Student(String name, String email, int age, int studentId) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.studentId = studentId;
    }

    public static void main(String[] args) {
        Student s1 = new Student("John","john@gmail.com", 18, 1);
        Student s2 = new Student("John","john@gmail.com",18,2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() + " " + s2.hashCode());

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {return false;}
        if(obj == this) {return true;}
        if(!(obj instanceof Student)){return false;}

        Student student = (Student) obj;

        return name.equals(student.name) && email.equals(student.email) && age == student.age;

    }

    @Override
    public int hashCode() {
        int result = 54;
        result = 41 * result + email.hashCode();
        result = 41 * result + name.hashCode();
        result = 41 * result + age;
        return result;
    }
}
