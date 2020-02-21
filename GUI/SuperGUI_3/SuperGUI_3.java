package GUI.SuperGUI_3;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

class SuperGUI_3 {
    public static int finalTemp;
    public static int counter;

    public static void main(String[] args) {
        JFrame f = new JFrame("SuperGUI 3");
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
        tabbedPane.setBounds(50, 50, 200, 200);
        tabbedPane.setTabPlacement(JTabbedPane.TOP);
        SpringLayout layout = new SpringLayout();

        JPanel tempPanel = new JPanel();
        JPanel percentPanel = new JPanel();
        JPanel randPanel = new JPanel();
        JPanel doggoPanel = new JPanel();

        JLabel tempConverterLabel = new JLabel("Welcome to the Temperature Converter!");

        JLabel enterTemp = new JLabel("Enter in a temperature: ");
        JTextField getTemp = new JTextField("", +15);
        JLabel getConversion = new JLabel("Choose a conversion: ");
        JButton celsi = new JButton("Celsius");
        JButton fahren = new JButton("Fahrenheit");
        JLabel returnTemp = new JLabel("Here's your temperature!");
        JTextField displayTemp = new JTextField("", +15);

        // Temperature Converter
        celsi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                int temp = Integer.parseInt(getTemp.getText());
                finalTemp = (temp - 32) * 5 / 9;
                String finaltemp = Integer.toString(finalTemp);
                displayTemp.setText(finaltemp);

            }
        });

        fahren.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                int temp = Integer.parseInt(getTemp.getText());
                finalTemp = (temp * 9 / 5) + 32;
                String finaltemp = Integer.toString(finalTemp);
                displayTemp.setText(finaltemp);

            }
        });

        // Percent Calculator
        JLabel percentCalcLabel = new JLabel("Welcome to the Percent Calculator!");
        JLabel enterNumer = new JLabel("Enter in your numerator: ");
        JTextField getNumer = new JTextField("", +15);
        JLabel enterDenom = new JLabel("Enter in your denominator: ");
        JTextField getDenom = new JTextField("", +15);
        JButton convert = new JButton("Convert to Percent");
        JLabel returnFract = new JLabel("Here's your percentage!");
        JTextField displayFract = new JTextField("", +15);

        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                float numer = Integer.parseInt(getNumer.getText());
                float denom = Integer.parseInt(getDenom.getText());
                float percent = (numer / denom) * 100;
                String finalPercent = String.valueOf(percent) + "%";
                displayFract.setText(finalPercent);

            }
        });

        // Random Name Generator
        JLabel randTextLabel = new JLabel("Welcome to the Random Name Generator!");
        JButton randText = new JButton("Random Name Generator");
        JTextField displayRandText = new JTextField("", +16);
        displayRandText.setHorizontalAlignment(JTextField.CENTER); // Center text
        displayRandText.setEditable(false);

        JButton NSFWrandText = new JButton("NSFW Random Name Generator");
        JTextField displayNSFWRandText = new JTextField("", +16);
        displayNSFWRandText.setHorizontalAlignment(JTextField.CENTER); // Center text
        displayNSFWRandText.setEditable(false);

        randText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                counter = counter + 1;
                if (counter == 50) {
                    tabbedPane.add(NSFWrandText);
                    tabbedPane.add(displayNSFWRandText);
                    tabbedPane.revalidate();
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

        // Create Doggo
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
                        + dogCollarColor);

            }
        });

        // Temperature Converter
        tempPanel.add(tempConverterLabel);
        tempPanel.add(enterTemp);
        tempPanel.add(getTemp);
        tempPanel.add(getConversion);
        tempPanel.add(celsi);
        tempPanel.add(fahren);
        tempPanel.add(returnTemp);
        tempPanel.add(displayTemp);

        // Percent Calculator
        percentPanel.add(percentCalcLabel);
        percentPanel.add(enterNumer);
        percentPanel.add(getNumer);
        percentPanel.add(enterDenom);
        percentPanel.add(getDenom);
        percentPanel.add(convert);
        percentPanel.add(returnFract);
        percentPanel.add(displayFract);

        // Random Name Generator
        randPanel.add(randTextLabel);
        randPanel.add(randText);
        randPanel.add(displayRandText);

        // Create Doggo
        doggoPanel.add(enterDoggos);
        doggoPanel.add(display);
        doggoPanel.add(genDoggos);

        tabbedPane.add("Temp Converter", tempPanel);
        tabbedPane.add("Percent Calculator", percentPanel);
        tabbedPane.add("Random Name Generator", randPanel);
        tabbedPane.add("Doggo Creator", doggoPanel);

        layout.putConstraint(SpringLayout.WEST, tempConverterLabel, 5, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, tempConverterLabel, 5, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, enterTemp, -225, SpringLayout.EAST, tempConverterLabel);
        layout.putConstraint(SpringLayout.NORTH, enterTemp, 55, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, getTemp, 5, SpringLayout.EAST, enterTemp);
        layout.putConstraint(SpringLayout.NORTH, getTemp, 55, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, getConversion, 5, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, getConversion, 110, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, celsi, 5, SpringLayout.EAST, getConversion);
        layout.putConstraint(SpringLayout.NORTH, celsi, 110, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, fahren, 5, SpringLayout.EAST, celsi);
        layout.putConstraint(SpringLayout.NORTH, fahren, 110, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, returnTemp, 5, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, returnTemp, 180, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, displayTemp, 5, SpringLayout.EAST, returnTemp);
        layout.putConstraint(SpringLayout.NORTH, displayTemp, 180, SpringLayout.NORTH, tabbedPane);

        // Percent Calculator
        layout.putConstraint(SpringLayout.WEST, percentCalcLabel, 400, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, percentCalcLabel, 5, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, enterNumer, 400, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, enterNumer, 40, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, getNumer, 5, SpringLayout.EAST, enterNumer);
        layout.putConstraint(SpringLayout.NORTH, getNumer, 40, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, enterDenom, 400, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, enterDenom, 90, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, getDenom, 5, SpringLayout.EAST, enterDenom);
        layout.putConstraint(SpringLayout.NORTH, getDenom, 90, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, convert, 430, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, convert, 130, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, returnFract, 400, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, returnFract, 180, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, displayFract, 10, SpringLayout.EAST, returnFract);
        layout.putConstraint(SpringLayout.NORTH, displayFract, 180, SpringLayout.NORTH, tabbedPane);

        // Random Name Generator
        layout.putConstraint(SpringLayout.WEST, randTextLabel, 5, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, randTextLabel, 275, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, randText, 5, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, randText, 305, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, displayRandText, -178, SpringLayout.EAST, randText);
        layout.putConstraint(SpringLayout.NORTH, displayRandText, 350, SpringLayout.NORTH, tabbedPane);

        layout.putConstraint(SpringLayout.WEST, NSFWrandText, 5, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, NSFWrandText, 390, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, displayNSFWRandText, -215, SpringLayout.EAST, NSFWrandText);
        layout.putConstraint(SpringLayout.NORTH, displayNSFWRandText, 435, SpringLayout.NORTH, tabbedPane);

        // Create Doggos
        layout.putConstraint(SpringLayout.WEST, enterDoggos, 400, SpringLayout.WEST, tabbedPane);
        layout.putConstraint(SpringLayout.NORTH, enterDoggos, 275, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, genDoggos, 280, SpringLayout.WEST, enterDoggos);
        layout.putConstraint(SpringLayout.NORTH, genDoggos, 270, SpringLayout.NORTH, tabbedPane);
        layout.putConstraint(SpringLayout.WEST, display, 5, SpringLayout.WEST, enterDoggos);
        layout.putConstraint(SpringLayout.NORTH, display, 310, SpringLayout.NORTH, tabbedPane);

        percentCalcLabel.setForeground(new Color(191, 198, 204));
        enterNumer.setForeground(new Color(191, 198, 204));
        getNumer.setBackground(new Color(32, 39, 49));
        enterDenom.setForeground(new Color(191, 198, 204));
        getDenom.setBackground(new Color(32, 39, 49));
        returnFract.setForeground(new Color(191, 198, 204));
        displayFract.setBackground(new Color(32, 39, 49));
        percentCalcLabel.setForeground(new Color(191, 198, 204));
        enterNumer.setForeground(new Color(191, 198, 204));
        getNumer.setForeground(new Color(191, 198, 204));
        enterDenom.setForeground(new Color(191, 198, 204));
        getDenom.setForeground(new Color(191, 198, 204));
        returnFract.setForeground(new Color(191, 198, 204));
        displayFract.setForeground(new Color(191, 198, 204));
        display.setBackground(new Color(32, 39, 49));
        randTextLabel.setForeground(new Color(191, 198, 204));
        displayRandText.setForeground(new Color(191, 198, 204));
        displayRandText.setBackground(new Color(32, 39, 49));
        displayNSFWRandText.setForeground(new Color(191, 198, 204));
        displayNSFWRandText.setBackground(new Color(32, 39, 49));
        tempConverterLabel.setForeground(new Color(191, 198, 204));
        enterTemp.setForeground(new Color(191, 198, 204));
        getTemp.setBackground(new Color(32, 39, 49));
        getConversion.setForeground(new Color(191, 198, 204));
        returnTemp.setBackground(new Color(32, 39, 49));
        displayTemp.setBackground(new Color(32, 39, 49));
        enterTemp.setForeground(new Color(191, 198, 204));
        getTemp.setForeground(new Color(191, 198, 204));
        getConversion.setForeground(new Color(191, 198, 204));
        returnTemp.setForeground(new Color(191, 198, 204));
        displayTemp.setForeground(new Color(191, 198, 204));
        enterDoggos.setForeground(new Color(191, 198, 204));
        display.setForeground(new Color(191, 198, 204));

        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
            tabbedPane.setBackgroundAt(i, (new Color(25, 30, 36)));
            tabbedPane.setForegroundAt(i, (new Color(191, 198, 204)));
            tabbedPane.getComponentAt(i).setBackground((new Color(25, 30, 36)));
        }

        tabbedPane.setBackground(new Color(32, 39, 49));
        tabbedPane.setForeground(new Color(32, 39, 49));
        f.setBackground((new Color(25, 30, 36)));
        f.setForeground((new Color(25, 30, 36)));

        f.setResizable(false);
        f.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        f.setSize(width / 2, height / 2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame
        f.add(tabbedPane);
        f.setVisible(true);
    }
}