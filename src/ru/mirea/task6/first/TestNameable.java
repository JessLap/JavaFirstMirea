package ru.mirea.task6.first;

public class TestNameable {
    public static void main(String[] args){

        Nameable dog = new Dog();
        Nameable pig = new Pig();
        Nameable duck = new Duck();

        System.out.println(dog.getName());
        System.out.println(pig.getName());
        System.out.println(duck.getName());
    }

}
