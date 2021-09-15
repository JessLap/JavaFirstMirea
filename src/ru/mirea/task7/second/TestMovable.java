package ru.mirea.task7.second;

public class TestMovable {
    public static void main(String[] args){

        MovablePoint point1 = new MovablePoint(2, 3, 1, 7);
        System.out.println(point1);
        point1.moveUp();
        point1.moveLeft();
        System.out.println(point1);

        MovableCircle c1 = new MovableCircle(2, 5,8, 2, 4);
        System.out.println(c1);
        c1.moveDown();
        c1.moveRight();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(4, 7, 7, 3, 2, 1);
        System.out.println(r1);



    }
}
