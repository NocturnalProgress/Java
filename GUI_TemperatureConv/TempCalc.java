package GUI_TemperatureConv;

import javax.swing.*;
import java.awt.event.*;

public class TempCalc {
    public static int finalTemp;

    public static void main(String[] args) {
        JFrame f = new JFrame("Temperature Converter");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        JLabel enterTemp = new JLabel("Enter in a temperature: ");
        JTextField getTemp = new JTextField("", +15);

        JLabel getConversion = new JLabel("Choose a conversion: ");
        JButton celsi = new JButton("Celsius");
        JButton fahren = new JButton("Fahrenheit");

        JLabel returnTemp = new JLabel("Here's your temperature!");
        JTextField displayTemp = new JTextField("", +15);

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

        // Show everything
        panel.add(getConversion);
        panel.add(celsi);
        panel.add(fahren);
        panel.add(enterTemp);
        panel.add(getTemp);
        panel.add(returnTemp);
        panel.add(displayTemp);

        panel.setSize(300, 300);
        panel.setLayout(layout);

        // Position Everything
        layout.putConstraint(SpringLayout.WEST, enterTemp, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, enterTemp, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, getTemp, 5, SpringLayout.EAST, enterTemp);
        layout.putConstraint(SpringLayout.NORTH, getTemp, 5, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, getConversion, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, getConversion, 50, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, celsi, 5, SpringLayout.EAST, getConversion);
        layout.putConstraint(SpringLayout.NORTH, celsi, 50, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, fahren, 5, SpringLayout.EAST, celsi);
        layout.putConstraint(SpringLayout.NORTH, fahren, 50, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, returnTemp, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, returnTemp, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, displayTemp, 5, SpringLayout.EAST, returnTemp);
        layout.putConstraint(SpringLayout.NORTH, displayTemp, 100, SpringLayout.NORTH, panel);

        f.add(panel);
        f.pack();
        f.setSize(400, 400);
        f.setVisible(true);

    }

}