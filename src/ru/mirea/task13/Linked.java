package ru.mirea.task13;
import java.util.*;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.addFirst(1);
        list.addLast(9);

        System.out.println("Начальный массив");
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("Добавили элемент с индексом 6");
        list.add(6, 3);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("Вывели элемент по индексу 1");
        System.out.println(list.get(1));

        System.out.println("Вывели последнее вхождение 3");
        System.out.println(list.lastIndexOf(3));

        System.out.println("Поменяли элемент с индексом 2");
        list.set(2, 9);
        System.out.println(list);

        System.out.println("Индекс элемента со значением 2");
        System.out.println(list.indexOf(2));

        System.out.println("Вывод элементов с 1 по 6");
        System.out.println(list.subList(1, 7));

        System.out.println("Удаление последнего элемента");
        list.removeLast();
        System.out.println(list);

        System.out.println("Удаление первого элемента");
        list.removeFirst();
        System.out.println(list);
    }
}