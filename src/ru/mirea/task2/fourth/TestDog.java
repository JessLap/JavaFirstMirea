package ru.mirea.task2.fourth;

public class TestDog {
    public static void main(String[] args){

        Dog[] d = new Dog[3];
        d[0] = new Dog("Stark", 3);
        d[1] = new Dog ("Nat", 1);
        d[2] = new Dog ();

        d[2].setName("Stiven");
        d[2].setAge(10);
        System.out.println(d[2].getName());
        System.out.println(d[2].getAge());

        for (int i = 0; i <3; i++){
            System.out.println(d[i]);
            System.out.println("In human ages "+ d[i].intoHumanAge()+" years");
        }

    }
}
