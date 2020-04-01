package GUI.ColorGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class gui {
    int x;
    int y;
    int z;
    ItemEvent a;
    boolean genIron;
    boolean genGold;
    boolean genLapus;
    boolean genEmerald;
    boolean genQuartz;
    boolean genDiamond;

    int coalAmount;
    int ironAmount;
    int goldAmount;
    int lapusAmount;
    int quartzAmount;
    int diamondAmount;

    gui() {
        JFrame f = new JFrame("Terrain Generator V2");

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        JLabel xLabel = new JLabel("X: ");
        JLabel yLabel = new JLabel("Y: ");
        JLabel zLabel = new JLabel("Z: ");

        JTextField xField = new JTextField("", +15);
        JTextField yField = new JTextField("", +15);
        JTextField zField = new JTextField("", +15);

        JLabel coalLabel = new JLabel("Amount of Coal: ");
        JTextField coalTextField = new JTextField("0", +15);

        JLabel ironLabel = new JLabel("Amount of Iron: ");
        JTextField ironTextField = new JTextField("0", +15);

        JLabel goldLabel = new JLabel("Amount of Gold: ");
        JTextField goldTextField = new JTextField("0", +15);

        JLabel lapusLabel = new JLabel("Amount of Lapus Lazuli: ");
        JTextField lapusTextField = new JTextField("0", +15);

        JLabel emeraldLabel = new JLabel("Amount of Emerald: ");
        JTextField emeraldTextField = new JTextField("0", +15);

        JLabel quartzLabel = new JLabel("Amount of Quarz: ");
        JTextField quartzTextField = new JTextField("0", +15);

        JLabel diamondLabel = new JLabel("Amount of Diamond: ");
        JTextField diamondTextField = new JTextField("0", +15);

        JButton generate = new JButton("Generate");

        // Generate

        JLabel genCoalLabel = new JLabel("How much Coal?");
        JTextField genCoalTextField = new JTextField("0", +15);

        JLabel genIronLabel = new JLabel("How much Iron?");
        JTextField genIronTextField = new JTextField("0", +15);

        JLabel genGoldLabel = new JLabel("How much Gold?");
        JTextField genGoldTextField = new JTextField("0", +15);

        JLabel genLapusLabel = new JLabel("How much Lapus Lazuli?");
        JTextField genLapusTextField = new JTextField("0", +15);

        JLabel genEmeraldLabel = new JLabel("How much Emerald/");
        JTextField genEmeraldTextField = new JTextField("0", +15);

        JLabel genQuartzLabel = new JLabel("How much Quartz?");
        JTextField genQuartzTextField = new JTextField("0", +15);

        JLabel genDiamondLabel = new JLabel("How much Diamond?");
        JTextField genDiamondTextField = new JTextField("0", +15);

        generate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {

                coalAmount = Integer.parseInt(coalTextField.getText());
                ironAmount = Integer.parseInt(ironTextField.getText());

                System.out.println("gui " + coalAmount);
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

        panel.add(genCoalLabel);
        panel.add(genIronLabel);
        panel.add(genGoldLabel);
        panel.add(genLapusLabel);
        panel.add(genEmeraldLabel);
        panel.add(genQuartzLabel);
        panel.add(genDiamondLabel);

        panel.add(genCoalTextField);
        panel.add(genIronTextField);
        panel.add(genGoldTextField);
        panel.add(genLapusTextField);
        panel.add(genEmeraldTextField);
        panel.add(genQuartzTextField);
        panel.add(genDiamondTextField);

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

        layout.putConstraint(SpringLayout.WEST, genCoalLabel, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genCoalLabel, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genCoalTextField, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genCoalTextField, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genIronLabel, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genIronLabel, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genIronTextField, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, genGoldLabel, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genGoldLabel, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genGoldTextField, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genGoldTextField, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genLapusLabel, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genLapusLabel, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genLapusTextField, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genLapusTextField, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genEmeraldLabel, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genEmeraldLabel, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genEmeraldTextField, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genEmeraldTextField, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genQuartzLabel, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genQuartzLabel, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genQuartzTextField, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genQuartzTextField, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genDiamondLabel, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genDiamondLabel, 180, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genDiamondTextField, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genDiamondTextField, 180, SpringLayout.NORTH, panel);

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

    public static void main(String[] args) {
        new gui();
    }
}