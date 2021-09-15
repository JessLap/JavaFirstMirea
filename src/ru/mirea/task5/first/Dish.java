package ru.mirea.task5.first;

public abstract class Dish {
    protected String material;
    protected int number;
    protected String hand;

    public Dish(){
        this.material = "wood";
        this.number = 2;
    }

    public void setMaterial(String material){ this.material = material;}
    public void setNumber(int number){this.number = number;}

    public String getMaterial(){return this.material;}
    public int getNumber(){return this.number;}

    public String toString(){return "material: "+this.material+", number: "+this.number;}

    public abstract String isTrueHand();
}
