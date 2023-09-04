package com.sessions.session13.Homework.BasicJava;

public class Ex1
  {
//    Integer Overflow: Write a program that multiplies two int values and stores the result in an int.
//    What happens if the result is larger than the maximum int value?
//    How can you handle this scenario?
      private static int Overflow(int x,int y)
      {
          int inmultire=x*y;
          if((inmultire< Integer.MIN_VALUE )&& (inmultire>Integer.MAX_VALUE))
          {
              return (int) inmultire;
          }
          else
          {
              return -1;
          }
      }

      public static void main(String[] args)
      {
          System.out.println("Inmultirea a doua nr normale:" +Overflow(2,5));
          System.out.println("Inmultirea a doua nr mai mari decat maximul lui int " +Overflow(999999999,999999999));

      }


  }
