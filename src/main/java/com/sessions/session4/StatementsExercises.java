package com.sessions.session4;

public class StatementsExercises {

    public static void main(String[] args) {

        /*
        //if-then
        int age = 20;
        if(age > 18){
            System.out.println("you have the right to vote");
        }
         */

        /*
        //ternary operator
        int x = (3+9+8*2) + (7*4) == (7*2+14) + (20+2*2*2) ? 56 : 0;
        System.out.println(x);
         */

        /*
        //if else if
        int age = 30;
        if (age >= 0 && age < 13){
            System.out.println("you are a child");
            System.out.println("and you have " + (18 - age) + " years left until you are major");
        }else if(age >= 13 && age <= 19){
            System.out.println("you are a teen");
        }else if (age > 19 && age <= 39){
            System.out.println("you are an adult");
        }else if(age > 39 && age <= 59){
            System.out.println("you are middle-aged");
        }else if(age > 59 && age <= 99){
            System.out.println("you are a senior");
        }else if(age > 99){
            System.out.println("you should be dead");
        }else {
            System.out.println("invalid age");
        }
         */

        /*
        //switch
        int month = 12;
        switch (month){
            case 1:
                System.out.println("It`s winter \nJanuary");
                break;
            case 2:
                System.out.println("It`s winter \nFebruary");
                break;
            case 3:
                System.out.println("It`s spring \nMarch");
                break;
            case 4:
                System.out.println("It`s spring \nApril");
                break;
            case 5:
                System.out.println("It`s spring \nMay");
                break;
            case 6:
                System.out.println("It`s summer \nJune");
                break;
            case 7:
                System.out.println("It`s summer \nJuly");
                break;
            case 8:
                System.out.println("It`s summer \nAugust");
                break;
            case 9:
                System.out.println("It`s autumn \nSeptember");
                break;
            case 10:
                System.out.println("It`s autumn \nOctober");
                break;
            case 11:
                System.out.println("It`s autumn \nNovember");
                break;
            case 12:
                System.out.println("It`s winter \nDecember");
                break;
            default:
                System.out.println("Invalid month");
        }
         */

        /*
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

        System.out.println(daysOfWeek[5]);

        for(String days: daysOfWeek){
            System.out.println(days);
        }

         */

        /*
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfWeek[2]);

        for(int i = 0; i< daysOfWeek.length; i++){
            System.out.println(daysOfWeek[i]);
        }
         */


        /*
        int z = -10;
        while (z <=10){
            System.out.println(z);
            z++;
        }
         */

        /*
        int[] years = {2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};

        for (int i = 0; i < years.length; i++){
            if (years[i] == 2012) continue;
            System.out.println(years[i]);
            if(years[i] == 2018) break;
        }
         */

        /*
        String[][] alphabet = {{"a", "e", "i", "o", "@", "u"},
                {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"}};
        System.out.println(alphabet[0].length);

        for (int i = 0; i < alphabet.length; i++){
             for(int z = 0; z< alphabet[i].length; z++){
                 if(alphabet[i][z].equals("@")){
                     System.out.println("@ don`t belong here");
                     continue;
                 }
                System.out.println(alphabet[i][z]);
                 if(alphabet[i][z].equals("w")) {
                    System.out.println("Found w");
                    break;
                }
            }
        }

         */
    }
}