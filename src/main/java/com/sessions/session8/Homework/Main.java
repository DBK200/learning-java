package com.sessions.session8.Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args){




        //Create School object
        School school=new School();
        StudentManagement students=school.getStudents();


       LocalDate date=LocalDate.of(2023,8,1);

        //add students to the programme
        school.enrollStudentsInProgramme("Delia ",date);
        school.enrollStudentsInProgramme("Alexandra ",date);
        school.enrollStudentsInProgramme("Alex ",date);
        school.enrollStudentsInProgramme("Adam ",date);
        school.enrollStudentsInProgramme("Marius ",date);

        for(int i=0;i<95;i++){
            school.enrollStudentsInProgramme("Name"+i,date);
        }

        //add courses for the programme
       school.addCourseForTheProgramme("Software Development With Java 1", "SDJ1","Topics, Skills,Teaching techniques,Study recommandations, Examination,Grading",true,1,10);
        school.addCourseForTheProgramme("Math for Software Engineers", "MSE1","Topics, Skills,Teaching techniques,Study recommandations, Examination,Grading",true,1,5);
        school.addCourseForTheProgramme("Responsive web design", "RWD1","Topics, Skills,Teaching techniques,Study recommandations, Examination,Grading",true,1,5);
        school.addCourseForTheProgramme("Software Development With Java 2", "SDJ2","Topics, Skills,Teaching techniques,Study recommandations, Examination,Grading",true,2,10);
        school.addCourseForTheProgramme("Algorithms and Data Structures", "ADS1","Topics, Skills,Teaching techniques,Study recommandations, Examination,Grading",true,3,5);

        //create professors teaching the programme
        Professor professor1=new Professor("Steffen");
        Professor professor2=new Professor("Ib");
        Professor professor3=new Professor("Henrik");
        Professor professor4=new Professor("Kasper");
        Professor professor5=new Professor("Ole");
        Professor professor6=new Professor("Erland");
        Professor professor7=new Professor("Poul");
        Professor professor8=new Professor("Troels");




        school.enrollStudentsForSemesterCourses(1);

       // students.displayAllStudentsInSemester(1);

//----------------- get one student by name and study number
    //    Student student =students.getStudentByNameAndStudyNumber("Name90",100096);
//        student.studentFullInfo();
//        System.out.println();



//---------------- get one student by study number
//        Student student1=students.getStudentByStudyNumber(100084);
//        student1.studentFullInfo();
//        System.out.println();


//---------------- add professors that can teach a course.
        Course c1=school.getCourseById("SDJ1");
        c1.addProfessor(professor1);
        c1.addProfessor(professor2);
        c1.addProfessor(professor3);
        Course c2=school.getCourseById("MSE1");
        c2.addProfessor(professor4);


//--------------- display all professors that can teach a course.
        c1.displayAllProfessorsForThisCourse();


//-------------- create a a new class for a course with professor and students
        List <Student> studentsForClass1=new ArrayList<>();
        for(int i=0;i<33;i++){
            studentsForClass1.add(students.getStudent(i));
        }

        Class SDJ1A1= school.createClass(c1,professor1,studentsForClass1);
        Class MSE1A1= school.createClass(c2,professor7,studentsForClass1);

//----------- display information about the class (name of course, teacher and list of students)
        SDJ1A1.displayInfoAboutClass();

//------------ mark if students has passed or failed an exam
        List<Student> studentsInClass=SDJ1A1.getStudents();
        Random rand=new Random();
        for(Student s:studentsInClass){
            SDJ1A1.addGrade(s, rand.nextInt(1,10));
            s.studentFullInfo();
        }

    }
}
