package ru.mirea.task7.first;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        width = 4;
        length = 15;
        color = "purple";
        filled = false;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        color = "green";
        filled = true;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }

    @Override
    public double getPerimeter(){
        return 2*length+2*width;
    }

    @Override
    public String toString(){
        return "Shape: rectangle, length: "+this.length +" m, width: "+this.width+" m, color: "+this.color+", filled: " +this.filled;
    }

}