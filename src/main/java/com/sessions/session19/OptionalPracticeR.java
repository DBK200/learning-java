package com.sessions.session19;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalPracticeR
{
    public static void main(String[] args)
    {
        String myString=null;
        //Optional-valideaza,vdem daca o variabila este null sau nu

        //Varianta 1

         try {
             myString.toUpperCase();
         }catch (Exception e)
         {
             System.out.println("Handle tis somehow");
         }
         //Varianta 2

        if(Objects.isNull(myString))
        {
            System.out.println("Username can not be empty");
        }
        else
        {
            System.out.println(myString.toUpperCase());
        }

        //Optional methods-isPresent()-returneaza un boolean
                       // -get()-
                        //-orElse()-

        //orElse()
        List<String> words= Arrays.asList("hello","how","are","you");
        String x=null;

        String result=words.stream()
                           .reduce((s1,s2)->s1+s2)
                           .orElse("default....ceva");
        System.out.println(result);

        Optional<String > result1 =words.stream()
                                        .reduce((s1, s2)->s1+s2);
        System.out.println(result1);
        System.out.println(result1.get());

        Optional<String > result2=Optional.ofNullable(x);

        //isPresent()

        //varianta1

        if(result2.isPresent())
        {
            System.out.println(result2.get());//ca sa nu mai dea exceptia punem .get()
        }

        //varianta2

        if(result2.isEmpty())
        {
            System.out.println("default...ceva");
        }
        else
        {
            System.out.println(result2.get());
        }

        //Filter method

        Optional<String > stringOptional=Optional.ofNullable("test");
        Optional<String> resolveOptional=stringOptional.filter(y->y.length()>3);
        System.out.println(resolveOptional.isPresent());
        System.out.println(resolveOptional.get());//daca e mai mare decat 4 da o exceptie

        //orElseGet() method

        System.out.println(stringOptional.orElseGet(()->"a"+"b"));//daca stringOptional care este "test" returneaza test
        //altfel daca stringOptional=null returneaza ab

        //isPresent() method

        stringOptional.ifPresent(z-> System.out.println(z+" inside consumer function"));










    }
}
