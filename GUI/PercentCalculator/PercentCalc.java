package GUI.PercentCalculator;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

//Just need to position everything 
public class PercentCalc {
    public static int finalTemp;

    public static void main(String[] args) {
        JFrame f = new JFrame("Percent Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Centers JFrame

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        JLabel enterNumer = new JLabel("Enter in your numerator: ");
        JTextField getNumer = new JTextField("", +15);

        JLabel enterDenom = new JLabel("Enter in your denominator: ");
        JTextField getDenom = new JTextField("", +15);

        JButton convert = new JButton("Convert to Percent");

        JLabel returnFract = new JLabel("Here's your percentage!");
        JTextField displayFract = new JTextField("", +15);

        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                float numer = Integer.parseInt(getNumer.getText());
                float denom = Integer.parseInt(getDenom.getText());
                float percent = (numer / denom) * 100;
                String finalPercent = String.valueOf(percent) + " Percent";
                displayFract.setText(finalPercent);

            }
        });

        // Show everything
        panel.add(enterNumer);
        panel.add(getNumer);
        panel.add(enterDenom);
        panel.add(getDenom);
        panel.add(convert);
        panel.add(returnFract);
        panel.add(displayFract);

        panel.setSize(300, 300);
        panel.setLayout(layout);

        enterNumer.setBackground(new Color(191, 198, 204));
        getNumer.setBackground(new Color(32, 39, 49));
        enterDenom.setBackground(new Color(191, 198, 204));
        getDenom.setBackground(new Color(32, 39, 49));
        returnFract.setBackground(new Color(191, 198, 204));
        displayFract.setBackground(new Color(32, 39, 49));

        enterNumer.setForeground(new Color(191, 198, 204));
        getNumer.setForeground(new Color(191, 198, 204));
        enterDenom.setForeground(new Color(191, 198, 204));
        getDenom.setForeground(new Color(191, 198, 204));
        returnFract.setForeground(new Color(191, 198, 204));
        displayFract.setForeground(new Color(191, 198, 204));

        panel.setBackground(new Color(25, 30, 36));

        // Position Everything
        layout.putConstraint(SpringLayout.WEST, enterNumer, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, enterNumer, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, getNumer, 5, SpringLayout.EAST, enterNumer);
        layout.putConstraint(SpringLayout.NORTH, getNumer, 10, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, enterDenom, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, enterDenom, 50, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, getDenom, 5, SpringLayout.EAST, enterDenom);
        layout.putConstraint(SpringLayout.NORTH, getDenom, 50, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, convert, 160, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, convert, 100, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, returnFract, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, returnFract, 150, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, displayFract, 10, SpringLayout.EAST, returnFract);
        layout.putConstraint(SpringLayout.NORTH, displayFract, 150, SpringLayout.NORTH, panel);

        f.add(panel);
        f.pack();
        f.setSize(400, 400);
        f.setVisible(true);

    }

}