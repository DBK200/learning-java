package com.sessions.patternsPractice.creational.factory;

// Concrete Rectangle class
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}