package ru.mirea.task5.first;

public class Fork extends Dish{
    protected int teeth;
    protected String eat;

    public Fork(int teeth,String eat, String hand){
        this.teeth = teeth;
        this.eat = eat;
        this.hand = hand;
    }

    public void setTeeth(int teeth){ this.teeth = teeth;}
    public void setEat(String eat){this.eat = eat;}

    public int getTeeth(){return this.teeth;}
    public String getEat(){return this.eat;}

    @Override
    public String toString(){
        return "material: "+this.material+", number: "+this.number+ ", teeth: " + this.teeth + ", eat: "+ this.eat + "\n" + isTrueHand();
    }

    @Override
    public String isTrueHand(){
        if(this.hand == "left")
            return "It is a right hand.";
        else{
            return "It isn't a right hand";
        }
    }
}

