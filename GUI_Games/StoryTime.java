package GUI_Games;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

class StoryTime {
    static int counter = 0;

    public static void main(String[] args) {

        JFrame f = new JFrame("I Have A Story...");
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Story Time!"));
        SpringLayout layout = new SpringLayout();

        JButton adventure = new JButton("Continue");

        JTextArea display = new JTextArea(16, 48);
        JScrollPane scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        display.setEditable(false);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.append("I have a story... \n Press Continue to begin. \n");

        adventure.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                if (counter == 0) {
                    display.append("\n My name is Jack and I have a story.. here it goes... \n");
                    counter++;

                } else if (counter == 1) {
                    display.append("\n It was a nice Saturday evening and I was texting my friend Alice \n");
                    counter++;

                } else if (counter == 2) {
                    display.append(
                            "\n During our conversation Alice said that she told me about her urge to hug me on Friday but she didn't do it because she was afraid that I might reject her or be awkward about it. \n");
                    counter++;

                } else if (counter == 3) {
                    display.append(
                            "\n I told her that I wouldn't be awkward about it or reject her and I also said that if she wants to hug me she should. \n");
                    counter++;

                } else if (counter == 4) {
                    display.append(
                            "\n Now I'm not exactly sure why she was to hug me especially because she has a boyfriend. \n");
                    counter++;

                } else if (counter == 5) {
                    display.append("\n -Fast forward to right before lunch time on Monday- \n");
                    counter++;

                } else if (counter == 6) {
                    display.append(
                            "\n I start walking down the hallway and I saw Alice and of course I was happy to see her and said hi. \n");
                    counter++;

                } else if (counter == 7) {
                    display.append(
                            "\n Alice says hi and begins walking closer to me and she puts her arms out as if she were to about to hug me. \n");
                    counter++;

                } else if (counter == 8) {
                    display.append(
                            "\n As we get closer we see her boyfriend and quickly act like we were doing something else. \n");
                    counter++;

                } else if (counter == 9) {
                    display.append(
                            "\n We begin walking away from the gym and as we walk Alice says 'Aw you like me don't you?' \n ");
                    counter++;

                } else if (counter == 10) {
                    display.append("\n Of course I said no for obvious reasons. \n");
                    counter++;

                } else if (counter == 11) {
                    display.append(" \nThen I ask her if she likes me.. \n");
                    counter++;

                } else if (counter == 12) {
                    display.append(" \nBefore she answers the bell rings and she leaves to go to her next class. \n");
                    counter++;

                } else if (counter == 13) {
                    display.append("\n As I walk to my next class I see my table partner Samantha. \n");
                    counter++;

                } else if (counter == 14) {
                    display.append("\n Out of nowhere Samantha asks me if I like her.. \n");
                    counter++;

                } else if (counter == 15) {
                    display.append("\n I say no because I didn't and I said I'd tell her who I like. \n");
                    counter++;

                } else if (counter == 16) {
                    display.append(
                            "\n Before I tell her who I like she walks away and I never get to tell her who I like. \n");
                    counter++;

                } else {
                    display.append("\n End of story.");
                }
            }
        });

        panel.add(adventure);
        panel.add(scroll);
        f.add(panel);

        layout.putConstraint(SpringLayout.WEST, adventure, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, adventure, 5, SpringLayout.NORTH, panel);
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