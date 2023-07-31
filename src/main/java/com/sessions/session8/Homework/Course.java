package com.sessions.session8.Homework;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;  // the name of the course - e.g. "Software Development with Java 1"
    private String courseId; // the id of the course - e.g. SDJ1
    private String courseDescription; // contains all the relevant information about the course.
    private boolean isMandatoryCourse; // marks if a course is mandatory.
    private int semester; // the semester in which the course should be thought
    private int ectsPoints; // the points received for completing the course.



    private List<Professor> professors; // list of professors that have the skills to teach this course.





    //constructor
    public Course(String courseName,String courseId,String courseDescription, boolean isMandatoryCourse,int semester,int ectsPoints){
           this.courseName=courseName;
           this.courseId=courseId;
           this.courseDescription=courseDescription;
           this.isMandatoryCourse=isMandatoryCourse;
           this.semester=semester;
           this.ectsPoints=ectsPoints;
           this.professors=new ArrayList<>();


    }

    // --------------- Getters --------------------
    public String getCourseName(){
        return this.courseName;
 }

    public String getCourseId() {
        return this.courseId;
    }
    public String getCourseDescription(){
        return this.courseDescription;
    }

    public int getSemester() {
        return this.semester;
    }

    public int getEctsPoints(){
        return this.ectsPoints;
    }

    public List<Professor> getProfessors(){
        return this.professors;
    }




    //--------- Setters---------
    public void setCourseDescription(String courseDescription){
        this.courseDescription=courseDescription;
    }

    public void setEctsPoints(int ectsPoints){
        this.ectsPoints=ectsPoints;
    }
    public void setMandatoryCourse(boolean mandatoryCourse){
        this.isMandatoryCourse=mandatoryCourse;
    }



    //-------- Methods ----------
    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }

    public void addProfessors(List<Professor> professors){
        this.professors.addAll(professors);
    }

    public void removeProfessor(Professor professor){
        this.professors.remove(professor);
    }





    public void displayAllProfessorsForThisCourse(){
        System.out.println();
        System.out.println(courseName+ " can be teached by: ");
        for(Professor p:professors){
            System.out.println(p.getName());
        }
    }




















}
