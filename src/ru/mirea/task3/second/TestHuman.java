package ru.mirea.task3.second;

public class TestHuman {
    public static void main(String[] args){

        Human h = new Human("white", 21);
        Leg l = new Leg(5, "left");
        Hand h1 = new Hand(5, "left");
        Head h2 = new Head(2, 1);

        System.out.println(h);
        System.out.println(l);
        System.out.println(h1);
        System.out.println(h2);

    }


}
