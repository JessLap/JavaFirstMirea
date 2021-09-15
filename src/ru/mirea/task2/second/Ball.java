package ru.mirea.task2.second;

public class Ball {
    private String color;
    private String size;
    private int price;

    public Ball(String c, String s) {
        this.color = c;
        this.size = s;
        String var3 = this.size;
        byte var4 = -1;

        switch(var3.hashCode()) {
            case 108:
                    var4 = 2;
                break;
            case 109:
                    var4 = 1;
                break;
            case 115:
                    var4 = 0;

        }

        switch(var4) {
            case 0:
                this.price = 150;
                break;
            case 1:
                this.price = 250;
                break;
            case 2:
                this.price = 350;
        }

    }

    public Ball(String c) {
        this.color = c;
        this.size = "s";
        this.price = 250;
    }

    public Ball(String s, String c, int p) {
        this.color = c;
        this.size = s;
        this.price = p;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public String getSize() {
        return this.size;
    }

    public int getPrice() {
        return this.price;
    }

    public String toString() {
        return this.color + " " + this.size + " " + this.price;
    }

    public void speech() {
        System.out.println("Your " + this.color + " " + this.size + " ball costs " + this.price);
    }
}