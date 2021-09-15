package ru.mirea.task5.second;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable car = new Car();
        Priceable house = new House();
        Priceable phone = new Phone();

        System.out.println(car.text());
        System.out.println(house.text());
        System.out.println(phone.text());

    }
}
