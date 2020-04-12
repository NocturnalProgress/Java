package GUI.TextEditor;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;

class TextEditor {
    static String encodeString;

    public static void main(String[] args) {
        JFrame f = new JFrame("Text Editor");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(new Color(191, 198, 204), new Color(191, 198, 204)),
                "Editing Time!"));

        SpringLayout layout = new SpringLayout();

        JButton saveData = new JButton("Save");

        JButton loadData = new JButton("Load");

        JTextArea display = new JTextArea(16, 48);
        JScrollPane scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        display.setEditable(true);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setCaretPosition(display.getDocument().getLength());

        saveData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try (FileWriter fileWrite = new FileWriter(
                        "C:/Users/noctu/OneDrive/VS Code/Java/GUI/TextEditor/File.txt", false);
                        BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
                        PrintWriter out = new PrintWriter(bufferWrite)) {
                    out.println(display.getText());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        loadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

                String fi = "C:/Users/noctu/OneDrive/VS Code/Java/GUI/TextEditor/File.txt";
                try {
                    String s1 = "", sl = "";
                    FileReader fr = new FileReader(fi);
                    BufferedReader br = new BufferedReader(fr);
                    sl = br.readLine();

                    while ((s1 = br.readLine()) != null) {

                        sl = sl + "\n" + s1;

                    }
                    br.close();
                    System.out.println(s1);

                    // Set the text
                    display.setText(sl);
                } catch (Exception evt) {
                    JOptionPane.showMessageDialog(f, evt.getMessage());
                }
            }
        });

        panel.add(scroll);
        panel.add(saveData);
        panel.add(loadData);
        f.add(panel);

        panel.setBackground(new Color(25, 30, 36));
        display.setBackground(new Color(32, 39, 49));

        panel.setForeground(new Color(191, 198, 204));
        display.setForeground(new Color(191, 198, 204));

        layout.putConstraint(SpringLayout.WEST, saveData, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, saveData, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, loadData, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, loadData, 8, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, display, 40, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, display, 100, SpringLayout.NORTH, panel);

        f.setResizable(true);
        f.pack();
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.getContentPane().setBackground(Color.BLACK);
        f.setVisible(true);

    }
}