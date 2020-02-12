package GUI_DogOBJ;

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.awt.Color;
import java.awt.event.*;

class CreateDoggo {
    static SimpleDateFormat formatter = new SimpleDateFormat("[dd/MM/yyyy HH:mm:ss]");
    static Date date = new Date();

    public static void main(String[] args) {
        JFrame f = new JFrame("Doggo Creator");
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        JLabel enterDoggos = new JLabel("You walk into a dog park and you see a dog..");

        JTextArea display = new JTextArea("", 10, 20);
        display.setEditable(false);

        JButton genDoggos = new JButton("Inspect Doggo");

        genDoggos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                Dog newDog = new Dog("");
                String dogName = newDog.name;
                String dogGender = newDog.Gender();
                String dogStand = newDog.isSitting();
                String dogSpeak = newDog.Speak();
                String dogCoatColor = newDog.coatColor();
                String dogCollarColor = newDog.collarColor();

                display.setText("This doggo's name is: " + dogName + "\n" + dogName + " is a " + dogGender + "\n"
                        + "Right now " + dogName + " is " + dogStand + "\n" + dogName + " says: " + dogSpeak + "\n"
                        + dogName + "'s fur color is: " + dogCoatColor + "\n" + dogName + "'s collar color is: "
                        + dogCollarColor + "\n");

                try (FileWriter fileWrite = new FileWriter(
                        "C:/Users/noctu/OneDrive/VS Code/Java/GUI_DogOBJ/CreateDoggoLog.txt", true);
                        BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
                        PrintWriter out = new PrintWriter(bufferWrite)) {
                    out.println(formatter.format(date) + " This doggo's name is: " + dogName + "\n" + dogName + " is a "
                            + dogGender + "\n" + "Right now " + dogName + " is " + dogStand + "\n" + dogName + " says: "
                            + dogSpeak + "\n" + dogName + "'s fur color is: " + dogCoatColor + "\n" + dogName
                            + "'s collar color is: " + dogCollarColor + "\n");
                } catch (IOException e) {
                    display.append("Save unsucessful! \n");
                }
            }

        });

        panel.add(display);
        panel.add(enterDoggos);
        panel.add(genDoggos);

        panel.setSize(300, 300);
        panel.setLayout(layout);

        layout.putConstraint(SpringLayout.WEST, enterDoggos, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, enterDoggos, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, genDoggos, 70, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, genDoggos, 50, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, display, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, display, 100, SpringLayout.NORTH, panel);

        enterDoggos.setForeground(new Color(191, 198, 204));
        display.setForeground(new Color(191, 198, 204));

        panel.setBackground(new Color(25, 30, 36));
        display.setBackground(new Color(32, 39, 49));

        f.pack();
        f.setSize(280, 325);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.add(panel);
        f.setVisible(true);

    }

}