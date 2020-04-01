package GUI.MultiplePanels;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Base64;

public class MultiplePanels {
    public static String coalAmount;
    public static String ironAmount;
    public static String goldAmount;
    public static String lapusAmount;
    public static String emeraldAmount;
    public static String quartzAmount;
    public static String diamondAmount;

    public static JTextArea display;

    JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

    public MultiplePanels() {
        JFrame f = new JFrame("Multiple Panels");
        JPanel panel = new JPanel();
        JPanel genTerrain = new JPanel();
        JPanel showTerrain = new JPanel();
        JPanel displayFeed = new JPanel();
        JPanel statsPanel = new JPanel();

        SpringLayout layout = new SpringLayout();

        JLabel genCoalLabel = new JLabel("How much Coal?");
        JTextField genCoalTextField = new JTextField("0", +15);

        JLabel genIronLabel = new JLabel("How much Iron?");
        JTextField genIronTextField = new JTextField("0", +15);

        JLabel genGoldLabel = new JLabel("How much Gold?");
        JTextField genGoldTextField = new JTextField("0", +15);

        JLabel genLapusLabel = new JLabel("How much Lapus Lazuli?");
        JTextField genLapusTextField = new JTextField("0", +15);

        JLabel genEmeraldLabel = new JLabel("How much Emerald?");
        JTextField genEmeraldTextField = new JTextField("0", +15);

        JLabel genQuartzLabel = new JLabel("How much Quartz?");
        JTextField genQuartzTextField = new JTextField("0", +15);

        JLabel genDiamondLabel = new JLabel("How much Diamond?");
        JTextField genDiamondTextField = new JTextField("0", +15);

        JButton generate = new JButton("Generate");

        generate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                coalAmount = genCoalTextField.getText();
                ironAmount = genIronTextField.getText();
                goldAmount = genGoldTextField.getText();
                lapusAmount = genLapusTextField.getText();
                emeraldAmount = genEmeraldTextField.getText();
                quartzAmount = genQuartzTextField.getText();
                diamondAmount = genDiamondTextField.getText();
                new Generate();
            }
        });

        // displayFeed

        JLabel feedLabel = new JLabel("Feed Display");
        display = new JTextArea(16, 48);
        JScrollPane feedScroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        display.setEditable(false);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setCaretPosition(display.getDocument().getLength());

        JTextArea displayStats = new JTextArea(16, 48);
        JScrollPane statsScroll = new JScrollPane(displayStats, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        displayStats.setEditable(false);
        displayStats.setLineWrap(true);
        displayStats.setWrapStyleWord(true);
        displayStats.setCaretPosition(display.getDocument().getLength());

        JButton load = new JButton("Load");

        load.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                fileChooser.setDialogTitle("Load A File");
                int returnValue = fileChooser.showDialog(null, "Load");
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        String s1 = "", sl = "";
                        FileReader fr = new FileReader(fileChooser.getSelectedFile());
                        BufferedReader br = new BufferedReader(fr);
                        sl = br.readLine();

                        while ((s1 = br.readLine()) != null) {
                            sl = sl + "\n" + s1;
                        }

                        br.close();
                        Base64.Decoder decoder = Base64.getMimeDecoder();
                        String decodeString = new String(decoder.decode(sl));
                        display.setText(decodeString);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        JButton save = new JButton("Save");

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c) {
                fileChooser.setDialogTitle("Save A File");
                int returnValue = fileChooser.showDialog(null, "Save");
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try (FileWriter fileWrite = new FileWriter(
                            "C:/Users/noctu/OneDrive/VS Code/Java/GUI/MultiplePanels/MultiplePanelsSave.txt", false);
                            BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
                            PrintWriter out = new PrintWriter(bufferWrite)) {
                        Base64.Encoder encoder = Base64.getMimeEncoder();
                        String message = display.getText();
                        String encodeString = encoder.encodeToString(message.getBytes());
                        out.println(encodeString);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        genTerrain.add(genCoalLabel);
        genTerrain.add(genCoalTextField);
        genTerrain.add(genIronLabel);
        genTerrain.add(genIronTextField);
        genTerrain.add(genGoldLabel);
        genTerrain.add(genGoldTextField);
        genTerrain.add(genLapusLabel);
        genTerrain.add(genLapusTextField);
        genTerrain.add(genEmeraldLabel);
        genTerrain.add(genEmeraldTextField);
        genTerrain.add(genQuartzLabel);
        genTerrain.add(genQuartzTextField);
        genTerrain.add(genDiamondLabel);
        genTerrain.add(genDiamondTextField);
        genTerrain.add(generate);

        statsPanel.add(statsScroll);

        panel.add(load);
        panel.add(save);

        displayFeed.add(feedScroll);
        displayFeed.add(feedLabel);
        // displayFeed.setSize(400, 400);

        genTerrain.setSize(400, 400);
        // panel.setSize(400, 400);

        panel.add(genTerrain);
        panel.add(showTerrain);
        panel.add(displayFeed);
        panel.add(statsPanel);

        f.add(panel);

        // panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Fix constraints

        layout.putConstraint(SpringLayout.WEST, genTerrain, 40, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genTerrain, 100, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, showTerrain, 40, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, showTerrain, 100, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, displayFeed, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, displayFeed, 100, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, statsPanel, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, statsPanel, 200, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, genCoalLabel, 0, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genCoalLabel, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genCoalTextField, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genCoalTextField, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genIronLabel, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genIronLabel, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genIronTextField, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genIronTextField, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genGoldLabel, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genGoldLabel, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genGoldTextField, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genGoldTextField, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genLapusLabel, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genLapusLabel, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genLapusTextField, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genLapusTextField, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genEmeraldLabel, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genEmeraldLabel, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genEmeraldTextField, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genEmeraldTextField, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genQuartzLabel, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genQuartzLabel, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genQuartzTextField, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genQuartzTextField, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genDiamondLabel, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genDiamondLabel, 180, SpringLayout.NORTH, genTerrain);
        layout.putConstraint(SpringLayout.WEST, genDiamondTextField, 160, SpringLayout.WEST, genTerrain);
        layout.putConstraint(SpringLayout.NORTH, genDiamondTextField, 180, SpringLayout.NORTH, genTerrain);

        layout.putConstraint(SpringLayout.WEST, display, 40, SpringLayout.WEST, displayFeed);
        layout.putConstraint(SpringLayout.NORTH, display, 100, SpringLayout.NORTH, displayFeed);

        f.setResizable(false);
        f.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        f.setSize(width, height);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new MultiplePanels();
    }
};
