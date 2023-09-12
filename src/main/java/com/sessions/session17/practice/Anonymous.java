package com.sessions.session17.practice;

import java.util.Arrays;

public class Anonymous {
    public static void main(String[] args) {

        // Anonymous class is usefully when we need to use it once,
        // implemented on the spot
        Book book = new Book("Book's title") {
            public String getTitle() {
                return "Can't find the title!";
            }
        };

//        Printer printer = new Printer() {
//            @Override
//            public void printStuff(String stuff) {
//                System.out.println("Prints " + stuff);
//            };
//        };

        // Can be replaced with a Lambda expression
        Printer printer = (String stuff) -> "Prints " + stuff;
        printer.printStuff("some input.");

//        String a = "abcd", b = "efgh";
//        Test testRefference = (String x, String y) -> x.length() == y.length();

        Test testRefference = (Integer... x) -> {
            for(int i=0; i<x.length; i++) {
                x[i] = 1;
            }
        };
        Integer x[] = new Integer[]{2,3};
        System.out.println("Before: " + Arrays.toString(x));
        testRefference.test(x);
        System.out.println("After: " + Arrays.toString(x));


        // SUPPLIER operation
        MySupplier mySupplier = () -> "some text";
        System.out.println(mySupplier.generateDescription());

        // CONSUMER operation
        MyConsumer myConsumer = a -> System.out.printf("The circle area with radius %d is: %f%n",
                a, Math.PI*Math.pow(a,2));
        myConsumer.printArea(10);

        // FUNCTION operation
        MyFunction myFunction = y -> y*y;
        int y = 10;
        System.out.printf("The square of %d is %d%n", y, myFunction.sqr(y));

        // PREDICATE operation
        MyPredicate myPredicate = (String s) -> (s.isEmpty()) ? false : true;
        System.out.println("The string is not empty returned " + myPredicate.checkSize(""));

    }
}

class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}

@FunctionalInterface
interface Printer {
    String printStuff(String stuff);
}
@FunctionalInterface
interface Test {
    // boolean test(String a, String b);
    void test(Integer... array);
}
@FunctionalInterface
interface MySupplier {
    // SUPPLIER: An operation that takes no input arguments and returns a result
    String generateDescription();
    // This declaration will
    // String a();
}

@FunctionalInterface
interface MyConsumer {
    // CONSUMER: An operation that takes a single input argument and returns no result
    void printArea(int a);
}

@FunctionalInterface
interface MyFunction {
    // FUNCTION: An operation that takes a single input argument and returns a result
    int sqr(int x);
}

@FunctionalInterface
interface MyPredicate {
    // PREDICATE: A boolean-valued operation that takes a single input argument
    boolean checkSize(String s);
}