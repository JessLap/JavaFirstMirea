package ru.mirea.task4.first;

public class TestAuthor {

       public static void main(String[] args) {

        Author a1 = new Author("Immanuel Kant", "imKant@mirea.com", 'm');
        System.out.println(a1);

        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a1.getEmail());
        a1.setEmail("immanKaNt@mirea.com");

        System.out.println(a1);
    }
}
