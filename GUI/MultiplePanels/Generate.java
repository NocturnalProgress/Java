package GUI.MultiplePanels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.security.*;

public class Generate {
    static int x = 64;
    static int y = 256;

    JButton stoneBlock;
    JButton selectedBlock;

    ActionListener stone;
    ActionListener coal;
    ActionListener iron;
    ActionListener gold;
    ActionListener lapus;
    ActionListener emerald;
    ActionListener quartz;
    ActionListener diamond;

    Generate() {
        MultiplePanels.display.append("Coal: " + MultiplePanels.coalAmount + "\n");
        MultiplePanels.display.append("Iron: " + MultiplePanels.coalAmount + "\n");
        MultiplePanels.display.append("Gold: " + MultiplePanels.coalAmount + "\n");
        MultiplePanels.display.append("Lapus: " + MultiplePanels.coalAmount + "\n");
        MultiplePanels.display.append("Emerald: " + MultiplePanels.coalAmount + "\n");
        MultiplePanels.display.append("Quartz: " + MultiplePanels.coalAmount + "\n");
        MultiplePanels.display.append("Diamond: " + MultiplePanels.coalAmount + "\n");

        JFrame genFrame = new JFrame("Generated Terrain");
        JPanel genPanel = new JPanel();
        genPanel.setLayout(new GridLayout(x, y));
        // System.out.printf("coalAmount: ", coalAmount);

        List<JButton> stoneButtonList = new ArrayList<JButton>();
        for (int i = 0; i < 256; i++) {
            stoneBlock = new JButton(("" + (i + 1)));

            genPanel.add(stoneBlock);
            stoneButtonList.add(stoneBlock);
            stoneBlock.setBackground(new Color(170, 170, 170));

            stone = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Stone");
                }
            };

            stoneBlock.addActionListener(stone);

        }

        // Remove the "Stone" actionListener for blocks that aren't stone
        SecureRandom rand = new SecureRandom();

        for (int counter = 0; counter != Integer.parseInt(MultiplePanels.coalAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // System.out.println("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            coal = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Coal");
                }
            };

            /*
             * for (ActionListener stone : Arrays.asList(stoneBlock.getActionListeners())) {
             * stoneBlock.removeActionListener(stone); }
             * 
             * for (ActionListener stone : Arrays.asList(stoneBlock.getActionListeners())) {
             * selectedBlock.removeActionListener(stone); }
             */
            selectedBlock.addActionListener(coal);

            selectedBlock.setBackground(new Color(0, 0, 0));
        }

        for (int counter = 0; counter != Integer.parseInt(MultiplePanels.ironAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // System.out.println("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            iron = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Iron");
                }
            };

            selectedBlock.addActionListener(iron);

            selectedBlock.setBackground(new Color(211, 211, 211));
        }

        for (int counter = 0; counter != Integer.parseInt(MultiplePanels.goldAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // System.out.println("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);
            // Change to gold color
            selectedBlock.setBackground(Color.YELLOW);
        }

        for (int counter = 0; counter != Integer.parseInt(MultiplePanels.lapusAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // System.out.println("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            selectedBlock.setBackground(Color.BLUE);
        }

        for (int counter = 0; counter != Integer.parseInt(MultiplePanels.emeraldAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // System.out.println("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            selectedBlock.setBackground(Color.GREEN);
        }

        for (int counter = 0; counter != Integer.parseInt(MultiplePanels.quartzAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // System.out.println("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            selectedBlock.setBackground(Color.WHITE);
        }

        for (int counter = 0; counter != Integer.parseInt(MultiplePanels.diamondAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // System.out.println("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            selectedBlock.setBackground(Color.BLUE);
        }

        System.out.println("Test" + Arrays.asList(stoneBlock.getActionListeners()));

        // System.out.println("Test" +
        // Arrays.asList(selectedBlock.getActionListeners()));

        genFrame.add(genPanel);
        genPanel.setBackground(new Color(85, 85, 85));
        genFrame.setResizable(false);
        genFrame.pack();
        genFrame.setSize(400, 900);
        genFrame.setLocationRelativeTo(null); // Centers JFrame
        genFrame.setVisible(true);
    }

}
