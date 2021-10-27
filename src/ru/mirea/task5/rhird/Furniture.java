package ru.mirea.task5.rhird;

public abstract class Furniture {
    protected String material;
    protected int price;
    protected String country;
    protected String position;


    public String toString(){
        return "Position: " +this.position+ ", material: "+this.material+", price: "+this.price+", country: "+this.country;
    }
    public abstract String isInStock();
}
