package TicTacToe;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class TicTacToe {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        f.setLayout(new GridLayout(3, 3));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.setSize(300, 300);
        f.setVisible(true);
    }
}