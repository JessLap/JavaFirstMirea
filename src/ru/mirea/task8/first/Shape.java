package ru.mirea.task8.first;
import java.awt.*;

public abstract class Shape {

 protected int xPosition;
 protected int yPosition;
 protected Color color;

 public Shape(){};
 public Shape(Graphics g){
  xPosition = (int)Math.random()*150;
  yPosition = (int)Math.random()*150;
  Color color = new Color((int)(Math.random() * 0x1000000));
  paintComponent(g);
 };

 public void paintComponent(Graphics g){};
}
