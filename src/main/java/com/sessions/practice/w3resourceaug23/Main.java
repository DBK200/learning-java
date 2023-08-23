package com.sessions.practice.w3resourceaug23;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


    // Create object of School class
    School school = new School();


    // Create objects of Student class
    Student student1 = new Student("Ion Popa", 15);
    Student student2 = new Student("Ion Popescu", 16);
    Student student3 = new Student("George Popescu", 14);
    Student student4 = new Student("Ionut Enescu", 16);

    // Create objects of Teacher class
    Teacher teacher1 = new Teacher("Elena Enescu", "Matematica");
    Teacher teacher2 = new Teacher("Mara Enescu", "Informatica");
    Teacher teacher3 = new Teacher("Amalia Popa", "Engleza");

    // Create objects of SchoolClass class
    SchoolClass classOfMath = new SchoolClass("Math", teacher1);
    SchoolClass classOfInfo = new SchoolClass("Info", teacher2);
    SchoolClass classOfEnglish = new SchoolClass("English", teacher3);

    // Create the list of students from the school
        ArrayList<Student> studentsFromSchool = new ArrayList<>();

    // Add students to school
    school.addStudentToSchool(student1);
    school.addStudentToSchool(student2);
    school.addStudentToSchool(student3);
    school.addStudentToSchool(student4);
        System.out.println();

    // Add teachers to school
        school.addTeacherToSchool(teacher1);
        school.addTeacherToSchool(teacher2);
        school.addTeacherToSchool(teacher3);


        // Create the list of students for every class
        ArrayList<Student> studentsAtMath = new ArrayList<>();
        ArrayList<Student> studentsAtInfo = new ArrayList<>();
        ArrayList<Student> studentsAtEnglish = new ArrayList();

      // Add students to classes
        // Add students to the class of Math
        classOfMath.addStudentToClass(student1, studentsAtMath);
        classOfMath.addStudentToClass(student2, studentsAtMath);
        classOfMath.addStudentToClass(student3, studentsAtMath);
        classOfMath.addStudentToClass(student4, studentsAtMath);


        // Add students to the class of Info
        classOfInfo.addStudentToClass(student1, studentsAtInfo);
        classOfInfo.addStudentToClass(student2, studentsAtInfo);
        classOfInfo.addStudentToClass(student3, studentsAtInfo);
        classOfInfo.addStudentToClass(student4, studentsAtInfo);

        // Add students to the class of English
        classOfEnglish.addStudentToClass(student1, studentsAtEnglish);
        classOfEnglish.addStudentToClass(student2, studentsAtEnglish);
        classOfEnglish.addStudentToClass(student3, studentsAtEnglish);
        classOfEnglish.addStudentToClass(student4, studentsAtEnglish);

    }
}
