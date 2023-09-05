package com.sessions.session15.Homework.Exercise1;

public class Rectangle {
    private final int id;
    private int width;
    private int height;
    public Rectangle(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return id == rectangle.id && width == rectangle.width && height == rectangle.height;
    }
    public int hashCode() {
        return id;
    }
}
