package ru.mirea.task3.first;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle() {
        this.color = "blue";
        this.filled = false;
        this.radius = 1.0D;
    }

    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.141592653589793D * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.283185307179586D * this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color + ", filled: " + this.filled;
    }
}
