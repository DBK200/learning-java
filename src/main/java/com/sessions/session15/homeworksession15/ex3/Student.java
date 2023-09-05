package com.sessions.session15.homeworksession15.ex3;

    // 3. Create a Student class with name, age, studentId, and email fields.
    // Implement the equals() method to check all fields except the studentId.
    // Implement the hashCode() method to use all fields except the studentId
    // to calculate the hash code. Test that two instances with the same name, age,
    // and email return true for equals() and have the same hash code.

public class Student {

    private String name;
    private int age;
    private int studentId;
    private String email;

    // All args constructor
    public Student(String name, int age, int studentId, String email){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

}
