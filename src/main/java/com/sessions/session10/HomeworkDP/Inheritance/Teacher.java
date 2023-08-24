package com.sessions.session10.HomeworkDP.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff{


    List<String> courses;

    public Teacher(String email, String password, String name, String address, double salary, String department) {
        super(email, password, name, address, salary, department);
        this.courses=new ArrayList<>();
    }

    public void addCourse(String course){
        courses.add(course);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department "+super.getDepartment());
        System.out.println("Courses: "+courses);
    }
}
