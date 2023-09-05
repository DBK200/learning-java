package com.sessions.session15.homeworksession15.ex1;

public class Main {

    public static void main(String[] args) {

        // Create objects of Rectangle class and compare them to test the functionality of equals() function that I created
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(2, 3);
        Rectangle rectangle3 = new Rectangle(2, 3);

        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.equals(rectangle3));
        System.out.println(rectangle2.equals(rectangle3));
        System.out.println(rectangle1.equals(rectangle1));
        System.out.println(rectangle2.equals(rectangle2));
        System.out.println(rectangle3.equals(rectangle3));


    }
}
