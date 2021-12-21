package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Stack;

public class Player extends Card {

    private String name;
    ArrayDeque<Integer> personalDeck = new ArrayDeque<>();

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void fullPersonalDeck(){
        for (int i = 0; i < 5; i++) {
            personalDeck.addLast(Card.popCard());
        }
    }

    public int discard(){
        return personalDeck.pollLast();
    }

    public ArrayDeque<Integer> getArrayDeque() {
        return personalDeck;
    }

    public void showCards(){
        System.out.println("Колода " + name + " *низ* " + personalDeck + " *верх* ");
    }
}