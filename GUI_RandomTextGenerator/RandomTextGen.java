package GUI_RandomTextGenerator;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class RandomTextGen {
    public static int counter; // Allow variable to be used inside randText.addActionListener without reseting
                               // the counter to 0 each time the button is pressed

    public static void main(String[] args) {

        JFrame f = new JFrame("Random Text Generator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        JButton randText = new JButton("Random Name Generator");
        JTextField displayRandText = new JTextField("", +16);
        displayRandText.setHorizontalAlignment(JTextField.CENTER); // Center text

        JButton NSFWrandText = new JButton("NSFW Random Name Generator");
        JTextField displayNSFWRandText = new JTextField("", +16);
        displayNSFWRandText.setHorizontalAlignment(JTextField.CENTER); // Center text

        randText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                counter = counter + 1;
                if (counter == 20) {
                    panel.add(NSFWrandText);
                    panel.add(displayNSFWRandText);
                    panel.revalidate();
                }

                List<String> list = Arrays.asList("Daraxus", "Chromblip", "Zarth", "Crebis", "Farlip", "Thorndip",
                        "Prenus", "Grublim", "Dinglegorf", "Sarcobious", "Blumpid", "DingleSchwartz", "Arcondus",
                        "Harblund", "Gruthden", "Crablus", "Skonk", "Stublen", "Draglop", "Goit-Tru");

                Random randInt = new Random();
                int randomitem = randInt.nextInt(list.size());
                String randomElement = list.get(randomitem);
                displayRandText.setText(randomElement);

            }
        });

        NSFWrandText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                List<String> list = Arrays.asList("Haywood Jablomi", "Mike Oxlong", "Strockinoff", "Gabe Itch",
                        "Tess Tickles", "Holden Tudiks", "Ben Dover", "Anita Cock", "Mike Hawk", "Jenny Tulls",
                        "Craven Morehead", "Dixie Nourmous", "Mike Litorus", "Barry Mckockiner", "Jack MeHoff",
                        "Benjamin Dover");

                Random randInt = new Random();
                int randomitem = randInt.nextInt(list.size());
                String randomElement = list.get(randomitem);
                displayNSFWRandText.setText(randomElement);
            }
        });

        // Show Stuff
        panel.add(randText);
        panel.add(displayRandText);

        panel.setSize(300, 300);
        panel.setLayout(layout);

        // Position Everything
        layout.putConstraint(SpringLayout.WEST, randText, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, randText, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, displayRandText, -178, SpringLayout.EAST, randText);
        layout.putConstraint(SpringLayout.NORTH, displayRandText, 50, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, NSFWrandText, 85, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, NSFWrandText, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, displayNSFWRandText, -200, SpringLayout.EAST, NSFWrandText);
        layout.putConstraint(SpringLayout.NORTH, displayNSFWRandText, 150, SpringLayout.NORTH, panel);

        f.add(panel);
        f.pack();
        f.setSize(400, 300);
        f.setVisible(true);

    }

}