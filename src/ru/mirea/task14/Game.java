package ru.mirea.task14;

import java.util.Stack;

public class Game {
    private static int counter;

    public static void takeCards(Player who, Player from) {
        who.getArrayDeque().addFirst(who.discard());
        who.getArrayDeque().addFirst(from.discard());
        System.out.println("Колода " +who.getName() + who.getArrayDeque());
        System.out.println("Колода " +from.getName() + from.getArrayDeque() + "\n");
    }

    public static void main(String[] args) {
        Card deck = new Card();
        deck.fullStack();
        deck.showDeck();
        System.out.println("Игроки берут по 5 карт");

        Player player1 = new Player("Первого игрока");
        Player player2 = new Player("Второго игрока");

        player1.fullPersonalDeck();
        player2.fullPersonalDeck();

        deck.showDeck();

        player1.showCards();
        player2.showCards();

        System.out.println("---Начало игры---");
        while(player1.getArrayDeque().peekFirst() != null || player2.getArrayDeque().peekFirst() != null){
            try {

                System.out.println("Первый игрок выбросил " + player1.getArrayDeque().peekLast());
                System.out.println("Второй игрок выбросил " + player2.getArrayDeque().peekLast());

                if (player1.getArrayDeque().peekLast() < player2.getArrayDeque().peekLast()) {

                    if (player1.getArrayDeque().peekLast() - player2.getArrayDeque().peekLast() == -9){
                        System.out.println("Первый игрок забирает карты");
                        takeCards(player1, player2);
                    }
                    else {
                        System.out.println("Второй игрок забирает карты");
                        takeCards(player2, player1);
                    }
                }
                else if (player1.getArrayDeque().peekLast() > player2.getArrayDeque().peekLast()){
                    System.out.println("Первый игрок забирает карты");
                    takeCards(player1, player2);
                }
                counter++;
            }
            catch (NullPointerException e) {
                if (counter > 106) {
                    System.out.println("БОТВА");
                }
                else {
                    System.out.println("---Конец игры---");
                    if (player1.getArrayDeque().peekFirst() == null){
                        System.out.println("Выиграл второй игрок за " + counter + " ходов");
                    }
                    else if (player2.getArrayDeque().peekFirst() == null) {
                        System.out.println("Выиграл первый игрок за " + counter + " ходов");
                    }
                }
                break;
            }
        }
    }
}