package ru.mirea.task8.first;


public class Circle extends Shape{
    private double radius = 1.0f;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}