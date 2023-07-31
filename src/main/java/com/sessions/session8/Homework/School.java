package com.sessions.session8.Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class School {

     StudentManagement students;
    private int studentCounter;

    List<Professor> professors;
    List<Course> courses;




    public School(){
        this.students=new StudentManagement();
        this.courses=new ArrayList<>();
        this.professors=new ArrayList<>();
        this.studentCounter=0;

    }

    //------Getters----------
    public StudentManagement getStudents(){
        return this.students;
    }

    public List<Course> getCourses(){
        return this.courses;
    }

    public List<Professor> getProfessors(){
        return this.professors;
    }
//----------------------- Student methods -------------------------------
    public void enrollStudentsInProgramme(String name, LocalDate startDate){
        if(name.isEmpty()){
            System.out.println("Name shouldn't be empty");
            return;
        }
        if(startDate==null){
            System.out.println("startDate shouldn't be empty");
            return;
        }
        this.students.enrollStudentsInProgramme(name,startDate);
    }
    public void enrollStudentsForSemesterCourses(int semesterNumber){


        List<Course> courses=getAllCoursesForASemester(semesterNumber);
        if(courses==null || courses.size()==0){
            System.out.println("No courses found");
            return;
        }

        this.students.enrollStudentsForSemesterCourses(semesterNumber,courses);



    }








    //-------------------------------------------------------------------



    //--------------------- Courses ----------------------------
    public void addCourseForTheProgramme(String courseName,String courseId,String courseDescription, boolean isMandatoryCourse,int semester,int ectsPoints){
        //suppose that all arguments are passed correctly
        courses.add(new Course(courseName,courseId,courseDescription,isMandatoryCourse,semester,ectsPoints));
    }

    public List<Course> getAllCoursesForASemester(int semesterNumber){
        if(courses.size()==0){
            System.out.println("There are no courses for this programme");
            return null;
        }
        List<Course> coursesForSemester=new ArrayList<>();
        for(Course c:courses){
            if(c.getSemester()==semesterNumber){
                coursesForSemester.add(c);
            }
        }
        return coursesForSemester;
    }



    public Course getCourseById(String courseId){
        for(Course c: courses){
            if(c.getCourseId().equals(courseId)){
                return c;
            }
        }
        System.out.println("No courses found");
        return null;
    }

    //----------- Professors------------------------
    public void addProfessorsForTheProgramme(Professor professor){
        this.professors.add(professor);
    }


    //---------- Class----------

    /**
     * Creates a class for a course.
     * @param course the course that is thought in this class
     * @param professor the professor responsible for this class
     * @param students  the students assigned for this class.
     * @return the newly created Class object
     */
    public Class createClass(Course course,Professor professor,List<Student> students){

       return  new Class(course,professor,students);



    }










}
