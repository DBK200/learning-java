package com.sessions.session25.CleanCode;

public class LSP {
}
 class Shape{
    int width;
    int height;

    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int calculateArea(){
        return width*height;
    }
 }

 class Square extends Shape{

    @Override
     public void setWidth(int width){
        super.setWidth(width);
        super.setHeight(height);
    }

    @Override
     public void setHeight(int height){
        super.setHeight(height);
        super.setWidth(width);
    }
 }

 class Main3{
     public static void main(String[] args) {
         Shape rectangle = new Shape();
         rectangle.setHeight(5);
         rectangle.setWidth(10);
         int rectangleArea = rectangle.calculateArea();

         Shape square = new Square();
         square.setWidth(5);
         square.setHeight(5);
         int squareArea = square.calculateArea();

         System.out.println("Rectangle area: " + rectangleArea);
         System.out.println("Square area: " + squareArea);
     }
 }
