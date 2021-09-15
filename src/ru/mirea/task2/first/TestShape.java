package ru.mirea.task2.first;

public class TestShape {
    public static void main(String[] args){
        Shape s1 = new Shape ("Square", 4);
        System.out.println(s1.getType());
        System.out.println(s1.getCorners());

        Shape s2 = new Shape();
        System.out.println(s2);

        s2.setType("Triangle");
        s2.setCorners(3);
        System.out.println(s2);
    }
}
