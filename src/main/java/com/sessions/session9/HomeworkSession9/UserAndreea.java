package com.sessions.session9.HomeworkSession9;

import java.time.LocalDate;
import java.time.Period;

public class UserAndreea {

    // Instance variables
    private String fullName;
    private LocalDate dateOfBirth;
    private double weight;
    private double height;
    private boolean isStudent;

    // Static variables
    public static String gender = "female";
    public static String defaultCountry = "Romania";

    // Static methods
    public static String printGender(){
        return gender;
    }

    public static String printDefaultCountry(){
        return defaultCountry;
    }

    // No args constructor
    public UserAndreea(){

    }

    // All args constructor
    public UserAndreea(String fullName, LocalDate dateOfBirth, double weight, double height, boolean isStudent){
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
            this.weight = weight;
            this.height = height;
            this.isStudent = isStudent;
    }

    // Getters and setters
    // Getters
    public String getFullName(){
        return fullName;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

    public boolean isStudent(){
        return isStudent;
    }

    // Setters
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setStudent(boolean isStudent){
        this.isStudent = isStudent;
    }

    // Methods
    public int calculateAge(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        int age = period.getYears();
        return age;
    }

    // calculeaza indicele de masa corporala
    public double calculateBMI(){
        double bmi = weight / (Math.pow(height, 2));
        bmi = Math.round(bmi*100)/100;
        return bmi;
    }

}
