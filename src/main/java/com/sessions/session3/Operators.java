package com.sessions.session3;

public class Operators {
    public static void main(String[]args){
    int x = 1;
    int y = 2;
        if (x < 0 && y < 0) {
        System.out.println("True");
    } else {
        System.out.println("False");
    }
    //Infinite Loop
//        int i = 100;
//        while (i <= 200)
//            System.out.println(i);
//        i += 20;

    int q = 0;
    q += 2;
        System.out.println(q);

//    int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//        if (i % 2 == 0) {
//            sum += i;
//            System.out.println("The sum of even numbers "+sum);
//        }
        boolean u = 2 < 1 | 3 < 1;
            System.out.println(u);


    }
}



