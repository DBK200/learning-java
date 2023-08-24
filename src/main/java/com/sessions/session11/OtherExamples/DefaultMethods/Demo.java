package com.sessions.session11.OtherExamples.DefaultMethods;

public class Demo {
    public static void main(String[] args) {
        MyInterfaceImplementation obj=new MyInterfaceImplementation();

        //Can call getNumber()
        System.out.println(obj.getNumber());

        //can also call getString() because of default implementation
        System.out.println(obj.getString());

        System.out.println();

        MyInterfaceImplementation2 obj2=new MyInterfaceImplementation2();

        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());

        System.out.println();

        //static interface method
        System.out.println ( MyInterface.getDefaultNumber());
    }
}
