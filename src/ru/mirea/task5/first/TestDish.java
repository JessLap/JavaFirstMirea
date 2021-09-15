package ru.mirea.task5.first;

public class TestDish {
    public static void main(String[] args){

        Knife k1 = new Knife(true, "fish", "right" );
        System.out.println(k1);
        k1.getMaterial();
        k1.getNumber();
        k1.getEat();
        k1.getSharp();


        Fork f1 = new Fork(4, "dessert", "right");
        System.out.println(f1);
        f1.setEat("meat");
        f1.setTeeth(3);
        f1.setMaterial("metal");
        f1.setNumber(10);
        System.out.println(f1);
    }
}
