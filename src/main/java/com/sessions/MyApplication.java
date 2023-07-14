package com.sessions;


public class MyApplication {

    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }

        //String
//        String animal1 = "Lion";
//        String animal2 = "Lion";
//        System.out.println(animal1.equals(animal2));
//        System.out.println(animal1 == animal2);

        //addition vs concatenation

//        System.out.println(1 + 2); // addition
//        System.out.println("a" + 2); //concatenation
//        System.out.println(1 + 2 + "33"); //addition vs concatenation

        //Imumutability - > an object can't be changed once it is created
//        String zi="   Luni   ";
////        zi.trim();
//        zi.concat(" 1");
//        System.out.println(zi);


//        String zi = "Luni"; // garbage collector will delete this
//        System.out.println(zi);
//        zi = "Marti";
//        System.out.println(zi);

        //String methods
        //length

//        String str = "abcd";
//        System.out.println(str.length());
//
        //charAt

//        String str = "abcdef";
//        System.out.println(str.length());
//        System.out.println(str.charAt(20)); // throws exception - index out of range

        //indexOf

//        String str = "Abcdefa";
//        System.out.println(str.indexOf("cde"));
//        System.out.println(str.indexOf('a', 0));
//
//        char x = 'A'; // in ascii is 065 -> int = 65
//        System.out.println(Integer.valueOf(x));
//        System.out.println(str.indexOf(65));

        //substring
//        String alfabet = "abcdefgh";
//        String alfa = alfabet.substring(2,5);
//        String alfa2 = alfabet.substring(2,20); // throws exception index out of bounds
//        System.out.println(alfa);

        //toLowerCase

//        String alfabet = "ABCd23ef"; // -> ABC
//        System.out.println(alfabet.toLowerCase());
//        System.out.println(alfabet.toUpperCase());
//        System.out.println(alfabet);
//
//        String x = "abcd";
//        String y = "ABCD";
//        System.out.println(x.equals(y));
//        System.out.println(x.equalsIgnoreCase(y));
//        System.out.println(x.toLowerCase().equals(y.toLowerCase()));

        //contains
//        String x = "abcd";
//        System.out.println(x.contains("x"));

        //startsWith, endsWith
//        String x = "abcd";
//        System.out.println(x.endsWith("wefwef"));

        // replace

//        String x= "abcad";
//        System.out.println(x.replace('a', 'b'));

        //trim
//        String x = " asdsad  adsferf ";
//        System.out.println(x.trim());


        // method chaining
//        String animal = " AnimAl ";
//        System.out.println(animal);
//        String animalTrimmed = animal.trim();
//        String toLowerCase = animalTrimmed.toLowerCase();
//        String replacedString = toLowerCase.replace('a', 'b');
//        System.out.println(replacedString);
//
//        System.out.println( animal.trim().toLowerCase().replace('a', 'b'));

        // StringBuilder

        // a String is immutable, while a String Builder is mutable
//        String x = " xsdw ";
//        x.concat("x");
//        System.out.println(x);
//
//        StringBuilder strBuildr= new StringBuilder(" xsdw ");
//        strBuildr.append("x");
//        System.out.println(strBuildr);

//        String str = "ABC";
//        String s1 = new String(str);
//        String s2 = new String(str);
//        System.out.println(s1.equals(s2)); // equals checks for the content of the objects "ABC"
//
//
//        StringBuilder sb1 = new StringBuilder(str);
//        StringBuilder sb2 = new StringBuilder(str);
//        System.out.println(sb1.equals(sb2)); // equals does not check for the content
//        System.out.println(sb1 == sb2);

        //StringBuilder methods
        // charAt, indexOf, length, substring - la fel ca la Stringuri

        //append
//        StringBuilder sb =  new StringBuilder("AAAAAA");
//        sb.append("bbbb");
//        System.out.println(sb);

        //insert
//        StringBuilder sb = new StringBuilder("AAA");
//        sb.insert(2, "sdwd");
//        System.out.println(sb);
//
        //deleteCharAt
//        StringBuilder sb= new StringBuilder("ABCD");
//        sb.deleteCharAt(2);
//        System.out.println(sb);

        //delete
//        StringBuilder sb= new StringBuilder("ABCD");
//        sb.delete(70, 100);
//        System.out.println(sb);

        //toString
//        StringBuilder sb = new StringBuilder("ABCD");
//        String myString = sb.toString();
//        System.out.println(sb);

        //reverse

        StringBuilder sb = new StringBuilder("ABCD");
        StringBuilder sbReversed = sb.reverse();
        System.out.println(sbReversed);
        System.out.println(sb);

    }

}
