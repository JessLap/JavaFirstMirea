package ru.mirea.task3.second;

public class Head extends Human{
    private int eyes;
    private int ears;

    public Head(int eyes, int ears){
        this.eyes = eyes;
        this.ears = ears;
    }

    public void setEyes(int eyes){
        this.eyes = eyes;
    }

    public void setEars(int ears){
        this.ears = ears;
    }

    public int getEyes(){
        return this.eyes;
    }

    public int getEars(){
        return this.ears;
    }

    @Override
    public boolean isHurt(){
        if(eyes == 2 && ears == 2){
            hurt = false;
        } else {hurt = true;};
        return hurt;
    }

    public String toString(){
        return "part: head, number of eyes: "+this.eyes + "number of ears: "+ this.ears+", is it hurts: "+ isHurt();
    }
}
