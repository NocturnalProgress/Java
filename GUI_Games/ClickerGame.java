package GUI_Games;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

class ClickerGame {
    static int money = 100;
    static JLabel displayMoney;

    public static void main(String[] args) {
        JFrame f = new JFrame("Clicker Game");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Game Time!"));
        SpringLayout layout = new SpringLayout();

        JButton makeMoney = new JButton("Click Me!");

        JTextArea display = new JTextArea(16, 48);
        JScrollPane scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        display.setEditable(false);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.append("Welcome to the The Clicker Game Game! \n Press the button to begin making money! \n");

        JLabel moneyLabel = new JLabel("Money: ");
        JTextField displayMoney = new JTextField(money);

        makeMoney.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                money = money + 1;
                panel.repaint();
                updateTime();

            }
        });

        panel.add(makeMoney);
        panel.add(scroll);
        panel.add(displayMoney);
        panel.add(moneyLabel);
        f.add(panel);

        layout.putConstraint(SpringLayout.WEST, makeMoney, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, makeMoney, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, displayMoney, 5, SpringLayout.WEST, moneyLabel);
        layout.putConstraint(SpringLayout.NORTH, displayMoney, 20, SpringLayout.NORTH, panel);
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

    private static void updateTime() {

        displayMoney.setText(String.valueOf(money));
    }

}