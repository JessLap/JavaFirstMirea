package ru.mirea.task5.second;

public class Poodle extends Dog{
    public String fur;

    public Poodle(String Name){
        this.fur = "long";
        this.name = name;
        this.size = "little";
    }

    @Override
    public String toString(){
        return "Dog: poodle, size: "+this.size+", fur: "+this.fur+", name: "+this.name;
    }

}
