package ru.mirea.task7.second;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    };
    public String toString(){
        return "x: "+this.x +", y: "+this.y+", xSpeed: "+this.xSpeed+", ySpeed: "+this.ySpeed;
    };
    public void moveUp(){
        y += 1;
    };
    public void moveDown(){
        y -=1;
    };
    public void moveLeft(){
        x -= 1;
    };
    public void moveRight(){
        x += 1;
    };

}