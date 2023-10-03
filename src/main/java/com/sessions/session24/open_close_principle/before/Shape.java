package com.sessions.session24.open_close_principle.before;

public class Shape {
    private String type;

    public double calculateArea() {
        if (type.equals("circle")) {
            double radius = 2; // get the radius
            return Math.PI * radius * radius;
        } else if (type.equals("square")) {
            double side = 2; // get the side length
            return side * side;
        } else if (type.equals("rectangle")) {
            double length = 2; // get the length
            double width = 3; // get the width
            return length * width;
        } else {
            throw new UnsupportedOperationException("Invalid shape type.");
        }
    }
}
