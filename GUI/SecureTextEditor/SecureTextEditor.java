package GUI.SecureTextEditor;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import java.util.*;

class SecureTextEditor {
    static String encodeString;
    static String decodeString;

    public static void main(String[] args) {
        JFrame f = new JFrame("Secure Text Editor");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(new Color(191, 198, 204), new Color(191, 198, 204)),
                "Secure Editing Time!"));

        SpringLayout layout = new SpringLayout();

        JButton secureSaveData = new JButton("Secure Save");

        JButton secureLoadData = new JButton("Secure Load");

        JTextArea display = new JTextArea(16, 48);
        JScrollPane scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        display.setEditable(true);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setCaretPosition(display.getDocument().getLength());

        secureSaveData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

                try (FileWriter fileWrite = new FileWriter(
                        "C:/Users/noctu/OneDrive/VS Code/Java/GUI/SecureTextEditor/File.txt", false);
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
        });

        secureLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

                String fi = "C:/Users/noctu/OneDrive/VS Code/Java/GUI/SecureTextEditor/File.txt";
                try {
                    String s1 = "", sl = "";
                    FileReader fr = new FileReader(fi);
                    BufferedReader br = new BufferedReader(fr);
                    sl = br.readLine();

                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }
                    br.close();

                    Base64.Decoder decoder = Base64.getMimeDecoder();
                    String decodeString = new String(decoder.decode(sl));

                    // Set the text
                    display.setText(decodeString);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        panel.add(scroll);
        panel.add(secureSaveData);
        panel.add(secureLoadData);
        f.add(panel);

        panel.setBackground(new Color(25, 30, 36));
        display.setBackground(new Color(32, 39, 49));

        panel.setForeground(new Color(191, 198, 204));
        display.setForeground(new Color(191, 198, 204));

        layout.putConstraint(SpringLayout.WEST, secureSaveData, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, secureLoadData, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, secureSaveData, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, secureLoadData, 8, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, display, 40, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, display, 100, SpringLayout.NORTH, panel);

        f.setResizable(false);
        f.pack();
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.getContentPane().setBackground(Color.BLACK);
        f.add(panel);
        f.setVisible(true);

    }
}