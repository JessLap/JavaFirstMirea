package ru.mirea.task2.third;

import ru.mirea.task3.third.Book;

public class TestBook {

    public static void main(String[] args){
        ru.mirea.task3.third.Book b1 = new ru.mirea.task3.third.Book("A.S.Pushkin", "Eugene Onegin", "1823—1830");
        System.out.println(b1);
        System.out.println(b1.getAuthor());
        System.out.println(b1.getName());
        System.out.println(b1.getYear());

        ru.mirea.task3.third.Book b2 = new Book();
        System.out.println(b2);
        b2.setAuthor("L.N.Tolstoy");
        b2.setName("Anna Karenina");
        b2.setYear("1887");
        System.out.println(b2);

    }
}