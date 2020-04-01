package GUI.MegaGUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class RandomAdventures {
    static int health = 100;
    static JLabel displayHealth;
    static int scenarioCounter = 0;
    static boolean play = true;

    public RandomAdventures() {
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
        display.setCaretPosition(display.getDocument().getLength());
        display.append("Welcome to the The Random Adventure Game! \n Press Adventure to begin! \n");

        adventure.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                panel.revalidate();

                healthDisplay.setText("Health: " + Integer.toString(health));

                scenarioCounter++;
                Random randInt = new Random();
                int scenario = randInt.nextInt(100);
                if (play == true) {
                    if (health <= 0) {
                        display.append("\n" + "Game Over.." + "\n");
                        play = false;
                    }
                    if (scenario == 0) {
                        display.append("Special Condition 0 \n");
                        health = health + 10;
                    } else if (scenario == 1) {
                        display.append("Special Condition 1 \n");
                        health = health + 2;

                    } else if (scenario == 2) {
                        display.append("Special Condition 2 \n");
                        health = health * 3;

                    } else if (scenario == 3) {
                        display.append("Special Condition 3 \n");
                        health = health * 2;

                    } else if (scenario == 4) {
                        display.append("Special Condition 4 \n");
                        health = health - 20;

                    } else if (scenario == 5) {
                        display.append("Special Condition 5 \n");
                        health = health + 12;

                    } else if (scenario == 6) {
                        display.append("Special Condition 6 \n");
                        health = health + 40;

                    } else if (scenario == 7) {
                        display.append("Special Condition 7 \n");
                        health = health - 70;

                    } else if (scenario == 8) {
                        display.append("Special Condition 8 \n");
                        health = health + 38;

                    } else if (scenario == 9) {
                        display.append("Special Condition 9 \n");
                        health = health - 100;

                    } else if (scenario == 10) {
                        display.append("Special Condition 10 \n");
                        health = health / 2;

                    } else if (scenario > 10 && scenario < 20) {
                        display.append("10 through 20 \n");
                        health = health - 48;

                    } else if (scenario >= 20 && scenario <= 30) {
                        display.append("20 through 30 \n");
                        health = health - 70;

                    } else if (scenario >= 30 && scenario <= 40) {
                        display.append("30 through 40 \n");
                        health = health + 14;

                    } else if (scenario >= 40 && scenario <= 50) {
                        display.append("40 through 50 \n");
                        health = health + 60;

                    } else if (scenario >= 50 && scenario <= 60) {
                        display.append("50 through 60 \n");
                        health = health - 69;

                    } else if (scenario >= 60 && scenario <= 70) {
                        display.append("60 through 70 \n");
                        health = health + 65;

                    } else if (scenario >= 70 && scenario <= 80) {
                        display.append("70 through 80 \n");
                        health = health - 94;

                    } else if (scenario >= 80 && scenario <= 90) {
                        display.append("80 through 90 \n");
                        health = health - 43;

                    } else if (scenario >= 90 && scenario <= 100) {
                        display.append("90 through 100 \n");
                        health = health + 59;

                    } else {
                        display.append("Invalid Number \n" + scenario + "\n");

                    }
                }

                if (scenarioCounter == 25) {
                    display.append("\n" + "Congratulations! You've survived!" + "\n");
                    play = false;
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
        f.setLocationRelativeTo(null); // Centers JFrame
        f.getContentPane().setBackground(Color.BLACK);
        f.add(panel);
        f.setVisible(true);
    }

}