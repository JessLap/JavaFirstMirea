package ru.mirea.task5.rhird;

public class Table extends Furniture{

    public  Table(String material){
        this.material = material;
        this.price = 200;
        this.position = "Table";
        this.country = "Italy";
    }


    @Override
    public String isInStock(){
        return "This position is available for order.";
    }
}
