package Naveen_Reddy;

import java.awt.*;
import javax.swing.*;

public class Msain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("setBounds Example");
        frame.setSize(400, 300);
        frame.setLayout(null); // Disable layout manager

        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 30); // Set position and size

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

