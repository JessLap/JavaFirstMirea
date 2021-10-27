package ru.mirea.task5.rhird;

public class Chair extends Furniture{

    public Chair(String material){
        this.material = material;
        this.price = 150;
        this.position = "Chair";
        this.country = "Germany";
    }

    @Override
    public String isInStock(){
        return "This position is not available for order.";
    }
}
