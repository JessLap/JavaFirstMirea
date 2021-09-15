package ru.mirea.task3.first;

public class TestCircle {

    public static void main(String[] args){
        Circle s1 = new Circle(5.5D, "red", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        Circle s2 = new Circle();
        System.out.println(s2);
        s2.setColor("green");
        s2.setFilled(true);
        s2.setRadius(4.6);
        System.out.println(s2);

    }

}
