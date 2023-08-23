package com.sessions.practice.w3resourceaug23;

import java.util.ArrayList;

public class School {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<SchoolClass> classes = new ArrayList<>();

    public School(ArrayList<Student> students, ArrayList<Teacher> teachers, ArrayList<SchoolClass> classes) {
        this.students = students;
        this.teachers = teachers;
        this.classes = classes;
    }

    public School(){

    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<SchoolClass> classes) {
        this.classes = classes;
    }

    // Methods to add and remove students, teachers and classes to or from school

    // Add students to school / remove students from school
    public void addStudentToSchool(Student student){
        students.add(student);
        System.out.println("Student " + student.getName() + " was successfully enrolled to our school");
    }

    public void removeStudentFromSchool(Student student){
        students.remove(student);
        System.out.println("Student " + student.getName() + " was successfully withdrawn from our school");
    }

    // Add teacher to school / remove teachers from school
    public void addTeacherToSchool(Teacher teacher){
        teachers.add(teacher);
        System.out.println("Teacher " + teacher.getName() + " was successfully hired to our school");
    }

    public void removeTeacherFromSchool(Teacher teacher){
        teachers.remove(teacher);
        System.out.println("Teacher " + teacher.getName() + " was successfully withdrawn from our school");
    }

    // add course / remove course
//    public void addSchoolClass(SchoolClass schoolClass){
//        classes.add(schoolClass);
//        System.out.println("Class of " + schoolClass.getClassName() + " was successfully configured to our school");
//    }
//
//    public void removeSchoolClass(SchoolClass schoolClass){
//        classes.remove(schoolClass);
//        System.out.println("Class of " + schoolClass.getClassName() + " was successfully cancelled at our school");
//    }


}
