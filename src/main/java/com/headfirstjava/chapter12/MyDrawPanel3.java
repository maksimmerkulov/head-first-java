package com.headfirstjava.chapter12;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel3 extends JPanel {
    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Мой рисунок");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel3 panel = new MyDrawPanel3();
        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}