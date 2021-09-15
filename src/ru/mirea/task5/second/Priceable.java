package ru.mirea.task5.second;

public interface Priceable {
    public int Price();
    public default String text(){
        return "The price is " +Price()+"$";
    }
}
