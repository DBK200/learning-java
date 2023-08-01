package com.sessions.session8.HomeworkSession8;

import java.text.DecimalFormat;

public class Student {

    // properties
    private String firstName;
    private String lastName;
    private int registrationNumber;

    private double course1Grade;
    private double course2Grade;
    private double course3Grade;
    private double course4Grade;
    private double course5Grade;

    // Constructor
    Student(String firstName, String lastName, int registrationNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
    }
    // methods

    // getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getRegistrationNumber(){
        return registrationNumber;
    }

    public double getCourse1Grade(){
        return course1Grade;
    }

    public double getCourse2Grade(){
        return course2Grade;
    }

    public double getCourse3Grade(){
        return course3Grade;
    }

    public double getCourse4Grade(){
        return course4Grade;
    }

    public double getCourse5Grade(){
        return course5Grade;
    }
    // setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setCourse1Grade(double course1Grade){
         this.course1Grade = course1Grade;
    }

    public void setCourse2Grade(double course2Grade){
        this.course2Grade = course2Grade;
    }

    public void setCourse3Grade(double course3Grade){
        this.course3Grade = course3Grade;
    }

    public void setCourse4Grade(double course4Grade){
        this.course4Grade = course4Grade;
    }

    public void setCourse5Grade(double course5Grade){
        this.course5Grade = course5Grade;
    }

    // method to calculate student's media
    public double calculateMedia(){
        double media;
        media = (getCourse1Grade() + getCourse2Grade() + getCourse3Grade() + getCourse4Grade() + getCourse5Grade() )/5;
        double formattedMedia = Math.round(media * 100.0)/100.0;
        return formattedMedia;
    }
}
