package ru.mirea.task7.second;

public class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
       center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    };

    public String toString(){

        return  center +", radius: "+this.radius;
    };

    public void moveUp(){center.moveUp(); };
    public void moveDown(){ center.moveDown(); };
    public void moveLeft(){ center.moveLeft();};
    public void moveRight(){ center.moveRight();};

}
