package com.sessions.session11.Homework11.IV;

public class Area extends ShapeDv{

     void rectangleArea(int length,int breath)
     {
         int a=length*breath;
         System.out.println("Area of rectangle is "+ a);
     }
     void squareArea(int side){
         int a=side*side;
         System.out.println("Area of square is "+ a);
     }
     void circleArea(int radius){
         final float pi=3.14f;
         int a = radius*radius;
         float ar=a*pi;
         System.out.println("Area of circle is "+ ar);
     }
}
