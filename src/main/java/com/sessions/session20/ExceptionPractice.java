package com.sessions.session20;

public class ExceptionPractice {
    public static void main(String[] args) {

        String input = null;
        try {
            trimText(input);
        }catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("arithmetic and nullpointer exception");
        }catch (RuntimeException e){
            System.out.println("runtime exception");
        }finally {  //executes every time
            System.out.println("inside finally block");
        }
    }
    private static void trimText(String text){
        throw new ArithmeticException();
        //text.trim();
    }
}
