package com.sessions.session10.HomeworkDP.Inheritance;

public class Main {
    public static void main(String[] args) {
        User teacher=new Teacher("teacher@gmail.com","2d3nfo2d","Ib", "Denmark",31000,"Teaching");
        teacher.displayInfo();

        User student=new Student("student@gmail.com","243nf32","Alex","Poland",1,100234);
        student.displayInfo();
    }
}
