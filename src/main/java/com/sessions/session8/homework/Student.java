package com.sessions.session8.homework;

import java.time.LocalDate;

public class Student {

    private long cnp;
    private String lastName;
    private String firstName;
    private String faculty;
    private String facultyIdentificationCard;

    public long getCnp() {
        return cnp;
    }
    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFacultyIdentificationCard() {
        return facultyIdentificationCard;
    }
    public void generateFacultyIdentificationCard(){
        facultyIdentificationCard = "FID" + cnp/10000 + "Y" + LocalDate.now().getYear();
    }

    public Student(){};
    public Student(long cnp, String lastName, String firstName, String faculty){
        this.cnp = cnp;
        this.lastName = lastName;
        this.firstName = firstName;
        this.faculty = faculty;
        generateFacultyIdentificationCard();
    }

}
