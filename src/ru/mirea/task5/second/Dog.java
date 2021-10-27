package ru.mirea.task5.second;

public abstract class Dog {
    public String name;
   public String size;

    public Dog(String name, String size){
        this.name = name;
        this.size = size;
    }
    public Dog(){};

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String toString(){
        return "name: "+this.name+", size: "+this.size;
    }


}
