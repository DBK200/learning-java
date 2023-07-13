package com.sessions.session4;

import java.util.Scanner;

public class Practice {

    static Scanner scanner1 = new Scanner(System.in);
    static int optiune = 5;

    //test switch
    static void meniu() {

         System.out.println("Choose an option:");
         System.out.println("Type:");
         System.out.println("0 for a starts-with-vowel test");
         System.out.println("1 for a while test");
         System.out.println("2 for a do-while test");
         System.out.println("3 for a fill-a-matrix test");
         optiune = scanner1.nextInt();

        switch (optiune) {
            default -> System.out.println("Option doesn't exist") ;
            case 0 -> testVocala();
            case 1 -> testPana();
            case 2 -> testCatTimp();
            case 3 -> fillAMatrix();
        }
    }

    //test if
    static void testVocala(){
        System.out.println("Insert a word : ");
        Scanner scan = new Scanner(System.in);
        String keyword1 = scan.nextLine();
        if(keyword1.startsWith("a") || keyword1.startsWith("e") || keyword1.startsWith("i") || keyword1.startsWith("o") || keyword1.startsWith("u") ) {
            System.out.println("The words starts with a vowel");
        } else {
            System.out.println("The word starts with a consonant");
        }
    }
    //test while - checks if a number is lower than 125 and then iterates it if its not
    static void testPana(){
        System.out.println("Insert a number ");
        Scanner scanner = new Scanner(System.in);
         int x = scanner.nextInt();

         if(x>125) {
             System.out.println("The number is greater than 125");}
         else   if(x<125){while(x<125) {
                 x++;
                 System.out.println(x + " is not yet greater than 125");}}
            else {
             System.out.println("x is finally equal to 125");}

     }

    //test do-while
    static void testCatTimp(){
         double y;
         do { y = Math.random()*10;
             System.out.println("The cat keeps going"); } while (y<8);
         System.out.println("The cat fell");
     }

     static void fillAMatrix(){
         int i ;
         int j ;
         Scanner scanner = new Scanner(System.in);
         System.out.println("For a matrix the size of i*j, insert the i number of spaces");
         i = scanner.nextInt();
         System.out.println("Great job! Now do the same for the j number of spaces");
         j = scanner.nextInt();
         System.out.println("Now it's time to fill the matrix ! ");

         int matrice[][] = new int[i][j];

         for(int a = 0; a<i; a++){
             for(int b=0;b<j;b++) {
                 System.out.println("Insert a number for position a["+a+"]"+"["+b+"]");
                 matrice[a][b] = scanner.nextInt();
             }
         }

         System.out.println("Let's see what you've been up to:");
         for(int a = 0; a<i; a++){
             System.out.println("");
             for(int b=0;b<j;b++) {
                 System.out.print("["+matrice[a][b]+"]");
             }
         }
     }

    public static void main(String[] args) {
         meniu();
    }






}
