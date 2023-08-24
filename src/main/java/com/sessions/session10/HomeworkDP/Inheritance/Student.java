package com.sessions.session10.HomeworkDP.Inheritance;

public class Student extends User{

    private int studentNumber;
    private int currentSemester;


    public Student(String email, String password, String name, String address,int currentSemester,int studentNumber) {
        super(email, password, name, address);
        this.currentSemester=currentSemester;
        this.studentNumber=studentNumber;

    }

    public Student(String email, String password,String name,int currentSemester, int studentNumber){
        super(email,password,name);
        this.currentSemester=currentSemester;
        this.studentNumber=studentNumber;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public int getStudentNumber() {
        return studentNumber;
    }


    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Semester: "+currentSemester);
        System.out.println("Student Number: "+studentNumber);
    }
}
