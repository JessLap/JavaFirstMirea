package ru.mirea.task12.first;
import java.util.Random;

public class Student {
    public int[] iDNumber = new int[10];

    public Student(){
        Random random = new Random();
        for (int i = 0; i< 10; i++){
            iDNumber[i] = random.nextInt(100);
        }
    }

    public void InsertionSort(){
        for(int i = 1; i < 10; i++){
            int value = iDNumber[i];
            int l = i-1;
            while( l >= 0 && iDNumber[l] > value){
                iDNumber[l+1] = iDNumber[l];
                iDNumber[l] = value;
                l--;
            }

        }
    }

    public void printArr(){
        for (int i = 0; i < 10; i++){
            System.out.print(iDNumber[i] + " ");
        }
    }
}

class Main{
    public static void main(String[] args){
        Student s = new Student();
        s.printArr();
        s.InsertionSort();
        System.out.println("Отсортированный массив");
        s.printArr();
    }
}