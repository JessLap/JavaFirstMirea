package ru.mirea.task12.third;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Test {

    public void fillArr(ArrayList l){
        Random random = new Random();
        for(int i = 0; i< 10; i++){
            int r = random.nextInt(100);
            l.add(r);
        }
    }
    public void printArr(ArrayList l){
        System.out.println(l);
    }
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        ArrayList<Integer> l = new ArrayList<>();

        Test t = new Test();

        t.fillArr(l1);
        t.fillArr(l2);

        t.printArr(l1);
        t.printArr(l2);

        Collections.sort(l1);
        Collections.sort(l2);

        t.printArr(l1);
        t.printArr(l2);

        int i1=0;
        int i2=0;
        int el1, el2;

        for(int i = 0; i1<10 && i2<10; i++){
            el1 = l1.get(i1);
            el2 = l2.get(i2);
            if(el1>el2){
                l.add(el2);
                i2++;
            } else {
                l.add(el1);
                i1++;
            }
        }
        l.addAll(l1);
        l.addAll(l2);

        t.printArr(l);
    }
}
