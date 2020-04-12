package GUI.TerrainDisplayTest;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.Color;

class GUI {
    static String encodeString;

    public GUI() {
        JFrame f = new JFrame("Terrain Display Test");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(new Color(191, 198, 204), new Color(191, 198, 204)),
                "Generating Time!"));

        SpringLayout layout = new SpringLayout();

        JTextArea display = new JTextArea(16, 48);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setCaretPosition(display.getDocument().getLength());

        JScrollPane scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JButton genButton = new JButton("Generate");

        genButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                System.out.println("Generating!");
                new Generate();
            }
        });

        panel.add(genButton);
        panel.add(scroll);
        f.add(panel);

        layout.putConstraint(SpringLayout.WEST, display, 40, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, display, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genButton, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genButton, 5, SpringLayout.NORTH, panel);

        f.setResizable(false);
        f.pack();
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.getContentPane().setBackground(Color.BLACK);
        f.setVisible(true);

    }
    // Create textarea 256 "B"s long and color those according to what is generated
}