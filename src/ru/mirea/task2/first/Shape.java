package ru.mirea.task2.first;

public class Shape {
    private String type;
    private int corners;

    public Shape(){
        this.type = "Circle";
        this.corners = 0;
    };
    public Shape(String type, int corners){
        this.type = type;
        this.corners = corners;
    }

    public void setType(String type){ this.type = type;}

    public void setCorners(int corners){this.corners = corners;}

    public String getType(){return this.type;}

    public int getCorners(){return this.corners;}

    public String toString(){return this.type + " has " + this.corners + " corners";};



}
