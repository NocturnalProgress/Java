package GUI.TerrainGeneratorV1;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Base64;

public class TerrainGeneratorV1 {
    public static String coalAmount;
    public static String ironAmount;
    public static String goldAmount;
    public static String lapusAmount;
    public static String emeraldAmount;
    public static String quartzAmount;
    public static String diamondAmount;

    public static JTextArea displayFeed;
    public static JTextArea displayStats;

    JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

    public TerrainGeneratorV1() {
        JFrame f = new JFrame("Multiple Panels");
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        panel.setLayout(layout);

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

        displayFeed = new JTextArea(16, 32);
        JScrollPane feedScroll = new JScrollPane(displayFeed, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        displayFeed.setEditable(false);
        displayFeed.setLineWrap(true);
        displayFeed.setWrapStyleWord(true);
        displayFeed.setCaretPosition(displayFeed.getDocument().getLength());

        JTextArea displayStats = new JTextArea(16, 32);
        JScrollPane statsScroll = new JScrollPane(displayStats, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        displayStats.setEditable(false);
        displayStats.setLineWrap(true);
        displayStats.setWrapStyleWord(true);
        displayStats.setCaretPosition(displayStats.getDocument().getLength());

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
                        displayFeed.setText(decodeString);

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
                        String message = displayFeed.getText();
                        String encodeString = encoder.encodeToString(message.getBytes());
                        out.println(encodeString);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        panel.add(genCoalLabel);
        panel.add(genCoalTextField);
        panel.add(genIronLabel);
        panel.add(genIronTextField);
        panel.add(genGoldLabel);
        panel.add(genGoldTextField);
        panel.add(genLapusLabel);
        panel.add(genLapusTextField);
        panel.add(genEmeraldLabel);
        panel.add(genEmeraldTextField);
        panel.add(genQuartzLabel);
        panel.add(genQuartzTextField);
        panel.add(genDiamondLabel);
        panel.add(genDiamondTextField);
        panel.add(generate);

        panel.add(feedScroll);
        panel.add(statsScroll);

        panel.add(load);
        panel.add(save);

        f.add(panel);

        // panel.setSize(1000, 1000);

        // panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Fix constraints

        layout.putConstraint(SpringLayout.WEST, generate, 415, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, generate, 120, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, load, 48, SpringLayout.WEST, generate);
        layout.putConstraint(SpringLayout.NORTH, load, 40, SpringLayout.NORTH, generate);
        layout.putConstraint(SpringLayout.WEST, save, -26, SpringLayout.WEST, generate);
        layout.putConstraint(SpringLayout.NORTH, save, 40, SpringLayout.NORTH, generate);

        layout.putConstraint(SpringLayout.WEST, feedScroll, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, feedScroll, 190, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, statsScroll, 450, SpringLayout.WEST, feedScroll);
        layout.putConstraint(SpringLayout.NORTH, statsScroll, 0, SpringLayout.NORTH, feedScroll);
        layout.putConstraint(SpringLayout.WEST, genCoalLabel, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genCoalLabel, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genCoalTextField, -35, SpringLayout.WEST, genCoalLabel);
        layout.putConstraint(SpringLayout.NORTH, genCoalTextField, 20, SpringLayout.NORTH, genCoalLabel);
        layout.putConstraint(SpringLayout.WEST, genIronLabel, 175, SpringLayout.WEST, genCoalLabel);
        layout.putConstraint(SpringLayout.NORTH, genIronLabel, 0, SpringLayout.NORTH, genCoalLabel);
        layout.putConstraint(SpringLayout.WEST, genIronTextField, -35, SpringLayout.WEST, genIronLabel);
        layout.putConstraint(SpringLayout.NORTH, genIronTextField, 20, SpringLayout.NORTH, genIronLabel);
        layout.putConstraint(SpringLayout.WEST, genGoldLabel, 175, SpringLayout.WEST, genIronLabel);
        layout.putConstraint(SpringLayout.NORTH, genGoldLabel, 0, SpringLayout.NORTH, genIronLabel);
        layout.putConstraint(SpringLayout.WEST, genGoldTextField, -35, SpringLayout.WEST, genGoldLabel);
        layout.putConstraint(SpringLayout.NORTH, genGoldTextField, 20, SpringLayout.NORTH, genGoldLabel);
        layout.putConstraint(SpringLayout.WEST, genLapusLabel, 175, SpringLayout.WEST, genGoldLabel);
        layout.putConstraint(SpringLayout.NORTH, genLapusLabel, 0, SpringLayout.NORTH, genGoldLabel);
        layout.putConstraint(SpringLayout.WEST, genLapusTextField, -35, SpringLayout.WEST, genLapusLabel);
        layout.putConstraint(SpringLayout.NORTH, genLapusTextField, 20, SpringLayout.NORTH, genLapusLabel);

        layout.putConstraint(SpringLayout.WEST, genEmeraldLabel, 250, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genEmeraldLabel, 60, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genEmeraldTextField, -30, SpringLayout.WEST, genEmeraldLabel);
        layout.putConstraint(SpringLayout.NORTH, genEmeraldTextField, 20, SpringLayout.NORTH, genEmeraldLabel);
        layout.putConstraint(SpringLayout.WEST, genQuartzLabel, 175, SpringLayout.WEST, genEmeraldLabel);
        layout.putConstraint(SpringLayout.NORTH, genQuartzLabel, 0, SpringLayout.NORTH, genEmeraldLabel);
        layout.putConstraint(SpringLayout.WEST, genQuartzTextField, -30, SpringLayout.WEST, genQuartzLabel);
        layout.putConstraint(SpringLayout.NORTH, genQuartzTextField, 20, SpringLayout.NORTH, genQuartzLabel);
        layout.putConstraint(SpringLayout.WEST, genDiamondLabel, 175, SpringLayout.WEST, genQuartzLabel);
        layout.putConstraint(SpringLayout.NORTH, genDiamondLabel, 0, SpringLayout.NORTH, genQuartzLabel);
        layout.putConstraint(SpringLayout.WEST, genDiamondTextField, -30, SpringLayout.WEST, genDiamondLabel);
        layout.putConstraint(SpringLayout.NORTH, genDiamondTextField, 20, SpringLayout.NORTH, genDiamondLabel);

        f.setResizable(false);
        f.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        f.setSize(width / 2, height / 2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new TerrainGeneratorV1();
    }
}
