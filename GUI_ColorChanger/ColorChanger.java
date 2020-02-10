package GUI_ColorChanger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class ActionEventDemo implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("Go Crazy");

    ActionEventDemo() {
        prepareGUI();
        buttonProperties();
    }

    public void prepareGUI() {
        frame.setTitle("Background Changer");
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setBounds(200, 200, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void buttonProperties() {
        button.setBounds(130, 200, 200, 40);
        frame.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x = 0;
        x = x + 1;

        Random rand = new Random();
        int red = rand.nextInt(256);
        int blue = rand.nextInt(256);
        int green = rand.nextInt(256);
        System.out.println(red + " " + green + " " + blue);
        // Changing Background Color
        frame.getContentPane().setBackground(new Color(red, blue, green));
        frame.repaint();

    }
}

public class ColorChanger {
    public static void main(String[] args) {
        new ActionEventDemo();
    }
}
