package GUI.MegaGUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class ShopMenu {
    JTextArea display;

    public ShopMenu() {
        JFrame f = new JFrame("Shop");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Shop Time!"));
        // SpringLayout layout = new SpringLayout();

        JButton moneyMult = new JButton("Money multiplier");

        moneyMult.addActionListener(new ActionListener() {
            private PrintStream display;

            public void actionPerformed(ActionEvent a) {
                System.out.println("Money Multipler");
                display.append("Money Multipler");
            }
        });

        panel.add(moneyMult);

        f.add(panel);

        panel.setBackground(new Color(25, 30, 36));

        panel.setForeground(new Color(191, 198, 204));

        f.setResizable(false);
        f.pack();
        f.setSize(300, 200);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.getContentPane().setBackground(Color.BLACK);
        f.add(panel);
        f.setVisible(true);
    }
}