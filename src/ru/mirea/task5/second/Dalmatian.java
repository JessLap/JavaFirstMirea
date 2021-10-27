package ru.mirea.task5.second;

public class Dalmatian extends Dog {
    public String color;

    public Dalmatian(String name) {
        this.color = "black and white";
        this.name = name;
        this.size = "big";
    }

    @Override
    public String toString() {
        return "Dog: dalmatian, size: " + this.size + ", color: " + this.color + ", name: " + this.name;
    }
}
