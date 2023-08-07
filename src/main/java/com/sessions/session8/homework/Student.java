package com.sessions.session8.homework;

public class Student {
    String name;
    int age;
    String job;

    //Constructor
    public Student(String name,int age,String job)
    {
        this.name=name;
        this.age=age;
        this.job=job;
    }
    public void prezinta()
    {
        System.out.println("Hello, my name is "+name+". I am "+age+" and I work as a "+job);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Andrei",30,"lawyer");
        s1.prezinta();
    }
}
