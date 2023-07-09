package com.sessions.session3;

public class operatorsHomework {
    public static void main(String[] args) throws InterruptedException {

        /*
        //prints if x is bigger, equal, or smaller than 10
        int x = 8;
        if  (x < 10) {
            System.out.println("X is smaller than 10");
        }else if(x == 10){
            System.out.println("X is 10");
        }else {
            System.out.println("X is bigger than 10");
        }
        */

        /*
        //a 10 seconds countdown
        for (int z = 10; z > 0; z--){
            System.out.println("Countdown " + z + " seconds left");
            Thread.sleep(1000);
            if (z==1){
                System.out.println("Done");
            }
            }
        */

        /*
        //prints if the number is smaller than 10
        for (int i = 1; i < 16; i++){
            boolean z = true;
            if (i > 10) {
            z = !z;
            }
            System.out.println("Is " + i + " smaller than 10?: " + z);
            }
         */

        /*
        //a program that takes 2 numbers and performs operations if the desired operation is set to true
        int z = 30;
        int y = 15;
        int i;
        boolean add = false;
        boolean subtract = true;
        boolean multiplication = false;
        boolean division = false;
        boolean rest = false;

        if (add == true){
            i = z + y;
            System.out.println("The addition of the numbers is " + i);
        }
        if (subtract == true){
            i = z - y;
            System.out.println("The subtract of the numbers is " + i);
        }
        if (multiplication == true){
            i = z * y;
            System.out.println("The multiplication of the numbers is " + i);
        }
        if(division == true){
            i = z / y;
            System.out.println("The division of the numbers is " + i);
        }
        if(rest == true){
            i = z % y;
            System.out.println("The rest of the numbers is " + i);
        }
        */

        /*
        //a progam that checks if a number is even or odd
        int z = 21;
        int rest = z % 2;
        if (rest == 0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
        */

        /*
        //converts an int into a binary and does operations using bitwise operators
        int a = 10;
        int b = 6;
        long result = a & b;
        String num1 = Integer.toBinaryString(a);
        String num2 = Integer.toBinaryString(b);
        String binary = Long.toBinaryString(result);
        System.out.println("The first number is: " + a + " and in binary is " + num1);
        System.out.println("The first number is: " + b + " and in binary is " + num2);
        System.out.println("The result in binary is: " + binary + " and in decimal: " + result);
         */

        /*
        //takes a student score and determines a letter grade
        int score = 80;
        char grade = (score >= 90 && score <= 100) ? 'A'
                : (score >= 80 && score <= 89) ? 'B'
                : (score >= 70 && score <= 79) ? 'C'
                : (score >= 60 && score <= 69) ? 'D'
                : 'F';
        System.out.println("Your grade is " +  grade);
         */

        /*
        //determines the order of 3 numbers from the largest to the smallest
        int a = 7;
        int b = 8;
        int c = 9;
        if ( a > b && b > c) {
            System.out.println("a is the largest, b the second and c the third");
        }else if (a > c && c > b){
            System.out.println("a is the largest, c the second and b the third");
        }else if(b > a && a > c) {
            System.out.println("b is the largest, a the second and c the third");
        }else if (b > c && c > a){
            System.out.println("b is the largest, c the second and a the third");
        } else if (c > a && a > b) {
            System.out.println("c is the largest, a the second and b the third");
        }else if (c > b && b > a) {
            System.out.println("c is the largest, b the second and a the third");
        }
         */

        /*
        //converts all characters to uppercase
        String input = "Animal " + "World";
        String convertedString = "";
        for(char c : input.toCharArray()){
            if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            convertedString += c;
        }
        System.out.println("Converted string: " + convertedString);
         */

        /*
        //checks if the username is valid or not. The username must start with a letter, have at least 5 characters,
        //and no more than 15 characters, one lowercase, one uppercase character and one special character
        String username = "Gamer!123@";
        boolean isValid = false;
        if ((username.length() >= 5 && username.length() <= 15) &&
        (username.matches(".*[A-Z].*") && username.matches(".*[a-z].*") &&
                username.matches(".*[!,@,#,$,%,^,&,*,(,),{,},;,',:,?,>,<,+,=,`,~].*")) &&
                Character.isLetter(username.charAt(0))){
            isValid = true;
        }
        if(isValid){
            System.out.println("The username is valid");
        }else {
            System.out.println("The username is not valid");
        }
         */

        /*
        // a simple roll dice simulator that gives a random number from 1 to 6
        int min = 1;
        int rollResult = min + (int) (Math.random() *6);
        System.out.println("You rolled: " + rollResult);
         */
    }
}

