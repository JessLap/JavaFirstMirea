package ru.mirea.task8.first;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Square extends Shape{
    private int width;
    private int height;

    public Square(Graphics g){
        width = (int)Math.random()*150;
        height = (int)Math.random()*150;;
    };

    @Override
    public void paintComponent(Graphics g){
        g.setColor(color);
        g.fillRect(xPosition, yPosition, width, height);
    }
}