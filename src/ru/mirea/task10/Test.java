package ru.mirea.task10;
import java.util.Scanner;

public class Test {

    public static void t14(int num){

        if(num>9)
            t14(num/10);
        System.out.println(num%10);
    }
    public static void t15(int num){
        System.out.println(num%10);
        if(num>9)
            t15(num/10);

    }
    public static int t16(){
        Scanner in1 = new Scanner(System.in);
        int num = in1.nextInt();
        if(num != 0) {
            int n = t16();
            if(n>num)
                num = n;
        }
            return num;
    }
    public static void t17(int c, int n){
        Scanner in1 = new Scanner(System.in);
        int num = in1.nextInt();
        if(num != 0) {
            if(num>n)
                t17(1, num);
            else if(num == n)
                t17(++c, num);
            else
                t17(c, n);
        } else
            System.out.println("Максимальных значений в последовательности: " + c);

    }


    public static String t1(int n){
            int sum = 0;
            int j = 0;
            if (n == 1) {
                System.out.print("1");
            } else {
                for (int i = 1; sum < n; i++) {
                    sum += i;
                    j = i;
                }

                System.out.print(t1(--n) + " " + j);
            }
            return "";
        }


    public static void main(String[] args){
        System.out.println("Введите число, которое необходимо вывести с начала");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        t14(num1);
        System.out.println("Конец 14");

        System.out.println("Введите число, которое необходимо вывести с конца");
        int num2 = in.nextInt();
        t15(num2);
        System.out.println("Конец 15");

        System.out.println("Введите последовательность чисел, она должна оканчиваться нулем");
        System.out.println("Максимальное значение в последовательности: " + t16());
        System.out.println("Конец 16");

        System.out.println("Введите последовательность чисел, она должна оканчиваться нулем");
        t17(1, 0);
        System.out.println("Конец 17");

        System.out.println("Введите число");
        int num3 = in.nextInt();
        t1(num3);

    }
}
