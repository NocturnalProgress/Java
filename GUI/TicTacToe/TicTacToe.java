package GUI.TicTacToe;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class TicTacToe {
    static int square1 = 0;
    static int square2 = 0;
    static int square3 = 0;
    static int square4 = 0;
    static int square5 = 0;
    static int square6 = 0;
    static int square7 = 0;
    static int square8 = 0;
    static int square9 = 0;

    static boolean b1clickable = true;
    static boolean b2clickable = true;
    static boolean b3clickable = true;
    static boolean b4clickable = true;
    static boolean b5clickable = true;
    static boolean b6clickable = true;
    static boolean b7clickable = true;
    static boolean b8clickable = true;
    static boolean b9clickable = true;

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

        if (square1 == 1) {

        } else if (square2 == 1) {

        }

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                if (b1clickable = true) {
                    square1++;
                    b1.setText("X");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                square2++;
                b2.setText("X");
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                square3++;
                b3.setText("X");
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                square4++;
                b4.setText("X");
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                square5++;
                b5.setText("X");
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                square6++;
                b6.setText("X");
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                square7++;
                b7.setText("X");
            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                square8++;
                b8.setText("X");
            }
        });

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                square9++;
                b9.setText("X");
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