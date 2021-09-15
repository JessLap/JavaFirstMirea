package ru.mirea.task3.second;

public class Head extends Human{
    private int eyes;
    private int ears;

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
}
