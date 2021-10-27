package ru.mirea.task6.second;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable car = new Car();
        Priceable house = new House();
        Priceable phone = new Phone();

        System.out.println("The price is "+ car.Price() +"$");
        System.out.println("The price is "+ house.Price() +"$");
        System.out.println("The price is "+ phone.Price() +"$");

    }
}
