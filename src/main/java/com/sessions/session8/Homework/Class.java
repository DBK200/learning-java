package com.sessions.session8.Homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Class {

    private Course course; //the course that is taught in the class
    private Professor professor; //the professor teaching the class
    private List<Student> students; // the list of students for this class


    public Class(Course course,Professor professor,List<Student> students){
        this.course=course;
        this.professor=professor;
        this.students=students;
    }

    /**
     * Additional constructor for creating a class for a course without assinging a professor
     * and a list of students.
     * @param course
     */
    public Class(Course course){
        this.course=course;

    }

    //----------- Getters-----------
    public Course getCourse(){
        return this.course;
    }
    public List<Student> getStudents(){
        return this.students;
    }

    public Professor getProfessor(){
        return this.professor;
    }

    //--------- Setters ---------------
    public void setProfessor(Professor professor){
        this.professor=professor;
    }

    public void setStudents(List<Student> students){
       this.students=students;
    }

    //--------- Methods -------------

    /**
     * Method to add additional student to the students list.
     * @param student
     */
    public void addStudentToClass(Student student){
      //  student.enrollInCourse(course);
        this.students.add(student);
    }

    /**
     * The method updates the passed and failed courses lists for a student based on the grade.
     * It doesn't actually add a grade.
     * @param student The student which receives the grade.
     * @param grade The grade from examination
     */
    public void addGrade(Student student,int grade){
        if(grade>=5){
            student.markCourseAsPassed(course);
        }else{
            student.markCourseAsFailed(course);
        }
    }

    public void displayInfoAboutClass(){
        System.out.println("Class for course : "+ course.getCourseName());
        System.out.println("Teached by: "+ professor.getName());
        System.out.println("-------------------------------");
        for(Student s:students){
            s.studentInfo();
        }
    }
}
