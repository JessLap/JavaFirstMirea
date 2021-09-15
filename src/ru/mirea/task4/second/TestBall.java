package ru.mirea.task4.second;

public class TestBall {

    public static void main(String[] args) {

        Ball b1 = new Ball(0.0D, 0.0D);
        System.out.println(b1);

        b1.move(70.0D, -2.0D);
        System.out.println(b1);

        System.out.println(b1.getX());
        System.out.println(b1.getY());

        Ball b2 = new Ball();
        System.out.println(b2);
        b2.setX(2.3);
        b2.setY(-1.2);
        System.out.println(b2);
        b2.setXY(1.5, 7.3);
        System.out.println(b2);
    }
}
