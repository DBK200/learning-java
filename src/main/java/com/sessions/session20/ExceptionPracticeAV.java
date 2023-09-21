package com.sessions.session20;

import java.io.FileNotFoundException;

public class ExceptionPracticeAV {

    public static void main(String[] args) {

        String input = null;
        try {
            trimText(input);
        } catch (NullPointerException | ArithmeticException e) { //sa nu fie superclasa si subclasa
            System.out.println(e.getMessage());
            System.out.println("Inside block");
//            System.out.println("Input can not be null. Please insert a valid text.");
        } catch (Exception e) {
            System.out.println("inside cath bloc ...");
        }
        finally { //executes every time
            System.out.println("closing resources");
            System.out.println("inside finally block");
        }
    }

    private static void trimText (String text) {
//        throw new ArithmeticException();
        text.trim();

    }
}
