package com.sessions.session12.Exercises.Operators;

public class gExercises {
//    If the marks of Robert in three subjects are 78,45 and 62
//    respectively (each out of 100 ), write a program to calculate
//    his total marks and percentage marks.
public static void main(String[] args) {
        int mark1=78;
        int mark2=45;
        int mark3=62;
        int totalMarks=mark1+mark2+mark3;
        double percentageMarks;
        percentageMarks=totalMarks/3;
    System.out.println("total marks is:"+totalMarks);
    System.out.println("percentage marks is:"+percentageMarks+"%");
    }
}
