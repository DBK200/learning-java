package com.sessions.session12.polymorphims.Homework.Homework1;

public class TestClass {

    public static void main(String[] args) {

        Student student = new Student("Mike", 30);
        System.out.println(student.getAge());
        System.out.println(student.getNum());
        User user1 = new User();
        User user = student;
        System.out.println(user.getId());
        System.out.println(student.getId());
        student.printSomething();
        user.printSomething();
        user.saySomething();
        Student student1 = (Student) user;
        System.out.println(student1.getId());
        student1.saySomething();
        user1.saySomething();

        float number = 3.4f;
        System.out.println(number);
        int intNumber = (int) number;
        System.out.println(intNumber);
        System.out.println(user1.Id);
        System.out.println(user.Id);
        System.out.println(student1.Id);
        System.out.println(student.Id);

        System.out.println(user1.multiplication(2, 3));
        System.out.println(user1.multiplication(4,5,6));

    }
}
