package ru.mirea.task5.first;

public class Knife extends Dish{
    protected boolean sharp;
    protected String eat;

    public Knife(boolean sharp,String eat, String hand){
        this.sharp = sharp;
        this.eat = eat;
        this.hand = hand;
    }

    public void setSharp(boolean sharp){ this.sharp = sharp;}
    public void setEat(String eat){this.eat = eat;}

    public boolean getSharp(){return this.sharp;}
    public String getEat(){return this.eat;}

    @Override
    public String toString(){
        return "material: "+this.material+", number: "+this.number+ ", sharp: " + this.sharp + ", eat: "+ this.eat + "\n" + isTrueHand();
    }

    @Override
    public String isTrueHand(){
        if(this.hand == "right")
            return "It is a right hand.";
        else{
            return "It isn't a right hand";
        }
    }
}
