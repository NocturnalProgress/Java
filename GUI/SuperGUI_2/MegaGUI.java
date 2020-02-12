package GUI_SuperGUI_2;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class MegaGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mega GUI");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(), "GUI Time!"));
        SpringLayout layout = new SpringLayout();

        JButton button = new JButton("");

        JTextArea display = new JTextArea(16, 48);
        JScrollPane scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        display.setEditable(true);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.append(
                "Welcome to the Mega GUI! \n Type in a program: \n Temperature Calculator \n Percent Converter \n Random Name Generator \n DoggoCreator \n ");
        display.setCaretPosition(display.getDocument().getLength());
        Scanner scan = new Scanner(System.in);

        String command = display.getText();
        if (command.equals("Temperature Converter")) {

        } else if (command.equals("Percent Converter")) {
            display.append("Percent Converter is selected");
        } else if (command.equals("Random Name Generator")) {
            display.append("Random Name Generator is selected");
        } else if (command.equals("DoggoCreator")) {
            display.append("DoggoCreator is selected");
        }

        // panel.add(button);
        panel.add(scroll);
        f.add(panel);

        // layout.putConstraint(SpringLayout.WEST, button, 5, SpringLayout.WEST, panel);
        // layout.putConstraint(SpringLayout.NORTH, button, 5, SpringLayout.NORTH,
        // panel);

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