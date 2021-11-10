package ru.mirea.task13;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList();

        digits.add(1);
        digits.add(2);
        digits.add(21);
        digits.add(3);

        System.out.println(digits);
        System.out.printf("Размер массива = %d\n\n", digits.size());

        digits.add(4, 17);
        System.out.println(digits);
        System.out.printf("Добавили новый элемент в конец массива.\n" +
                "Новая длина массива = %d\n\n", digits.size());

        System.out.printf("Вывод элемента по индексу 1\n%d\n\n", digits.get(1));

        System.out.println("Заменили значение первой ячейки массива");
        digits.set(0, 5);
        System.out.printf(digits + "\n\n");

        System.out.printf("Индекс ячейки со значением 3 = %d\n", digits.indexOf(3));
    }

}