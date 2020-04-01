package GUI.ButtonCreator;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import java.util.*;

public class ButtonCreator {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel panel = new JPanel();

        List<JButton> buttonList = new ArrayList<JButton>();
        for (int i = 0; i < 256; i++) {
            JButton button = new JButton("B");
            buttonList.add(button);

            panel.add(button);
            f.add(panel);

            f.setResizable(true);
            f.pack();
            f.setSize(600, 400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null); // Centers JFrame
            f.getContentPane().setBackground(Color.BLACK);
            f.setVisible(true);
        }
    }
}