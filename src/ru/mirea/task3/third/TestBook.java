package ru.mirea.task3.third;

public class TestBook {

    public static void main(String[] args){
        Book b1 = new Book ("A.S.Pushkin", "Eugene Onegin", "1823—1830");
        System.out.println(b1);
        System.out.println(b1.getAuthor());
        System.out.println(b1.getName());
        System.out.println(b1.getYear());

        Book b2 = new Book();
        System.out.println(b2);
        b2.setAuthor("L.N.Tolstoy");
        b2.setName("Anna Karenina");
        b2.setYear("1887");
        System.out.println(b2);

    }
}
