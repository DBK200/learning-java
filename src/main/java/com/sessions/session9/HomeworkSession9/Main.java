package com.sessions.session9.HomeworkSession9;

import java.time.LocalDate;

public class Main {

    // apelarea metodelor statice si salvarea rezultatului in alte variabile
    public static String gender1 = UserAndreea.printGender();
    public static String defaultCountry1 = UserAndreea.printDefaultCountry();

    public static void main(String[] args) {

        // printarea variabilelor rezultat ale metodelor statice
        System.out.println(gender1);
        System.out.println(defaultCountry1);

        // obiect al clasei UserAndreea
        LocalDate birthday = LocalDate.of(1996, 05, 30);
        UserAndreea a1 = new UserAndreea("Hincu Andreea", birthday, 52, 1.57, false);

        // Apelarea metodelor getter si afisarea rezultatului
        System.out.println("Full name: " + a1.getFullName());
        System.out.println("Birthday: " + a1.getDateOfBirth());
        System.out.println("Weight: " + a1.getDateOfBirth());
        System.out.println("Height: " + a1.getHeight());
        System.out.println("Check if the person is a student: " + a1.isStudent());
        System.out.println();


        System.out.println("Age: " + a1.calculateAge());
        System.out.println("BMI is: " + a1.calculateBMI());

    }
}
