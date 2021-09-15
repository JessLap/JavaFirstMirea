package ru.mirea.task7.second;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
      topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
      bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    };

    public String toString(){
        return "topLeft: \n" +topLeft+ ",\nbottomRight: \n"+bottomRight +"\n"+compareSpeed();
    }

    public void moveUp(){
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    };
    public void moveDown(){
        topLeft.y -=topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    };
    public void moveLeft(){
        topLeft.x -= topLeft.ySpeed;
        bottomRight.x -= bottomRight.ySpeed;
    };
    public void moveRight(){
        topLeft.x += topLeft.ySpeed;
        bottomRight.x += bottomRight.ySpeed;
    };

    public String compareSpeed(){
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed){
            return "speeds are equal";
        } else {
            return "speeds are not equal";
        }
    }
}
