package GUI.TerrainGeneratorv2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateTerrain {
    static int x = 64;
    static int y = 256;

    public static void main(String[] args) {
        JFrame genFrame = new JFrame("Generated Terrain");
        JPanel genPanel = new JPanel();
        genPanel.setLayout(new GridLayout(x, y));
        System.out.println(x);
        System.out.println(y);

        SpringLayout layout = new SpringLayout();

        List<JButton> buttonList = new ArrayList<JButton>();
        for (int i = 0; i < 256; i++) {
            JButton button = new JButton("B");
            genPanel.add(button);
            button.setBackground(new Color(155, 118, 83));
        }
        genFrame.add(genPanel);

        genPanel.setBackground(new Color(170, 170, 170));

        genFrame.setResizable(false);
        genFrame.pack();
        genFrame.setSize(400, 900);
        genFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        genFrame.setLocationRelativeTo(null); // Centers JFrame

        genFrame.setVisible(true);
    }
}