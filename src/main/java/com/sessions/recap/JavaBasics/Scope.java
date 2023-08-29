package com.sessions.recap.JavaBasics;

public class Scope {

//    Scope: Declare variables in different scopes, such as local scope, instance scope,
//    and static scope. Use the variables in your code to ensure that they are only
//    accessible within their respective scopes.

    int x;//instance
    static int staticX;//static


    public static void main(String[] args) {

        int x=1;//local
        Scope instance=new Scope();

        instance.x=1;
        staticX=1;
        System.out.println(x);
        System.out.println(instance.x);
        System.out.println(staticX);


    }
}
