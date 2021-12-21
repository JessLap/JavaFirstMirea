package ru.mirea.task14;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Card {
    protected static Stack<Integer> deck = new Stack<>();

    public void fullStack(){
        for(int i = 0; i <= 9; i++){
            deck.push(i);
        }
        Collections.shuffle(deck);
    }

    public void showDeck(){
        System.out.println("Начальная колода " + deck);
    }

    public static int popCard() {
        return deck.pop();
    }
}