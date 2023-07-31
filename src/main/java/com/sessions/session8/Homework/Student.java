package com.sessions.session8.Homework;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Student {


    //--------- Instance variables ---------

    //some
    private String name;
    private int studentNumber;

    private LocalDate startDate;

    private int currentSemester;

    private List<Course> passedCourses;
    private List<Course> failedCourses;
    private List<Course> enrolledCourses;

    public Student(String name,int studentNumber, LocalDate startDate){
        this.name=name;
        this.studentNumber=studentNumber;
        this.startDate=startDate;
        this.currentSemester=1;
        enrolledCourses=new ArrayList<>();
        this.failedCourses=new ArrayList<>();
        this.passedCourses=new ArrayList<>();

    }

    //------- Getters ----------
    public String getStudentName(){
        return this.name;
    }

    public int getStudentNumber(){
        return this.studentNumber;
    }
    public LocalDate getStartDate(){
        return this.startDate;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    //------- Methods -------

    public void enrollInCourse(Course course){
        enrolledCourses.add(course);
    }

    public void enrollInMultipleCourses(List<Course> courses){

        enrolledCourses.addAll(courses);
    }

    public void markCourseAsPassed(Course course){
        int courseIndex=this.enrolledCourses.indexOf(course);
     if(courseIndex!=-1  ){
         this.passedCourses.add(course);
         this.enrolledCourses.remove(course);
     }else{
         System.out.println("The student was not enrolled in this course");
     }
    }
    public void markCourseAsFailed(Course course){
        int courseIndex=this.enrolledCourses.indexOf(course);
        if(courseIndex!=-1  ){
            this.failedCourses.add(course);
            this.enrolledCourses.remove(course);
        }else{
            System.out.println("The student was not enrolled in this course");
        }
    }

    public int getTotalEctsPoints(){
        int totalEctsPoints=0;
        for(Course c:passedCourses){
            totalEctsPoints+=c.getEctsPoints();
        }
        return totalEctsPoints;
    }

    public int getEctsPointsPerSemester(int semesterNumber){
        int ectsPoints=0;
        for(Course c:passedCourses){
            if(c.getSemester() == semesterNumber){
                ectsPoints+=c.getEctsPoints();
            }

        }
        return ectsPoints;
    }

    public void studentInfo(){
        System.out.println(name + " - " + studentNumber);
    }

    public void studentFullInfo(){
        System.out.println("-------------------------------------");
        System.out.println(name + " - " + studentNumber);
        System.out.println("Enrolled in semester: "+ this.currentSemester);
        System.out.println();
        System.out.println("Course enrolled: ");
        for(Course c:enrolledCourses){
            System.out.println(c.getCourseName() );
        }
        System.out.println();
        System.out.println("Passed courses");
        for(Course c:passedCourses){
            System.out.println(c.getCourseName() );
        }

        System.out.println();
        System.out.println("Failed courses");
        for(Course c:failedCourses){
            System.out.println(c.getCourseName() );
        }

        System.out.println("-------------------------------------");
        System.out.println();


    }


}
