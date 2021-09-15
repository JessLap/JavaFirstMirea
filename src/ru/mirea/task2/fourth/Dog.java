package ru.mirea.task2.fourth;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public Dog(){
        this.name = "new";
        this.age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", age " + this.age;
    }

    public int intoHumanAge() {return this.age * 7;}
    }


