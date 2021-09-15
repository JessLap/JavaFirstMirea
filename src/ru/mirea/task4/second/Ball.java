package ru.mirea.task4.second;

public class Ball {
    private double x = 0.0D;
    private double y = 0.0D;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0;
        this.y = 0.13;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x = xDisp;
        this.y = yDisp;
    }

    public String toString() {
        return "Ball @ (" + this.x + ", " + this.y + ").";
    }
}
