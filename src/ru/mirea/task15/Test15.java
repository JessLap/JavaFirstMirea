package ru.mirea.task15;
import java.io.*;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args){
        File myFile = new File("src/ru/mirea/task15/File15.txt");
        Scanner in = new Scanner(System.in);
        String str;

        try
        {   System.out.println(myFile.getCanonicalPath() + " существует файл? " + myFile.exists());
            FileWriter rewriter = new FileWriter(myFile, false);
            FileReader reader = new FileReader(myFile);
            FileWriter writer = new FileWriter(myFile, true);

            System.out.println("Введите данные для записи в файл");
            str = in.nextLine();
            rewriter.write(str);
            rewriter.flush();

            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }

            System.out.println("Введите данные для перезаписи файла");
            str = in.nextLine();
            rewriter.write(str);
            rewriter.flush();
            System.out.println("Введите данные для дозаписи в файл");
            str = in.nextLine();
            writer.write(str);
            writer.flush();
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
