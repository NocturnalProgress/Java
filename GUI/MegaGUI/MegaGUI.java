package GUI.MegaGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MegaGUI {
    public MegaGUI() {
        JFrame f = new JFrame("MegaGUI");
        JPanel panel = new JPanel();

        // SpringLayout layout = new SpringLayout();

        JButton randomTextGen = new JButton("Random Text Generator");
        randomTextGen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                new RandomTextGen();
            }
        });

        JButton randomAdventures = new JButton("Random Adventures");
        randomAdventures.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                new RandomAdventures();
            }
        });

        JButton tempConverter = new JButton("Temperature Converter");
        tempConverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        JButton percentCalc = new JButton("Percent Calculator");
        percentCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                new PercentCalc();
            }
        });

        JButton textEditor = new JButton("Text Editor");
        textEditor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        JButton clickerGame = new JButton("Clicker Game");
        clickerGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                new ClickerGame();
            }
        });

        JButton infiniteGUIs = new JButton("Infinite GUIs");
        infiniteGUIs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

            }
        });

        panel.add(randomTextGen);
        panel.add(randomAdventures);
        panel.add(tempConverter);
        panel.add(percentCalc);
        panel.add(clickerGame);
        panel.add(infiniteGUIs);

        f.add(panel);

        f.setResizable(false);
        f.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        f.setSize(width / 4, height / 2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new MegaGUI();
    }
}