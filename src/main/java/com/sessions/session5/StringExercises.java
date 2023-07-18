package com.sessions.session5;

public class StringExercises {

    public static void main(String[] args) {
        //read arguments as strings, edit configuration, print args using a foreach

//        for (String arg:
//             args) {
//            System.out.println(arg);
//        }
//
        //String
//        String animal1="Lion";
//        String animal2=new String("Lion");
//        System.out.println(animal1.equals(animal2));
//        System.out.println(animal1 == animal2);


        //addition vs concatenation

//        System.out.println(1+2);
//        System.out.println(3 + "3");
//        System.out.println(1+2+"33"); // what does it print?



        //Immutability -> an object that can’t be changed once it’s created.
//        String x = " Luni ";
//        x.trim();
//        System.out.println(x);

//        String myString= "casa"; // removed by garbage collector
//        myString = "casuta";
//        System.out.println(myString);



        //String methods

        //length
//        String nume = "Alexandru";
//        System.out.println(nume.length());

        //charAt
//        System.out.println(nume.charAt(0));
//        System.out.println(nume.charAt(1));
//        System.out.println(nume.charAt(2));
//        System.out.println(nume.charAt(19));

        //indexOf

//        System.out.println(nume.indexOf('A'));
//        char y = 'A';
//        System.out.println(Integer.valueOf(y));
//        System.out.println(nume.indexOf(65));  //ASCII char to int

        //substring

        //toLowerCase

        //equals
        //equalsIgnoreCase
        //startsWith
        //contains
        //replace
        //trim


        //method chaining

//        String start = "  AniMaL  ";
//        System.out.println(start);
//        String trimmed = start.trim();
//        String lowerCase = trimmed.toLowerCase();
//        String result = lowerCase.replace('a', 'e');
//        System.out.println(result);
//
//
//        String chainedResult = start.trim().toLowerCase().replace('a', 'e');
//        System.out.println(chainedResult);


        //StringBuilder

//        String x = " sdwd ";
//        x.concat(" 1234");
//        System.out.println(x);
//
//
//        StringBuilder stringBuilder = new StringBuilder(" sdwd ");
//        stringBuilder.append(123123);
//
//        System.out.println(stringBuilder);

        //charAt, indexOf, length, substring - same as for String

        //append
        //insert
        //delete and deleteCharAt
        //reverse
        //toString
//        StringBuilder sb = new StringBuilder("animals");
//        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
//        int len =  sb.length();
//        char ch = sb.charAt(6);
//        System.out.println(sub + " " + len + " " + ch);

        // A String is immutable in Java, while a StringBuilder is mutable in Java (An immutable object is an object whose content cannot be changed after it is created.)
        //
        // StringBuilder is speedy and consumes less memory than a string while performing concatenations

//        String STR = "ABC";
//        String s1 = new String(STR);
//        String s2 = new String(STR);
//        System.out.println(s1.equals(s2)); // overridden in class String
//
//        StringBuilder sb1 = new StringBuilder(STR);
//        StringBuilder sb2 = new StringBuilder(STR);
//        System.out.println(sb1.equals(sb2)); // not overridden, comes from parent class Object


        //setLength method

//        StringBuilder stringBuilder = new StringBuilder("abc");
//        System.out.println(stringBuilder);
//        stringBuilder.setLength(2);
//        System.out.println(stringBuilder);
//        stringBuilder.append("def");
//        System.out.println(stringBuilder);
//        stringBuilder.setLength(2);
//        System.out.println(stringBuilder);

    }
}