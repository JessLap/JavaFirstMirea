package ru.mirea.task7.first;

public class Square extends Rectangle {

    public Square(){
        width = 10;
        length = 10;
        color = "black";
        filled = false;
    }
    public Square(double side){
        width = side;
        length = side;
        color = "black";
        filled = false;
    }
    public Square(double side, String color, boolean filled){
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }
    public double getSide(){
        return width;
    }

    @Override
    public void setWidth(double side){
        this.width = side;
    }

    @Override
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString(){
        return "Shape: square, side: "+this.width+" m, color: "+this.color+", filled: "+this.filled;
    }
}
