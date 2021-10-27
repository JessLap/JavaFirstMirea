package ru.mirea.task11.third;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.applet.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class Tr3 extends JFrame {
    JTextArea area2;

    public Tr3() {

        area2 = new JTextArea(40, 60);
        area2.setLineWrap(true);
        area2.setWrapStyleWord(true);
        area2.setOpaque(true);
        JPanel contents = new JPanel();
        contents.add(new JScrollPane(area2));
        setContentPane(contents);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(ColorMenu());
        menuBar.add(StyleMenu());
        setJMenuBar(menuBar);

        setSize(1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private JMenu ColorMenu() {

        JMenu color = new JMenu("Цвет");
        JMenuItem red = new JMenuItem("Красный");
        JMenuItem blue = new JMenuItem("Синий");
        JMenuItem green = new JMenuItem("Зеленый");
        color.add(red);
        color.addSeparator();
        color.add(blue);
        color.addSeparator();
        color.add(green);
        red.addActionListener(new redListener());
        blue.addActionListener(new blueListener());
        green.addActionListener(new greenListener());
        return color;

    }
    public class redListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area2.setForeground(Color.red);

        }
    }
    public class blueListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area2.setForeground(Color.blue);

        }
    }
    public class greenListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                area2.setForeground(Color.green);

            }
    }
    private JMenu StyleMenu() {

        JMenu Style = new JMenu("Шрифт");
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem times = new JMenuItem("Times");

        Style.add(arial);
        Style.addSeparator();
        Style.add(times);

        arial.addActionListener(new arialListener());
        times.addActionListener(new timesListener());
        return Style;
    }

    public class arialListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Font fa = new Font("Arial", Font.BOLD + Font.ITALIC, 12);
            area2.setFont(fa);
        }
    }
    public class timesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Font ft = new Font("TimesRoman", Font.BOLD, 10);
            area2.setFont(ft);
        }
    }



    public static void main(String[] args) {
            Tr3 app = new Tr3();
        }
    }
