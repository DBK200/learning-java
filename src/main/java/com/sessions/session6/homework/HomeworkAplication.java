package com.sessions.session6.homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeworkAplication {

    public void printTodaysDate(){

        System.out.println("Today is " + LocalDate.now());

    }

    public void printDateWithFormat(LocalDate localDate ,String dateFormat){

        System.out.println(localDate + " is " + localDate.format(DateTimeFormatter.ofPattern(dateFormat)) + " formatted as month ,year ,day");

    }

    public void checkIfDateIsToday(LocalDate date){

        if (date.isEqual(LocalDate.now()))
            System.out.println(date + "is today");
        else
            System.out.println(date + " isn't today");

    }

    public void checkDateEquality(LocalDate date1 ,LocalDate date2){

        if (date1.isEqual(date2))
            System.out.println(date1 + " and " + date2 + " are equal");
        else
            System.out.println(date1 + " and " + date2 + " aren't equal");

    }

    public void printLocalTimeWithFormat(){

        System.out.println("Local time is: " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

    }

    public void yourAge(LocalDate dateOfBirth){

        System.out.println("You have been born in: " + dateOfBirth + " and you are " + Period.between(dateOfBirth,LocalDate.now()).getYears() + " yo");

    }

    public static void main(String[] args){

        HomeworkAplication homework = new HomeworkAplication();
        Scanner input = new Scanner(System.in);

        homework.printTodaysDate();
        homework.printDateWithFormat(LocalDate.of(2005,12,20) ,"MM-yyyy-dd");
        homework.checkIfDateIsToday(LocalDate.of(2019,12,22));

        System.out.println("Type the first date to compare: ");
        LocalDate date1 = LocalDate.parse(input.next() ,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Type the second date to compare: ");
        LocalDate date2 = LocalDate.parse(input.next() ,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        homework.checkDateEquality(date1 ,date2);

        homework.printLocalTimeWithFormat();

        System.out.println("Type birthday date: ");
        LocalDate birthDay = LocalDate.parse(input.next() ,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        homework.yourAge(birthDay);

        input.close();

    }

}
