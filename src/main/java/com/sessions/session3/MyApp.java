package com.sessions.session3;

public class MyApp {
    public static void main(String[] args) {

        int x = 3;
        int y = x-- + 2 * (--x) + x++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int z = 5;
        z += x;
        System.out.println("z = " + z);

        boolean a = true;
        System.out.println("!a = " + !a);

        a = x > y;
        System.out.println("x > y = " + a);

        boolean b;
        b = a | z <= 10;
        System.out.println("b = " + b);

        String c = a == b ? "red" : "blue";
        System.out.println("c = " + c);

        Object obj1 = new Object();
        Object obj2 = obj1;
        System.out.println("obj1 = obj2 ? " + (obj1 == obj2));

    }
}
