package com.sessions.session4.practice;

public class Statements {


    public static void main(String[] args) {

        //conditional statements
        //if-then
//        int x =1;
//        if(x<2){
//            System.out.println("x is smaller than 2");
//        }
//        checkNumber(x);

        //ternary operator - condensed form of an if else that returns a value
//        int x = 2 < 3 ? 4 : 5;

        //if else
//        String car = "BMWn";
//         if (car.equals("BMW")){
//             System.out.println("Car is a bmw");
//         }else {
//             System.out.println("Car is not a bmw");
//         }

        //if else if
//        String dayOfWeek = "Monday";
//        if(dayOfWeek.equals("Wednesday")){
//            System.out.println("Discount is 10%");
//        }else if(dayOfWeek.equals("Thursday")){
//            System.out.println("Discount is 15%");
//        }else if(dayOfWeek.equals("Monday")){
//            System.out.println("Discount is 20%");
//        }else{
//            System.out.println("no discount today");
//        }

        //switch
//        String dayofWeek = "Monday";
//        switch (dayofWeek) {
//            case "Wednesday":
//                System.out.println("Discount is 10%");
//                break;
//            case "Monday":
//                System.out.println("Discount is 20%");
//                break;
//            case "Thursday":
//                System.out.println("Discount is 15%");
//                break;
//            default:
//                System.out.println("no discount today");
//
//        }

        //Loop statements

        //arrays
//        int[] numbers = {1, 2, 3, 4, 5};
//        int[][] numberss = {{1, 2, 3}, {4, 5, 6},{9}};
//        System.out.println(numberss[2][0]);
//
//        String[] daysOfWeek = {"Monday", "Tuesday"};
//        String days[] = {};
//
//        int[] numerz= new int[10];
//        System.out.println(numerz.length);
//        numerz[0]=2;
//        System.out.println(numerz[0]);
//
//        int[] noNumber={};
//        noNumber[0]=1; < index out of bounds exception

        //for loop

//        int[] numbers = {1, 2, 3, 4, 5, 6, 3, 4};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//
//        for (int i = 0; i < numbers.length; i++) {
////        for (int i = 0; i <= numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        //for each
//        for (int number: numbers) {
//            System.out.println(number);
//        }
//
//        String[] myMusicPreferences = {"House", "Jazz", "Dance"};
//
//        for (String music: myMusicPreferences ) {
//            System.out.println(music);
//        }

        //while
//        int x = 0;

//        while(x<10){
//            System.out.println(x);
//            x++;
//        }
//
//        while (x < 0) {
//            System.out.println(x);
//            x++;
//        }

        //do-while

//        do {
//            System.out.println(x);
//            x++;
//        } while (x < 10);
//
//        do {
//            System.out.println(x);
//            x++;
//        } while (x < 0);

        //flow control

        //return
//        int x = 3;
//        if (x > 2) {
//            return; // exits the execution of this method
//        }
//        System.out.println("something");
//        System.out.println("something");
//        System.out.println("something");

        //break - used to exit a loop or a switch statement

//        int[] numbers = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//            if (numbers[i] == 3) break;
//            System.out.println(numbers[i] + " is lower than 3");
//        }

        //continue - breaks an iteration of the loop
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 3) continue;
//            System.out.println(numbers[i]);
//        }
//

        //labels

//        int[][] numbers = {{2, 3, 4}, {5, 6, 7}, {8, 9, 0}};
//        System.out.println(numbers.length);
//        System.out.println(numbers[0].length);
//        System.out.println(numbers[1].length);

        //break with label
//        for (int i=0; i< numbers.length; i++){
//            for (int j=0; j< numbers[i].length;j++){
//                System.out.println(numbers[i][j]);
//                break;
//            }
//        }
//
//        OUTER_LOOP: for (int i=0; i< numbers.length; i++){
//            for (int j=0; j< numbers[i].length;j++){
//                System.out.println(numbers[i][j]);
//                break OUTER_LOOP;
//            }
//        }

        //continue with label
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                if (numbers[i][j] % 3 == 0) {
//                    continue;
//                }
//                System.out.println(numbers[i][j]);
//            }
//            System.out.println("iteration completed");
//        }

//        OUTER_LOOP: for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                if (numbers[i][j] % 3 == 0) {
//                    continue OUTER_LOOP;
//                }
//                System.out.println(numbers[i][j]);
//            }
//            System.out.println("iteration completed");
//        }


    }

    private static void checkNumber(int x) {
        if (x > 0) {
            System.out.println("x is a positive number.");
        }
    }

}
