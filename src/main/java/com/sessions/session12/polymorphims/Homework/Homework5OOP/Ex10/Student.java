package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex10;

import java.util.ArrayList;

public class Student {

    private String name;
    private int grade;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public void addCourse(String course){
        courses.add(course);
    }
    public void removeCourse(String course){
        courses.remove(course);
    }
    public ArrayList <String> getCourses(){
        return courses;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
