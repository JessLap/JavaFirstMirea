package ru.mirea.task1.opt3;

import java.util.Scanner;

public class TestSum {
    public static void main(String[] args) {

        Sum s = new Sum();
        System.out.println(s.SumFor());
        System.out.println(s.SumWhile());
        System.out.println(s.SumDoWhile());

        System.out.println("Введите строку");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Введенная строка: " + str);

        System.out.println("Гармонический ряд");
        for (int i = 1; i < 11; ++i) {
            System.out.print("1/" + i + " ");
        }
        System.out.println();
        System.out.println("Rand");
        System.out.println();
        int[] b = new int[5];

        for (int m = 0; m < 5; ++m) {
            b[m] = (int) (Math.random() * 100.0D);
            System.out.print(b[m] + " ");
        }
        int max;
        for (int i = 0; i < 5; i++) {
            for (int m = 0; m < 4; m++) {
                if (b[m] > b[m + 1]) {
                    max = b[m];
                    b[m] = b[m + 1];
                    b[m + 1] = max;
                }
            }
        }
        System.out.println();
        for (int m = 0; m < 5; ++m) {
            System.out.print(b[m] + " ");
        }

        System.out.println();
        System.out.println("Факториал");
        Fact f = new Fact();
        System.out.println(f.getFact(5));
}

}
