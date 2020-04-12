package GUI.InfiniteGUIs;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.util.*;

class InfiniteGUIs {
    boolean loop = true;
    Random rand = new Random();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;

    InfiniteGUIs() {

        new ArrayList<JFrame>();
        while (loop = true) {
            try {
                Thread.sleep(100);
                JFrame frameLoop = new JFrame("Get Pranked!");
                JPanel panelLoop = new JPanel();

                int size1 = rand.nextInt(height);
                int size2 = rand.nextInt(width);

                int randColor1 = rand.nextInt(255);
                int randColor2 = rand.nextInt(255);
                int randColor3 = rand.nextInt(255);

                frameLoop.add(panelLoop);
                panelLoop.setBackground(new Color(randColor1, randColor2, randColor3));
                frameLoop.setVisible(true);
                frameLoop.setSize(size2, size1);
                frameLoop.setLocationRelativeTo(null);

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new InfiniteGUIs();
    }
}