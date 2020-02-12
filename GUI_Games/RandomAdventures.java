package GUI_Games;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class RandomAdventures {
    static int health = 100;
    static JLabel displayHealth;

    public static void main(String[] args) {
        JFrame f = new JFrame("Random Adventures");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Game Time!"));
        SpringLayout layout = new SpringLayout();

        JButton adventure = new JButton("Adventure!");

        JLabel healthDisplay = new JLabel("Health: " + health);

        JTextArea display = new JTextArea(16, 48);
        JScrollPane scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        display.setEditable(false);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.append("Welcome to the The Random Adventure Game! \n Press Adventure to begin! \n");
        display.setCaretPosition(display.getDocument().getLength());

        adventure.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                panel.revalidate();

                healthDisplay.setText("Health: " + Integer.toString(health));

                Random randInt = new Random();
                int decision = randInt.nextInt(100);
                if (decision == 0) {
                    display.append("Special Condition 1 \n");
                } else if (decision == 1) {
                    display.append("Special Condition 1 \n");

                } else if (decision == 2) {
                    display.append("Special Condition 2 \n");

                } else if (decision == 3) {
                    display.append("Special Condition 3 \n");

                } else if (decision == 4) {
                    display.append("Special Condition 4 \n");

                } else if (decision == 5) {
                    display.append("Special Condition 5 \n");

                } else if (decision == 6) {
                    display.append("Special Condition 6 \n");

                } else if (decision == 7) {
                    display.append("Special Condition 7 \n");

                } else if (decision == 8) {
                    display.append("Special Condition 8 \n");

                } else if (decision == 9) {
                    display.append("Special Condition 9 \n");

                } else if (decision == 10) {
                    display.append("Special Condition 10 \n");

                } else if (decision > 10 && decision < 20) {
                    display.append("10 through 20 \n");

                } else if (decision >= 20 && decision <= 30) {
                    display.append("20 through 30 \n");

                } else if (decision >= 30 && decision <= 40) {
                    display.append("30 through 40 \n");

                } else if (decision >= 40 && decision <= 50) {
                    display.append("40 through 50 \n");

                } else if (decision >= 50 && decision <= 60) {
                    display.append("50 through 60 \n");

                } else if (decision >= 60 && decision <= 70) {
                    display.append("60 through 70 \n");

                } else if (decision >= 70 && decision <= 80) {
                    display.append("70 through 80 \n");

                } else if (decision >= 80 && decision <= 90) {
                    display.append("80 through 90 \n");

                } else if (decision >= 90 && decision <= 100) {
                    display.append("90 through 100 \n");

                } else {
                    display.append("Invalid Number \n" + decision + "\n");

                }

            }
        });

        panel.add(adventure);
        panel.add(scroll);
        panel.add(healthDisplay);
        f.add(panel);

        layout.putConstraint(SpringLayout.WEST, adventure, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, adventure, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, healthDisplay, 5, SpringLayout.WEST, adventure);
        layout.putConstraint(SpringLayout.NORTH, healthDisplay, 20, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, display, 40, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, display, 100, SpringLayout.NORTH, panel);

        f.setResizable(false);
        f.pack();
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.getContentPane().setBackground(Color.BLACK);
        f.add(panel);
        f.setVisible(true);
    }

}