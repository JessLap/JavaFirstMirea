package ru.mirea.task1.opt3;

public class Fact {
    public Fact() {
    }

    public int getFact(int x) {
        int f = 1;

        for(int i = 1; i <= x; ++i) {
            f *= i;
        }

        return f;
    }
}