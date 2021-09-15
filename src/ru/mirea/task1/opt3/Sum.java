package ru.mirea.task1.opt3;

import java.util.Scanner;

public class Sum {
    Scanner sc;
    protected int s;
    protected int[] a;

    public Sum() {
        this.sc = new Scanner(System.in);
        this.a = new int[5];
        System.out.println("Введите 5 значений элементов массива");

        for(int i = 0; i < 5; ++i) {
            this.a[i] = this.sc.nextInt();
        }
    }

    public int SumFor(){
        this.s = 0;
        for(int i = 0; i < 5; ++i) {
            this.s += this.a[i];
        }
        return this.s;
    }

    public int SumWhile(){
        this.s = 0;
        for(int i = 0; i < 5; ++i) {
            this.s += this.a[i];
        }
        return this.s;
    }

    public int SumDoWhile(){
        this.s = 0;
        int i = 0;

        do {
            this.s += this.a[i];
            ++i;
        } while(i < 5);
        return this.s;
    }
    }
