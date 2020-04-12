package GUI.TerrainGeneratorV1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
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
        TerrainGeneratorV1.displayFeed.setText("Coal: " + TerrainGeneratorV1.coalAmount + "\n" + "Iron: "
                + TerrainGeneratorV1.ironAmount + "\n" + "Gold: " + TerrainGeneratorV1.goldAmount + "\n" + "Lapus: "
                + TerrainGeneratorV1.lapusAmount + "\n" + "Emerald: " + TerrainGeneratorV1.emeraldAmount + "\n"
                + "Quartz: " + TerrainGeneratorV1.quartzAmount + "\n" + "Diamond: " + TerrainGeneratorV1.diamondAmount
                + "\n");

        JFrame genFrame = new JFrame("Generated Terrain");
        JPanel genPanel = new JPanel();
        genPanel.setLayout(new GridLayout(x, y));
        // TerrainGeneratorV1.displayFeed.appendf("coalAmount: ", coalAmount);

        List<JButton> stoneButtonList = new ArrayList<JButton>();
        for (int i = 0; i < 256; i++) {
            stoneBlock = new JButton(("" + (i + 1)));

            genPanel.add(stoneBlock);
            stoneButtonList.add(stoneBlock);
            stoneBlock.setBackground(new Color(170, 170, 170));

            stone = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TerrainGeneratorV1.displayStats.append("Stone");
                }
            };

            stoneBlock.addActionListener(stone);

        }

        // Remove the "Stone" actionListener for blocks that aren't stone
        SecureRandom rand = new SecureRandom();

        for (int counter = 0; counter != Integer.parseInt(TerrainGeneratorV1.coalAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // TerrainGeneratorV1.displayFeed.appendln("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            coal = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TerrainGeneratorV1.displayStats.append("Coal");
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

        for (int counter = 0; counter != Integer.parseInt(TerrainGeneratorV1.ironAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // TerrainGeneratorV1.displayFeed.appendln("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            iron = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TerrainGeneratorV1.displayStats.append("Iron");
                }
            };

            selectedBlock.addActionListener(iron);

            selectedBlock.setBackground(new Color(211, 211, 211));
        }

        for (int counter = 0; counter != Integer.parseInt(TerrainGeneratorV1.goldAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // TerrainGeneratorV1.displayFeed.appendln("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);
            // Change to gold color
            selectedBlock.setBackground(Color.YELLOW);
        }

        for (int counter = 0; counter != Integer.parseInt(TerrainGeneratorV1.lapusAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // TerrainGeneratorV1.displayFeed.appendln("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            selectedBlock.setBackground(Color.BLUE);
        }

        for (int counter = 0; counter != Integer.parseInt(TerrainGeneratorV1.emeraldAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // TerrainGeneratorV1.displayFeed.appendln("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            selectedBlock.setBackground(Color.GREEN);
        }

        for (int counter = 0; counter != Integer.parseInt(TerrainGeneratorV1.quartzAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // TerrainGeneratorV1.displayFeed.appendln("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            selectedBlock.setBackground(Color.WHITE);
        }

        for (int counter = 0; counter != Integer.parseInt(TerrainGeneratorV1.diamondAmount); counter++) {
            int blockSelection = rand.nextInt(256);
            // TerrainGeneratorV1.displayFeed.appendln("Block selection " + blockSelection);

            JButton selectedBlock = stoneButtonList.get(blockSelection);

            selectedBlock.setBackground(Color.BLUE);
        }

        // TerrainGeneratorV1.displayFeed.appendln("Test" +
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