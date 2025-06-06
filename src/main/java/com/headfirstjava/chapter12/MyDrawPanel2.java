package com.headfirstjava.chapter12;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel2 extends JPanel {
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon(getClass().getResource("/catzilla.jpg")).getImage();
        g.drawImage(image, 3, 4, this);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Мой рисунок");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel2 panel = new MyDrawPanel2();
        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}