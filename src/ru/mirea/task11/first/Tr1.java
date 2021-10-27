package ru.mirea.task11.first;
import ru.mirea.task9.frist.Ft;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.util.Random;
import javax.swing.text.*;


public class Tr1 extends JFrame {
    int count = 3;
    int num;
    private JLabel Count = new JLabel("You have " + count + " attempts");
    private JLabel Res = new JLabel( "Enter your number");
    private JTextField Text = new JTextField(20);
    private JPanel panelB = new JPanel();
    private JPanel panelT = new JPanel();
    private JPanel panelR = new JPanel();
    private JPanel mainPanel = new JPanel();

    public void setNum() {
        Random random = new Random();
        num = random.nextInt(21);
    }

    public Tr1() {
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        panelR.setLayout(new BoxLayout(panelR, BoxLayout.Y_AXIS));
        panelR.add(Count);
        panelR.add(Res);
        panelT.add(Text);
        panelT.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        panelR.setBorder(BorderFactory.createEmptyBorder(100, 10, 0, 10));
        mainPanel.add(panelR);
        mainPanel.add(panelT);
        mainPanel.add(panelB);
        JButton ent = new JButton("Enter");
        panelT.add(ent);
        this.add(mainPanel);
        JButton restart = new JButton("Restart");
        panelB.add(restart);
        ent.addActionListener(new entListener());
        restart.addActionListener(new restartListener());
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setNum();

    }


    public class entListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           String v = Text.getText();
           int number = Integer.parseInt (v);
           if (number == num){
               Res.setText("You Win");
           } else {
               count-=1;
              Count.setText("You have " +count+ " attempts");
               if (count == 0) {
                   Res.setText("You loose");
               } else {
                   if (number > num) {
                       Res.setText("Our value of the number is less");
                   } else {
                       Res.setText("Our value of the number is greater");
                   }
               }
           }
        }
    }

    public class restartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setNum();
            count = 3;
            Count.setText("You have " + count + " attempts");
            Res.setText("Enter your number");
        }
    }
}