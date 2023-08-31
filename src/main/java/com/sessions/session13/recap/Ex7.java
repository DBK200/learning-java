package com.sessions.session13.recap;

import com.sun.tools.javac.Main;

public class Ex7 {

    //Declare variables in different scopes, such as local scope, instance scope, and static scope.
    // Use the variables in your code to ensure that they are only accessible within their
    // respective scopes.

    static int staticInt = 5;

    int instanceInt = 3;

    public static void main(String[] args) {

        int localInt = 10;

        System.out.println(staticInt);
        System.out.println(localInt);

        Ex7 ex = new Ex7();
        System.out.println(ex.instanceInt);

        ex.print();
    }
    public void print(){
        System.out.println(instanceInt);
        System.out.println(staticInt);
    }
}
