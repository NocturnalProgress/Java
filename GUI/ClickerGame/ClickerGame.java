package GUI.ClickerGame;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;

class ClickerGame {
    static int money = 100;
    static int x = 200;
    static int mult = 10;
    static int amount;
    static SimpleDateFormat formatter = new SimpleDateFormat("[dd/MM/yyyy HH:mm:ss]");
    static Date date = new Date();

    public static void main(String[] args) {
        JFrame f = new JFrame("Clicker Game");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Game Time!"));
        SpringLayout layout = new SpringLayout();

        JButton makeMoney = new JButton("Click Me!");

        JButton saveData = new JButton("Save");

        JButton loadData = new JButton("Load");

        JTextArea display = new JTextArea(16, 48);
        JScrollPane scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        display.setEditable(false);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setCaretPosition(display.getDocument().getLength());
        display.append("Welcome to the The Clicker Game Game! \n Press the button to begin making money! \n");

        JLabel moneyLabel = new JLabel("Money: " + money);

        makeMoney.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                money = money + mult;
                panel.repaint();

                if (money == x) {
                    mult = mult + 10;
                    x = x + 10;

                }

                moneyLabel.setText("Money: " + Integer.toString(money));

            }
        });

        saveData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try (FileWriter fileWrite = new FileWriter(
                        "C:/Users/noctu/OneDrive/VS Code/Java/GUI/ClickerGame/Save.txt", false);
                        BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
                        PrintWriter out = new PrintWriter(bufferWrite)) {
                    out.println(formatter.format(date) + "\n" + money + "\n");
                    display.append("Save successful! \n");

                } catch (IOException e) {
                    display.append("Save unsucessful! \n");
                    e.printStackTrace();
                }
            }
        });

        loadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try (Scanner scan = new Scanner(
                        new File("C:/Users/noctu/OneDrive/VS Code/Java/GUI/ClickerGame/Save.txt"))) {
                    String lastSave = scan.nextLine();
                    display.append("Last save: " + lastSave + "\n");
                    int amount = scan.nextInt();
                    display.append("Amount of money: " + amount + "\n");
                    moneyLabel.setText("Money: " + Integer.toString(amount));
                } catch (IOException e) {
                    display.append("Load unsuccessful");
                    e.printStackTrace();
                }

            }
        });

        panel.add(makeMoney);
        panel.add(scroll);
        panel.add(moneyLabel);
        panel.add(saveData);
        panel.add(loadData);
        f.add(panel);

        layout.putConstraint(SpringLayout.WEST, makeMoney, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, makeMoney, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, saveData, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, saveData, 50, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, saveData, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, saveData, 80, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, moneyLabel, 5, SpringLayout.WEST, makeMoney);
        layout.putConstraint(SpringLayout.NORTH, moneyLabel, 20, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, display, 40, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, display, 100, SpringLayout.NORTH, panel);

        f.setResizable(true);
        f.pack();
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.getContentPane().setBackground(Color.BLACK);
        f.add(panel);
        f.setVisible(true);

    }
}