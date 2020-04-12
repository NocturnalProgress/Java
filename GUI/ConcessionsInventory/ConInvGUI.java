package GUI.ConcessionsInventory;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class ConInvGUI {
    public ConInvGUI() throws IOException {
        JFrame f = new JFrame("Conessions Inventory");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(new Color(191, 198, 204), new Color(191, 198, 204)),
                "Inventory Time!"));

        SpringLayout layout = new SpringLayout();

        JLabel menu = new JLabel();
        menu.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("menu.jpg")).getImage()
                .getScaledInstance(250, 200, Image.SCALE_SMOOTH)));

        JLabel itemSoldLabel = new JLabel("Item sold: ");

        JTextField itemSoldField = new JTextField("", +15);

        JLabel amountSoldLabel = new JLabel("Amount of items sold: ", +15);

        JTextField amountSoldField = new JTextField("", +15);

        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try (FileWriter fileWrite = new FileWriter(
                        "C:/Users/noctu/OneDrive/VS Code/Java/GUI/ConoessionsInventory/Inventory.txt", false);
                        BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
                        PrintWriter out = new PrintWriter(bufferWrite)) {
                    // out.println(display.getText());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        panel.add(itemSoldField);
        panel.add(itemSoldLabel);
        panel.add(amountSoldField);
        panel.add(amountSoldLabel);
        panel.add(submit);
        panel.add(menu);
        f.add(panel);

        layout.putConstraint(SpringLayout.WEST, menu, 0, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, menu, 0, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, itemSoldLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, itemSoldLabel, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, itemSoldField, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, itemSoldField, 10, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, amountSoldLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, amountSoldLabel, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, amountSoldField, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, amountSoldField, 10, SpringLayout.NORTH, panel);

        f.setResizable(true);
        f.pack();
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.getContentPane().setBackground(Color.BLACK);
        f.setVisible(true);
    }
}