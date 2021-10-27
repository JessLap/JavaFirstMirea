package ru.mirea.task3.second;

public class Leg extends Human{
    private int fingers;
    private String side;

    public Leg(int fingers, String side){
        this.fingers = fingers;
        this.side = side;
    }

    public void setFingers(int fingers){
        this.fingers = fingers;
    }

    public void setSide(String side){
        this.side = side;
    }

    public int getFingers(){
        return this.fingers;
    }

    public String getSide(){
        return this.side;
    }

    @Override
    public boolean isHurt(){
        if (fingers != 5){
            hurt = true;
        } else {
            hurt = false;
        }
        return hurt;
    }

    public String toString(){
        return "part: leg, side: " + this.side + ", number of fingers: " + this.fingers + ", is it hurts: " +isHurt();
    }
}
