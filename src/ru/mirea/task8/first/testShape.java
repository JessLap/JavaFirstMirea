package ru.mirea.task8.first;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class testShape extends  JFrame {
    public void createShape(Graphics g){
        for (int i = 0; i < 20; i++){
            int ch = (int)Math.random()*2;
            if (ch == 0){
                Shape s = new Circle(g);
            } else {
                Shape s = new Square(g);
            };

        }
    }
    public static void main(String[] args) {
        JFrame a = new JFrame("example");
        a.setSize(800,800);
        a.setVisible(true);

        }

    }
