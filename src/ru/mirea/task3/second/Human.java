package ru.mirea.task3.second;

public class Human {
    protected boolean hurt;
    private String skinColor;
    private int age;

    public Human(){
        this.skinColor = "none";
        this.age = 0;
    }

    public Human(String skinColor, int age){
        this.skinColor = skinColor;
        this.age = age;
    }

    public void setColor(String skinColor){
        this.skinColor = skinColor;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getColor(){
        return this.skinColor;
    }
    public boolean isHurt(){return false;};

    public String toString(){
        return "skin color: "+ this.skinColor + ", age: " + this.age;
    }


}
