package GUI.TerrainGeneratorv2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class gui {
    static Scanner scan = new Scanner(System.in);
    static int x;
    static int y;
    static int z;
    static ItemEvent a;
    static boolean genCoal;
    static boolean genIron;
    static boolean genGold;
    static boolean genLapus;
    static boolean genEmerald;
    static boolean genQuartz;
    static boolean genDiamond;

    static int coalAmount;
    static int ironAmount;
    static int goldAmount;
    static int lapusAmount;
    static int quartzAmount;
    static int diamondAmount;

    // Finish ItemListeners
    public static void main(String[] args) {
        JFrame f = new JFrame("Terrain Generator V2");

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        JCheckBox c1 = new JCheckBox("Coal", false);
        JCheckBox c2 = new JCheckBox("Iron", false);
        JCheckBox c3 = new JCheckBox("Gold", false);
        JCheckBox c4 = new JCheckBox("Lapus Lazuli", false);
        JCheckBox c5 = new JCheckBox("Emerald", false);
        JCheckBox c6 = new JCheckBox("Quartz", false);
        JCheckBox c7 = new JCheckBox("Diamond", false);

        JLabel xLabel = new JLabel("X: ");
        JLabel yLabel = new JLabel("Y: ");
        JLabel zLabel = new JLabel("Z: ");

        JTextField xField = new JTextField("", +15);
        JTextField yField = new JTextField("", +15);
        JTextField zField = new JTextField("", +15);

        JLabel coalLabel = new JLabel("Amount of Coal: ");
        JTextField coalTextField = new JTextField("", +15);

        JLabel ironLabel = new JLabel("Amount of Iron: ");
        JTextField ironTextField = new JTextField("", +15);

        JLabel goldLabel = new JLabel("Amount of Gold: ");
        JTextField goldTextField = new JTextField("", +15);

        JLabel lapusLabel = new JLabel("Amount of Lapus Lazuli: ");
        JTextField lapusTextField = new JTextField("", +15);

        JLabel emeraldLabel = new JLabel("Amount of Emerald: ");
        JTextField emeraldTextField = new JTextField("", +15);

        JLabel quartzLabel = new JLabel("Amount of Quarz: ");
        JTextField quartzTextField = new JTextField("", +15);

        JLabel diamondLabel = new JLabel("Amount of Diamond: ");
        JTextField diamondTextField = new JTextField("", +15);

        JButton generate = new JButton("Generate");

        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent a) {
                if (a.getStateChange() == 1) {
                    genCoal = true;
                } else {
                    genCoal = false;
                }
            }
        });

        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent b) {
                if (b.getStateChange() == 1) {
                    genIron = true;
                } else {
                    genIron = false;
                }
            }
        });

        c3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent c) {
                if (c.getStateChange() == 1) {
                    genGold = true;
                } else {
                    genGold = false;
                }
            }
        });

        c4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent d) {
                if (d.getStateChange() == 1) {
                    genLapus = true;
                } else {
                    genLapus = false;
                }
            }
        });

        c5.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                    genEmerald = true;
                } else {
                    genEmerald = false;
                }
            }
        });

        c6.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent f) {
                if (f.getStateChange() == 1) {
                    genQuartz = true;
                } else {
                    genQuartz = false;
                }
            }
        });

        c7.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent g) {
                if (g.getStateChange() == 1) {
                    genDiamond = true;
                } else {
                    genDiamond = false;
                }
            }
        });

        generate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                new GenerateTerrain();
                coalAmount = Integer.parseInt(coalTextField.getText());

                x = Integer.parseInt(xField.getText());
                y = Integer.parseInt(yField.getText());
                z = Integer.parseInt(zField.getText());
                Terrainv2 zero = new Terrainv2(x, y, z, genCoal, genIron, genGold, genLapus, genEmerald, genQuartz,
                        genDiamond);
                zero.returnDimens();
                zero.genOre();
            }
        });

        /*
         * scan = new Scanner(System.in);
         * System.out.println("Enter in your X variable."); int one = scan.nextInt();
         * 
         * scan = new Scanner(System.in);
         * System.out.println("Enter in your Y variable"); int two = scan.nextInt();
         * 
         * scan = new Scanner(System.in);
         * System.out.println("Enter in your Z variable"); int three = scan.nextInt();
         * 
         * Terrainv2 zero = new Terrainv2(one, two, three); zero.returnDimens();
         */

        panel.add(xLabel);
        panel.add(yLabel);
        panel.add(zLabel);

        panel.add(xField);
        panel.add(yField);
        panel.add(zField);

        panel.add(coalLabel);
        panel.add(ironLabel);
        panel.add(goldLabel);
        panel.add(lapusLabel);
        panel.add(emeraldLabel);
        panel.add(quartzLabel);
        panel.add(diamondLabel);

        panel.add(coalTextField);
        panel.add(ironTextField);
        panel.add(goldTextField);
        panel.add(lapusTextField);
        panel.add(emeraldTextField);
        panel.add(quartzTextField);
        panel.add(diamondTextField);

        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(c5);
        panel.add(c6);
        panel.add(c7);
        panel.add(generate);

        f.add(panel);

        layout.putConstraint(SpringLayout.WEST, coalLabel, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, coalLabel, 140, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, coalTextField, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, coalTextField, 140, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, ironLabel, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, ironLabel, 140, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, ironTextField, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, ironTextField, 140, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, goldLabel, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, goldLabel, 140, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, goldTextField, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, goldTextField, 140, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, lapusLabel, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lapusLabel, 140, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, lapusTextField, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lapusTextField, 140, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, emeraldLabel, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, emeraldLabel, 140, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, emeraldTextField, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, emeraldTextField, 140, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, quartzLabel, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, quartzLabel, 140, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, quartzTextField, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, quartzTextField, 140, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, diamondLabel, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, diamondLabel, 140, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, diamondTextField, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, diamondTextField, 140, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, c1, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c1, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, c2, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c2, 20, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, c3, 40, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c3, 40, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, c4, 60, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c4, 60, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, c5, 80, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c5, 80, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, c6, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c6, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, c7, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c7, 120, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, c7, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c7, 140, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, c7, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, c7, 140, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, xField, 200, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, xField, 200, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, yField, 220, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, yField, 220, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, zField, 240, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, zField, 240, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, xLabel, 210, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, xLabel, 200, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, yLabel, 230, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, yLabel, 220, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, zLabel, 250, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, zLabel, 240, SpringLayout.NORTH, panel);

        f.setResizable(false);
        f.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        f.setSize(width / 2, height / 2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.setVisible(true);
    }

}