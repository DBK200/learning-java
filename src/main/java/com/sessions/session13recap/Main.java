package com.sessions.session13recap;

import java.util.Scanner;

public class Main {

//    char ch;
//    String str;
//    int x;
//    double y;
//    float z;
//    short sh;
//    byte b;
//    long l;
        // Create object of Main class

    // 3. convert a String to an int
//    private static int convertFromStringToInt(String str){
//        int strAsInt=0;
//        try {
//            strAsInt= Integer.parseInt(str);
//            return strAsInt;
//        } catch(NumberFormatException e){
//            System.out.println("you have to type a number");
//        }
//        return strAsInt;
//    }

    // 4. Char to int conversion
//    private static int convertFromCharToInt(char ch) {
//        int chAsInt = Character.getNumericValue(ch);
//        if (chAsInt >= 0 && chAsInt <= 9) {
//            try {
//                    return chAsInt;
//                    else{
//            } catch (Exception e) {
//                System.out.println("The character is not a valid digit");
//                return 0;
//            }}
//            //return chAsInt;
//        }//////?????????
//    public static int convertFromCharToInt(char ch){
//        int chAsInt = Character.getNumericValue(ch);
//        if(ch >=0 && ch <=9){
//            return chAsInt;
//        } else{
//            System.out.println("The character is not a valid digit");
//            return 0;
//        }
//    }

    // 5. Floating-point precision
//    public static float calculateMedia(float a, float b, float c){
//        float limit = Float.MAX_VALUE;
//        float sum = a + b + c;
//            float media = 0.0f;
//            if(sum > limit){
//                System.out.println("sum is too big. choose some smaller values");
//            } else{
//                media = sum / 3.0f;
//            }
//            return media;
//    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        // 3. convert a String to an int
//        System.out.println("Type a String to be converted to an int: ");
//        String s1 = scanner.next();
//        int result = convertFromStringToInt(s1);
//        System.out.println("The result is: " + result);

        // 4. Char to int conversion
//        System.out.println("Type a char to be converted to an int: ");
//        String c1 = scanner.next();
//        char c2 = c1.charAt(0);   // used to return the first character
//        int result = convertFromCharToInt(c2);
//        System.out.println("The result is: " + result);

        // 5. Floating-point precision
//        System.out.println( calculateMedia(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE));

        // 6. Boolean Logic
//        System.out.println("Type the first boolean value: ");
//        boolean bool1 = scanner.nextBoolean();
//        System.out.println("Type the second boolean value: ");
//        boolean bool2 = scanner.nextBoolean();
//
//        boolean op1 = bool1 && bool2;
//        boolean op2 = bool1 || bool2;
//        boolean op3 = !bool1;
//        boolean op4 = !bool2;
//        System.out.println("Result of && operation: " + op1);
//        System.out.println("Result of || operation: " + op2);
//        System.out.println("Result of !bool1 operation: " + op3);
//        System.out.println("Result of !bool2 operation: " + op4);


        // Java basics
        // 1. declare and initialize variables
//        int x = 18;
//        double y = 32.18145;
//        String str = "My dog is awesome";
//        char ch = 'a';
//        boolean bol = true;
//        System.out.println("int value: " + x);
//        System.out.println("double value: " + y);
//        System.out.println("String value: " + str);
//        System.out.println("char value: " + ch);
//        System.out.println("boolean value: " + bol);

        // 2. Arithmetic operations on int values
//        int x = 22;
//        int y = 33;
//        int sum = 22 + 33;
//        int subtraction = 22 - 33;
//        int multiplication = 22 * 33;
//        int division = 22 / 33;
//        System.out.println("Addition: " + sum);
//        System.out.println("Subtraction: " + subtraction);
//        System.out.println("Multiplication: " + multiplication);
//        System.out.println("Division: " + division);

        // 3. Type casting
        // from double to int
//        double d = 33.33;
//        int dToInt = (int) d;
//        double backToDouble = dToInt;   // Aici se pierde tot ce e dupa virgula
//        System.out.println("Double value: " + d);
//        System.out.println("Int value: " + dToInt);
//        System.out.println("Double again: " + backToDouble);

        // 4. Constants
        //final int FIN = 22;
      //  FIN = 33;
       // System.out.println("The value of the constant is: " + FIN);

        // 5. Scope
        // instance variable
        // Create object of TestClass class
//        TestClass test = new TestClass(7);
//        System.out.println("Instance variable: " + test.getValue());
//        System.out.println(doSomething("BBB"));

        // 6. Default values
//
//        System.out.println(obj.ch);
//        System.out.println(obj.str);
//        System.out.println(obj.x);
//        System.out.println(obj.y);
//        System.out.println(obj.z);
//        System.out.println(obj.sh);
//        System.out.println(obj.b);
//        System.out.println(obj.l);




        scanner.close();


    }


    // 5. Scope
//    public static String doSomething(String str){
//        return "This is an example of local scope and the value of the String variable is " + str;
//    }
//
//    static{
//        String str = "The static value will always be the first";
//        System.out.println(str);
//    }


}
