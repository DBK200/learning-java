package com.sessions.session25.CleanCode;

public interface OCP {
    double calculateArea();
}

class Circle implements OCP{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle implements OCP{
    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double calculateArea(){
        return width * height;
    }
}
interface ShapeWithPerimeter extends OCP{
    double calculatePerimeter();
}

class CircleWithPerimeter extends Circle implements ShapeWithPerimeter{
    public CircleWithPerimeter(double radius){
        super(radius);
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

class RectangleWithPerimeter extends Rectangle implements ShapeWithPerimeter{
    public RectangleWithPerimeter(double width, double height){
        super(width, height);
    }

    @Override
    public double calculatePerimeter(){
        return 2*(width + height);
    }
}

 class Main2{
    public static void main(String[] args) {
        OCP circle = new CircleWithPerimeter(4.2);
        OCP rectangle = new RectangleWithPerimeter(2.5, 5.5);

        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + ((ShapeWithPerimeter) circle).calculatePerimeter());

        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle: " + ((ShapeWithPerimeter) rectangle).calculatePerimeter());
    }
}

