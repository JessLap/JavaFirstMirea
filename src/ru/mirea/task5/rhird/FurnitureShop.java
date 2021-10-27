package ru.mirea.task5.rhird;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        System.out.println("Choose the position: \n 1.Table \n 2.Chair");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Scanner input = new Scanner(System.in);
        switch (i) {
            case 1:
                System.out.println("Which material?");

                String m1 = input.nextLine();
                Furniture table = new Table(m1);
                System.out.println(table);
                System.out.println(table.isInStock());
                break;

            case 2:
                System.out.println("Which material?");
                String m2 = input.nextLine();
                Furniture chair = new Chair(m2);
                System.out.println(chair);
                System.out.println(chair.isInStock());
                break;
        }
    }
}
