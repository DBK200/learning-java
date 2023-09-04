package com.sessions.session15.Homework.Challange1;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10, 15);
        Rectangle rectangle2 = new Rectangle(10, 15);

        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());
    }
}
