package com.headfirstjava.chapter12;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Мой рисунок");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}