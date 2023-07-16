package com.sessions.session5;

import java.util.Scanner;

public class String_StringBuilderExercises {
    public static void main(String[] args) {

        //exercising with check reference
//        String s1 = new String("Hello");
//        String s3 = new String("Hello");
//        String s2 = String.valueOf(System.identityHashCode(s1));
//        String s4 = Integer.toHexString(System.identityHashCode(s3));
//        System.out.println(s2);
//        System.out.println(s4);
//
//        String dog1 = "dog";
//        String dog2 = "cat";
//
//        System.out.println(Integer.toHexString(System.identityHashCode(dog1)));
//        System.out.println(Integer.toHexString(System.identityHashCode(dog2)));


//        //getChars method
//        String cat = "kitten";
//        char[] cats = new char[4];
//        cat.getChars(0,4,cats,0);
//        System.out.println(cats);

        //trying some string methods
//        String car = "Mazda";
//        car.substring(1);
//        System.out.println(car.substring(1,3));
//
//        String animal = "Lion";
//        System.out.println(animal.concat(" King"));
//
//        String a = "abcda";
//        System.out.println(a.replace('a', 'b'));
//
//        String a1 = "Hello World";
//        String a2 = "Hello World";
//        System.out.println(a1.replaceAll("Hello", "New"));
//        System.out.println(a1.equalsIgnoreCase("HeLLO World"));
//        System.out.println(a1.equalsIgnoreCase(a2));
//
//        String x = "X is a string";
//        String y = "Y is another string";
//        System.out.println(y.compareTo(x));

//        String sentence = "the quick brown fox jumps over the lazy dog";
//        System.out.println(sentence.indexOf("e"));
//        System.out.println(sentence.indexOf("o" , 13));
//        System.out.println(sentence.startsWith("the"));
//        System.out.println(sentence.endsWith("dog"));
//        System.out.println(sentence.contains("ox"));
//        System.out.println(sentence.length());
//        System.out.println(sentence.repeat(2));
//        System.out.println(sentence.codePoints());
//        System.out.println(sentence.replaceAll("o", "ab"));

        //trying some methods on string builder
//        StringBuilder sb = new StringBuilder("My name is John and i am a turtle");
//        System.out.println(sb.append(" water"));
//        String sb1 = sb.substring(sb.indexOf("My"), sb.indexOf("turtle"));
//        System.out.println(sb1);
//        System.out.println(sb.insert(8, "a"));

//        StringBuilder sb1 = new StringBuilder("This is a StringBuilder");
//        System.out.println(sb1.delete(0,5));
//        System.out.println(sb1.deleteCharAt(8));
//        System.out.println(sb1.reverse());
//        String str = sb1.toString();
//        System.out.println(str);
//        System.out.println(sb1.capacity());



        //a small program that takes a sentence input from the user and gives back the lenght, number of words, converts it to uppercase,
        //reverse the sentence and asks the user for a character and then gives back the number of occurrences that character was in the sentence.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String sentence = scanner.nextLine();
//        String[] numOfWords = sentence.split(" ");
//        StringBuilder sb = new StringBuilder(sentence);
//
//        System.out.println("The total number of characters in your sentence is: " + sentence.length());
//        System.out.println("The number of words in your sentence is: " + numOfWords.length);
//        System.out.println("Your sentence converted to uppercase is: " + sentence.toUpperCase());
//        System.out.println("Your reversed sentence is: " + sb.reverse());
//        System.out.println("Enter the character you want to see the number of occurrences of: ");
//
//        String target = scanner.next();
//        char target1 = target.charAt(0);
//        int count = countCharacterOccurrences(sentence, target1);
//        System.out.println("The character " + target1 + " appears "+ count+ " in your sentence");
//
//        scanner.close();
//    }
//    public static int countCharacterOccurrences(String sentence, char target1){
//        int count = 0;
//        for (int i = 0; i<sentence.length(); i++){
//            if(sentence.charAt(i) == target1){
//                count++;
//            }
//        }
//        return count;
    }
}
