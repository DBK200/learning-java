package com.sessions.session8.Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> students;
    private int studentCounter;

    public StudentManagement(){

        this.students=new ArrayList<>();
        this.studentCounter=0;
    }


    public Student getStudent(int index){
        return students.get(index);
    }

    public void enrollStudentsInProgramme(String name, LocalDate startDate){
        studentCounter++;
        int studentNumber=generateStudentNumber();
        students.add(new Student(name,studentNumber,startDate));
    }

    public List<Student> getAllStudentsStartingAt(LocalDate date){
        if(studentCounter==0){
            System.out.println("There are no students enrolled in the programme");
            return null;
        }
        List<Student> studentsStartingAtDate=new ArrayList<>();
        for(Student s:students){
            if(date.equals(s.getStartDate())){
                studentsStartingAtDate.add(s);
            }
        }
        return studentsStartingAtDate;


    }
    public List<Student> getAllStudentsInASpecificSemester(int semesterNumber){
        if(studentCounter==0){
            System.out.println("There are no students enrolled in the programme");
            return null;
        }
        List<Student> studentsInSemester=new ArrayList<>();
        for(Student s:students){
            if(semesterNumber==s.getCurrentSemester()){
                studentsInSemester.add(s);
            }
        }
        return studentsInSemester;


    }

    public void enrollStudentsForSemesterCourses(int semesterNumber, List<Course> courses){
        List<Student> students=getAllStudentsInASpecificSemester(semesterNumber);


        if(students==null || students.size()==0){
            System.out.println("No students found");
            return;
        }

        if(courses==null || courses.size()==0){
            System.out.println("No courses found");
            return;
        }

        for(Student s:students){
            s.enrollInMultipleCourses(courses);
        }

    }



    public Student getStudentByNameAndStudyNumber(String name, int studyNumber){
        for(Student s:students){
            if(s.getStudentName().equals(name) && s.getStudentNumber()==studyNumber){
                return s;
            }
        }
        return null;

    }
    public Student getStudentByStudyNumber(int studyNumber){
        for(Student s:students){
            if(s.getStudentNumber()==studyNumber){
                return s;
            }
        }
        return null;
    }

    public void displayAllStudents(){
        displayStudents(this.students);
    }

    public void displayAllStudentsInSemester(int semesterNumber){
        List<Student> students=getAllStudentsInASpecificSemester(semesterNumber);
        displayStudents(students);
    }


    private int generateStudentNumber(){
        return 100000+studentCounter;
    }

    private void displayStudents(List<Student> students){
        for(Student i:students){
            i.studentInfo();
        }
    }
}
