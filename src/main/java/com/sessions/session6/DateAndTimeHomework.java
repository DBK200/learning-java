package com.sessions.session6;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class DateAndTimeHomework {
    public static String resultChoiceString(int choice) {
        switch (choice) {
            case 0:
                return "Rock";

            case 1:
                return "Paper";

            default:
                return "Scissors";



        }
    }

    public static void main(String[] args){
//-----------   1 Display today's date
        System.out.println("1. Display today's date");
        LocalDate today=LocalDate.now();
        System.out.println("Today is: "+ today);
        System.out.println();




// --------  2 Write a method that prints a LocalDate with the following format 12-2005-20 (month-year-day)
        System.out.println("2. Write a method that prints a LocalDate with the following format 12-2005-20 (month-year-day)");

        String formattedDate=LocalDate.of(2001, 11,05).format(DateTimeFormatter.ofPattern("MM-yyyy-dd"));
        System.out.println(formattedDate);
        System.out.println();




//  ---------  3 Checking if today is 2019-12-22
        System.out.println("3. Checking if today is 2019-12-22");
        //the variable today is defined in the first exercise
        boolean isToday=LocalDate.of(2019,12,22).isEqual(today);
        if(isToday){
            System.out.println("Today is 2019-12-22");

        }else{
            System.out.println("Today is not 2019-12-22 ");
        }
        System.out.println();


//        LocalDate someDate=LocalDate.of(2023,7,20);
//        boolean dateIsBefore=today.isBefore(someDate);
//        boolean dateIsAfter=today.isAfter(someDate);
//
//        System.out.println((dateIsBefore  || dateIsAfter) ? "not equal" :"equal");






//  --------- 4 Judging whether two dates read from console are equal
        System.out.println("4. Judging whether two dates read from console are equal");
        System.out.println();
        System.out.println("Uncomment section");


//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter first date of format yyyy-MM-dd: ");
//        LocalDate date1=LocalDate.parse(input.next());
//        System.out.println("Enters second date of format yyyy-MM-dd: ");
//        LocalDate date2=LocalDate.parse(input.next());
//
//        boolean areDatesEqual=date1.equals(date2);
//        if(areDatesEqual){
//            System.out.println("Dates are equal");
//        }else if(date1.isBefore(date2)){
//            System.out.println(date1 + " is before " +date2);
//        }else{
//            System.out.println(date1 + " is after "+ date2 );
//        }
//
       System.out.println();







//  --------- 5 Write a method that prints local time with the following format HH:mm:ss
        System.out.println("5. Write a method that prints local time with the following format HH:mm:ss");
        System.out.println();
        String localTime=LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Locat time is: "+localTime);
        String localTime1=LocalTime.now().format(DateTimeFormatter.ofPattern("mm:HH:ss"));
        System.out.println("Locat time is: "+localTime1);

        System.out.println();





//  -------  6 Write a method that calculates your age based on your birthday. The date of birth must be read from the console
//            (you can use Period object to compare the date of birth with current date)

        System.out.println("6. Write a method that calculates your age based on your birthday. The date of birth must be read from the console");
        System.out.println();
        System.out.println("Uncomment section");
//
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter your birthday in format yyyy-MM-dd ");
//        LocalDate birthday=LocalDate.parse(input.next());
//
//        //today is defined in exercise 1.
//
//        Period period= Period.between(birthday,today);
//        System.out.println("You are: "+period.getYears() + " years "+period.getMonths() + " months "+ period.getDays()+" days old");



        //rock scissors paper game
        Random random=new Random();
        int pcChoice=random.nextInt(3);

        String pcChoiceString=resultChoiceString(pcChoice);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Choices: " );
        System.out.println("0 - Rock");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissors");
        System.out.print("Enter the number corresponding to your choice: ");
        int userChoice=scanner.nextInt();
        while(userChoice<0 || userChoice>2){
            System.out.print("You entered an invalid number. Please enter one of the options above: ");
            userChoice=scanner.nextInt();
        }

        String userChoiceString=resultChoiceString(userChoice);

        System.out.printf("%-15s %-11s %n","Your Choice", "PC Choice");
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %-11s %n",userChoiceString,pcChoiceString);
        System.out.println("-----------------------------------------");



        if(userChoiceString.equals(pcChoiceString)){
            System.out.println("Draw");
        }
        if(userChoiceString.equals("Rock") && pcChoiceString.equals("Scissors")){
            System.out.println("You win");
        }
        if(userChoiceString.equals("Scissors") && pcChoiceString.equals("Rock")){
            System.out.println("PC wins");
        }
        if(userChoiceString.equals("Paper") && pcChoiceString.equals("Scissors")){
            System.out.println("PC wins");
        }
        if(userChoiceString.equals("Scissors") && pcChoiceString.equals("Paper")){
            System.out.println("You win");
        }
        if(userChoiceString.equals("Rock") && pcChoiceString.equals("Paper")){
            System.out.println("You win");
        }
        if(userChoiceString.equals("Paper") && pcChoiceString.equals("Rock")){
            System.out.println("PC wins");
        }



    }

}
