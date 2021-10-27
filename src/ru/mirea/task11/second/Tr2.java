package ru.mirea.task11.second;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class Tr2 {

    public static void addComponentsToPane(Container pane) {

        JButton buttonN = new JButton("NORTH");
        pane.add(buttonN, BorderLayout.PAGE_START);
        buttonN.setToolTipText("Добро пожаловать в Данстар");

        JButton buttonC = new JButton("CENTER");
        pane.add(buttonC, BorderLayout.CENTER);
        buttonC.setToolTipText("Добро подаловать в Вайтран");

        JButton buttonW = new JButton("WEST");
        pane.add(buttonW, BorderLayout.LINE_START);
        buttonW.setToolTipText("Добро пожаловать в Маркарт");

        JButton buttonS = new JButton("SOUTH");
        pane.add(buttonS, BorderLayout.PAGE_END);
        buttonS.setToolTipText("Добро пожаловать в Фолкрит");

        JButton buttonE = new JButton("EAST");
        pane.add(buttonE, BorderLayout.LINE_END);
        buttonE.setToolTipText("Добро пожаловать в Виндхельм");
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        addComponentsToPane(frame.getContentPane());
        frame.setVisible(true);
    }
}