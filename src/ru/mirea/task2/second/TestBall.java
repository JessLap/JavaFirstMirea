package ru.mirea.task2.second;

public class TestBall {
    public TestBall() {
    }

    public static void main(String[] args) {
        Ball b1 = new Ball("Blue", "s");
        Ball b2 = new Ball("Yellow", "l", 200);
        Ball b3 = new Ball("Pink");
        b3.setPrice(400);
        System.out.println(b1);
        b1.speech();
        b2.speech();
        b3.speech();
    }
}
