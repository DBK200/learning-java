package com.sessions.practice.w3resourceaug23;

import java.util.ArrayList;

public class SchoolClass {

    private String className;
    private Teacher teacher;
    private ArrayList<Student> students;

    public SchoolClass(String className, Teacher teacher){
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // Method to add students to the class
    public void addStudentToClass(Student student, ArrayList<Student> students){
        students.add(student);
        System.out.println("You added the student " + student.getName() + " to the class " + getClassName() +  " ");
    }

    public void removeStudentFromClass(Student student, ArrayList<Student> students){
        students.remove(student);
        System.out.println("You removed the student " + student.getName() + " from class " + getClassName() + " ");
    }

    // Methods to add and remove teacher to class
    public void addTeacherToClass(Teacher teacher, ArrayList<Teacher> teachers){
        teachers.add(teacher);
        System.out.println("The teacher " + teacher.getName() + " of " + teacher.getSubject() + " was successfully" +
                " added to the class of " + getClassName() );
    }

    public void removeTeacherFromClass(Teacher teacher, ArrayList<Teacher> teachers){
        teachers.remove(teacher);
        System.out.println("The teacher " + teacher.getName() + " of " + teacher.getSubject() + " was successfully" +
                " withdrawn from the class of " + getClassName() );
    }
}
